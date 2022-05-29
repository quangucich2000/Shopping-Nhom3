package com.nhom3.presentasion.account;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nhom3.entity.User.Address;
import com.nhom3.entity.User.FullName;
import com.nhom3.entity.User.User;
import com.nhom3.logicApplication.IUserDAO;
import com.nhom3.logicApplication.UserDAO;


/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUserDAO userRepository;
	
	/**
	 * @throws ServletException 
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() throws ServletException {
		super.init();
		try {
			userRepository = new UserDAO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		
		try {
			User user = userRepository.login(username, password);
			if(user !=null ) {
				//save cookie
				User fullInforUser = userRepository.getUserByIdAccount(user.getAccount().getId());
				FullName fullName = userRepository.getFullNameById(fullInforUser.getFullName().getId());
				Address address = userRepository.getAddressByID(fullInforUser.getAddress().getId());
				
				addCookie(response, "username", user.getAccount().getUsername().trim());
				addCookie(response, "fullname", fullName.getFirstName()+fullName.getLastName()+fullName.getMiddleName());
				addCookie(response, "address", address.getNumber() + address.getDistrict());
				//addCookie(response, "role", user.getRole().trim());
				response.sendRedirect("http://localhost:8080/Shopping/Home");
			}else { 
				response.sendRedirect("http://localhost:8080/Shopping/login");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void addCookie(HttpServletResponse response, String key, String value) {
		Cookie cookie = new Cookie(key, value);
		response.addCookie(cookie);
	}
}
