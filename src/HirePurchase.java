import java.util.Scanner;
public class HirePurchase extends Deal {

	@Override
	Contract createContract(Flat flat, Customer customer) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "Термін розстрочки: " );
	    int years = sc.nextInt();
	    sc.close();
		return new HirePurchaseContract(flat,customer,years);
	}

}
