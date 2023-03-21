package springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="kendra_details")
public class Kendra {
	
	@Id
	@Column(name="kendra_id")
	private String kendraId;
	
	@OneToMany(mappedBy = "kendra")
	private List<Worker> worker;
	
	
	private AddressKendra address;
	
	@Column(name="number_of_workers")
	private int workersCount;
	
	
	
	public List<Worker> getWorker() {
		return worker;
	}

	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}

	public String getKendraId() {
		return kendraId;
	}

	public void setKendraId(String kendraId) {
		this.kendraId = kendraId;
	}

	public AddressKendra getAddress() {
		return address;
	}

	public void setAddress(AddressKendra address) {
		this.address = address;
	}

	public int getWorkersCount() {
		return workersCount;
	}

	public void setWorkersCount(int workersCount) {
		this.workersCount = workersCount;
	}

	

}
