package base;
public class Customer {
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", country=" + country
				+ ", city=" + city + ", creditLimit=" + creditLimit
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + "]";
	}

	private Integer id;
	private String name;
	private String country;
	private String city;
	private Double creditLimit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
}