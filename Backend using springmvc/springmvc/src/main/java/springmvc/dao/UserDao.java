package springmvc.dao;

import springmvc.entities.User;

public interface UserDao {
	
	public int insert(User user);
	
	public User getUser(String UserId);
	
	public void update(User user);
	
	public User verifyUser(String userId,String password);
	
	public void delete(String userId);

}
