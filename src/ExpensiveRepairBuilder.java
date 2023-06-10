
public class ExpensiveRepairBuilder extends RepairBuilder {

	@Override
	public void buildCondition() {
		repair.setCondition("дорогий");

	}

	@Override
	public void buildFloor() {
		repair.setFloor(Floor.паркет);

	}

	@Override
	public void buildWindows() {
		repair.setWindows(Windows.шумозахисні);

	}

}
