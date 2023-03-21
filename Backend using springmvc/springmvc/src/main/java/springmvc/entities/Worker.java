package springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="worker_details")
public class Worker {
	
	@Id
	private String workerId;
	
	@ManyToOne
	private Kendra kendra;
	
	private String workerName;
	
	private int age;

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public Kendra getKendra() {
		return kendra;
	}

	public void setKendra(Kendra kendra) {
		this.kendra = kendra;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
