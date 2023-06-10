
import java.util.ArrayList;
public class Customer extends User{
	private ArrayList<Flat> flats;
	public Customer(String name, String phone, String email) {
		super(name, phone, email);
		flats=new ArrayList<Flat>();
	}
	@Override
	public void showList() {
		System.out.println("У кошик покупця "+name+" додано "+flats.size()+" квартир:");
		for(Flat flat:flats) {
			System.out.println(flat.getDescription());
		}
		
	}
	public void addFlat(Flat flat) {
		flats.add(flat);
	}
}
