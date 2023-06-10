
public class OldHouse implements House {
	private int storeys;
	@Override
	public void viewHouse() {
		System.out.println("Купити квартиру в "+storeys+"-поверховому будинку.\n");
	}
	public int getStoreys() {
		return storeys;
	}
	public void setStoreys(int storeys) {
		this.storeys = storeys;
	}

}
