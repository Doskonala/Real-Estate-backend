
public class Balcony extends Decorator{
	boolean isGlazed;
	private Premise apartment;
	
	@Override
	public String getInfo() {
		if(isGlazed) {
			return apartment.getInfo()+" "+"засклений балкон ";
		}
		else {
			return apartment.getInfo()+" "+"балкон ";
		}
	}

	@Override
	public double getTotalArea() {
		return apartment.totalArea+this.totalArea;
	}

	Balcony(double totalArea, boolean isGlazed, Premise apartment) {
		super(totalArea);
		this.isGlazed=isGlazed;
		if(isGlazed) {
			totalArea*=0.8;
		}
		else {
			totalArea*=0.3;
		}
		this.apartment=apartment;
	}
	
}
