
public class Purchase extends Deal {

	@Override
	Contract createContract(Flat flat,Customer customer) {
		return new PurchaseContract(flat, customer);
	}

}
