

public class Main {

	public static void main(String[] args) {
		Flat flat1 = new Flat(5,250000,"Двокімнатна квартира в Івано-Франківську");
		Flat flat2 = new Flat(9,450000,"Трикімнатна квартира в Івано-Франківську");
		Customer client1 = new Customer("Іваненко Іван","0950297789","ivan@i.ua");
		Realtor realtor1 = new Realtor("Петенко Петро","0687557575","petro@ukr.net",3);
		client1.addFlat(flat1);
		client1.addFlat(flat2);
		realtor1.addClient(client1);
		client1.showList();
		realtor1.showList();
		Premise flat3 = new Flat(1,190000,"Однокімнатна квартира в Івано-Франківську");
		flat3 = new Room(100, false, flat3);
		flat3 = new Balcony(50, false, flat3);
		System.out.println("\nЗагальна площа однокімнатної квартири в Івано-Франківську: "+flat3.getTotalArea());
		System.out.println(flat3.getInfo()+"\n");
		Deal purchase1 = new Purchase();
		purchase1.makeContract(flat1, client1);
		Deal purchase2 = new HirePurchase();
		purchase2.makeContract(flat2, client1);
		PropositionFactory proposition1=new DuringConstructionPropositionFactory();
		Seller builder1=proposition1.getSeller();
		House house1=proposition1.getHouse();
		((Builder) builder1).setName("Blago");
		((HouseDuringConstruction) house1).setStoreys(4);
		((HouseDuringConstruction) house1).setYear_of_accomplishment(2025);
		((HouseDuringConstruction) house1).setSold_flats(15);
		builder1.viewSeller();
		house1.viewHouse();
		PropositionFactory proposition2=new OldHousePropositionFactory();
		Seller owner2=proposition2.getSeller();
		House house2=proposition2.getHouse();
		((Owner) owner2).setName("Павленко Павло");
		((Owner) owner2).setPhone("+380342533295");
		((OldHouse) house2).setStoreys(5);
		owner2.viewSeller();
		house2.viewHouse();
		Director director=new Director();
		director.setBuilder(new ExpensiveRepairBuilder());
		Repair repair1=director.buildRepair();
		System.out.println(repair1);
		director.setBuilder(new CheapRepairBuilder());
		Repair repair2=director.buildRepair();
		System.out.println(repair2);
		}

}
