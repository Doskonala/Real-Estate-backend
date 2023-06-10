
public class DuringConstructionPropositionFactory implements PropositionFactory {

	@Override
	public House getHouse() {
		return new HouseDuringConstruction();
	}

	@Override
	public Seller getSeller() {
		return new Builder();
	}

}
