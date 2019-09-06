package studentWorld;

public class Main {

	public static void main(String[] args) {

		Student laia = new Student("Laia", "Vila", 2, 11, 1993, 8.4);
		laia.addPet("dog", "Nina", 2005).add3Vaccines("Dog Vaccine 1", "Dog Vaccine 2", "Dog Vaccine 3");
		laia.addPet("cat", "Maula", 2011);
		Apartment aLaia = new Apartment (laia,"Barcelona", "Torrent de l'Olla 196", 110, 4, 1200);
		
		Person josh = new Student("Josh", "Bradson", 3, 05, 1989, 6.7);
		
		Person jane = new Person("Jane", "Austen", 16, 12, 1775);
		jane.addPet("cat", "Brit", 1796);
		Apartment aJane = new Apartment (jane, "Winchester", "Church St. 1", 80, 1, 2500);
		

		System.out.print(laia);
		System.out.print(aLaia);
		System.out.print("\n\n******************\n\n");
		System.out.print(josh);
		System.out.print("\n\n******************\n\n");
		System.out.print(jane);
		System.out.print(aJane);
	}

}
