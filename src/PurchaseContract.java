
public class PurchaseContract implements Contract {
	Flat flat;
	Customer customer;

	@Override
	public void viewContract() {
		System.out.println("Покупець "+customer.getName()+" купив квартиру "+flat.getDescription()+" ціною "+flat.getPrice()+" грн.");

	}

	PurchaseContract(Flat flat, Customer customer) {
		super();
		this.flat = flat;
		this.customer = customer;
	}

}
