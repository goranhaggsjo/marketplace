package se.gozacke.user;

import java.util.List;

public interface UserRepository {
	public List<User> getAllUsers();
	public Boolean login(String myUser, String myPassword, UserRepository users);
}