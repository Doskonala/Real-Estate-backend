
public class CheapRepairBuilder extends RepairBuilder {

	@Override
	public void buildCondition() {
		repair.setCondition("дешевий");

	}

	@Override
	public void buildFloor() {
		repair.setFloor(Floor.лінолеум);

	}

	@Override
	public void buildWindows() {
		repair.setWindows(Windows.металопластикові);

	}

}
