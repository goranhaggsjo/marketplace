package se.gozacke.user;

import java.util.List;

public interface UserRepository {
	public List<User> getAllUsers();
	public List<User> getUserOnUserId(int userId);
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public boolean validateUsernameAndPassword(String username, String password);
}