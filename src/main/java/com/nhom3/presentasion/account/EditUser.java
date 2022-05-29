package com.nhom3.presentasion.account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nhom3.entity.User.User;
import com.nhom3.logicApplication.IUserDAO;
import com.nhom3.logicApplication.UserDAO;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/editUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1;
	private IUserDAO userRepository;
       
    /**
     * @throws ServletException 
     * @see HttpServlet#HttpServlet()
     */
    public EditUser() throws ServletException {
    	super.init();
		try {
			userRepository = new UserDAO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			showEditForm(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userRepository.getUserByID(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}
}
