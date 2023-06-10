
public abstract class RepairBuilder {
	Repair repair;
	public void createRepair() {
		repair=new Repair();
	}
	public Repair getRepair() {
		return repair;
	}
	public abstract void buildCondition();
	public abstract void buildFloor();
	public abstract void buildWindows();
}
