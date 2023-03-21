package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.entities.User;


public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(User user) {
		
		this.hibernateTemplate.persist(user);
		return 1;
	}

	public User getUser(String userId) {
		User user=this.hibernateTemplate.get(User.class,userId);
		return user;
	}
	
	
	public User verifyUser(String userId,String password) {
		User user=this.hibernateTemplate.get(User.class,userId);
		if(user.getPassword().equals(password)) {
			return user;
		}
		else {
			return null;
		}
		
	}

	@Transactional
	public void update(User user) {
		this.hibernateTemplate.update(user);
		
	}

	@Transactional
	public void delete(String userId) {
		User user=this.hibernateTemplate.get(User.class,userId);
		this.hibernateTemplate.delete(user);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
