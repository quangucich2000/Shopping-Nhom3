package com.nhom3.logicApplication;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.nhom3.entity.User.User;


public interface IUserRepository {
	List<User> getListUsers() throws SQLException, IOException, ClassNotFoundException;

	User getUserByID(int id) throws Exception;

	void createUser(String username, String password, String firstName, String lastName) throws Exception;

	void updateUserByID(int id, String password, String firstName, String lastName) throws Exception;

	void deleteUser(int id) throws Exception;

	boolean isUserExists(String username) throws ClassNotFoundException, SQLException, IOException;

	boolean isUserExists(int id) throws ClassNotFoundException, SQLException, IOException;

	User login(String username, String password) throws ClassNotFoundException, SQLException, IOException;

}
