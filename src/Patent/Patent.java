package Patent;

public class Patent {
	
	private String name;
	private int age;
	private String disease;
	private int bill;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Patent(String name, int age, String disease, int bill, String address) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.bill = bill;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patent [name=" + name + ", age=" + age + ", disease=" + disease + ", bill=" + bill + ", address="
				+ address + "]";
	}
	

}
