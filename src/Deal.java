
public abstract class Deal {
	public void makeContract(Flat flat, Customer customer) {
		 Contract contract = createContract(flat, customer);
		 contract.viewContract();
		 }
		 abstract Contract createContract(Flat flat,Customer customer);
}
