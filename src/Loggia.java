
public class Loggia extends Decorator{
	boolean isGlazed;
	private Premise apartment;

	@Override
	public String getInfo() {
		if(isGlazed) {
			return apartment.getInfo()+" "+"засклена лоджія ";
		}
		else {
			return apartment.getInfo()+" "+"лоджія ";
		}
	}
	@Override
	public double getTotalArea() {
		return apartment.totalArea+this.totalArea;
	}

	Loggia(double totalArea, boolean isGlazed, Premise apartment) {
		super(totalArea);
		this.isGlazed=isGlazed;
		if(!isGlazed) {
			totalArea*=0.3;
		}
		this.apartment=apartment;
	}
}
