package springmvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class Product {
	@Id
	@Column(name = "product_id")
	private String productId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "product_name")
	private String ProductName;

	@Column(name = "product_class")
	private String classOfProduct;

	@Column(name = "plastic_type")
	private String typeOfPlastic;

	@Column(name = "best_practices" ,length=500)
	
	private String bestPractices;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getClassOfProduct() {
		return classOfProduct;
	}

	public void setClassOfProduct(String classOfProduct) {
		this.classOfProduct = classOfProduct;
	}

	public String getTypeOfPlastic() {
		return typeOfPlastic;
	}

	public void setTypeOfPlastic(String typeOfPlastic) {
		this.typeOfPlastic = typeOfPlastic;
	}

	public String getBestPractices() {
		return bestPractices;
	}

	public void setBestPractices(String bestPractices) {
		this.bestPractices = bestPractices;
	}

}
