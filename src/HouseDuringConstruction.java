
public class HouseDuringConstruction implements House {
	private int storeys;
	private int year_of_accomplishment;
	private int sold_flats;
	@Override
	public void viewHouse() {
		System.out.println(storeys+"-поверховий будинок, будівництво якого завершиться в "+year_of_accomplishment+" році. "+sold_flats+" квартир вже продано.");
	}
	public int getStoreys() {
		return storeys;
	}
	public void setStoreys(int storeys) {
		this.storeys = storeys;
	}
	public int getYear_of_accomplishment() {
		return year_of_accomplishment;
	}
	public void setYear_of_accomplishment(int year_of_accomplishment) {
		this.year_of_accomplishment = year_of_accomplishment;
	}
	public int getSold_flats() {
		return sold_flats;
	}
	public void setSold_flats(int sold_flats) {
		this.sold_flats = sold_flats;
	}
}
