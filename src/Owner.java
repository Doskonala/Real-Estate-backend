
public class Owner implements Seller {
	private String name;
	private String phone;
	@Override
	public void viewSeller() {
		System.out.println("Поточний власник: "+name+". Звертатися за телефоном "+phone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
