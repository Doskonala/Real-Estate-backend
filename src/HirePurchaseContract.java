
public class HirePurchaseContract implements Contract{
	Flat flat;
	Customer customer;
	int years;

	@Override
	public void viewContract() {
		System.out.println("Покупець "+customer.getName()+" купив квартиру "+flat.getDescription()+" ціною "+flat.getPrice()+" грн на виплат на "+years+" років.\n");
		
	}

	HirePurchaseContract(Flat flat, Customer customer, int years) {
		super();
		this.flat = flat;
		this.customer = customer;
		this.years = years;
	}

}
