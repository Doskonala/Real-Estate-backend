
public class Director {
	RepairBuilder builder;

	public void setBuilder(RepairBuilder builder) {
		this.builder = builder;
	}
	Repair buildRepair() {
		builder.createRepair();
		builder.buildCondition();
		builder.buildFloor();
		builder.buildWindows();
		Repair repair=builder.getRepair();
		return repair;
	}
}
