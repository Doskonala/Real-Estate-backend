
public class Terrace extends Decorator{
	private Premise apartment;
	
	@Override
	public String getInfo() {
		return apartment.getInfo()+" "+"тераса ";
	}

	@Override
	public double getTotalArea() {
		return apartment.totalArea+this.totalArea;
	}

	Terrace(double totalArea, Premise apartment) {
		super(totalArea);
		this.totalArea*=0.3;
		this.apartment=apartment;
	}
	
}
