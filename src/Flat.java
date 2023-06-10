
public class Flat extends Premise{
	private int floor;
	private double price;
	private String description;
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Flat(int floor, double price, String description) {
		super();
		this.floor = floor;
		this.price = price;
		this.description=description;
	}
	@Override
	public double getTotalArea() {
		return totalArea;
	}
}