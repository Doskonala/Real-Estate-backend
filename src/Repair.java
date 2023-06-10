public class Repair {
	private String condition;
	private Floor floor;
	private Windows windows;
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	public void setWindows(Windows windows) {
		this.windows = windows;
	}
	@Override
	public String toString() {
		return "Стан ремонту: "+condition+". Підлога: "+floor+". Вікна: "+ windows+".";
	}
}
