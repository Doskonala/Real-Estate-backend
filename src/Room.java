
public class Room extends Decorator{
	boolean isService;
	Premise apartment;

	@Override
	public String getInfo() {
		if(isService) {
			return apartment.getInfo()+" "+"службова кімната ";
		}
		else {
			return apartment.getInfo()+" "+"житлова кімната ";
		}
	}
	@Override
	public double getTotalArea() {
		return apartment.totalArea+this.totalArea;
	}

	Room(double totalArea, boolean isService, Premise apartment) {
		super(totalArea);
		this.isService=isService;
		this.apartment=apartment;
	}
}
