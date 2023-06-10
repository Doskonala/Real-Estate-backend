
public class OldHousePropositionFactory implements PropositionFactory {

	@Override
	public House getHouse() {
		return new OldHouse();
	}

	@Override
	public Seller getSeller() {
		return new Owner();
	}

}
