package springmvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userDetails")
public class User {
	@Id
	@Column(name="user_id")
	private String userId;
	
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_phone")
	private String phone;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="user_address")
	private String address;
	
	
	private int pointsEarned;
	private int moneyEarned;
	private int currentCollection;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public int getMoneyEarned() {
		return moneyEarned;
	}
	public void setMoneyEarned(int moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	public int getCurrentCollection() {
		return currentCollection;
	}
	public void setCurrentCollection(int currentCollection) {
		this.currentCollection = currentCollection;
	}
	
	
	
	

}
