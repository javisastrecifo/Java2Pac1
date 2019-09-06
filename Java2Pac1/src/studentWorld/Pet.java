package studentWorld;

import java.util.ArrayList;

public class Pet {

	private String name;
	private String kindOfAnimal;
	private int age;
	private Date dateOfBirth;
	private ArrayList<String> vaccines;

	public Pet(String kindOfAnimal, String name, int birthYear) {
		this.name = name;
		this.kindOfAnimal = kindOfAnimal;
		this.dateOfBirth = new Date(birthYear);
		this.age = dateOfBirth.calculateAge();
		this.vaccines = new ArrayList<String>();
	}

	public String isAdult() {
		if (this.age > 8) {
			return " is an adult pet.";
		} else if ((this.age < 8) && (this.age > 3)) {
			return " is a young pet.";
		} else {
			return " is a baby pet.";
		}
	}
	
	public void addVaccine(String vaccine) {
		this.vaccines.add(vaccine);
	}
	
	public void add3Vaccines (String vac1, String vac2, String vac3) {
		this.vaccines.add(vac1);
		this.vaccines.add(vac2);
		this.vaccines.add(vac3);
	}

	@Override
	public String toString() {
		String answer = "A " + kindOfAnimal + ", named " + name + ", " + age + " years old.";
		if (this.vaccines.isEmpty()) {
			answer += "\n" + this.name + " had no vaccines.";
		} else {
			answer += "\n" + this.name + " had the following vaccines:";
			for (String v : this.vaccines) {
				answer += "\n > " + v;
			}
		}
		return answer;
	}

	public String getName() {
		return name;
	}

	public String getKindOfAnimal() {
		return kindOfAnimal;
	}

	public int getAge() {
		return age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public ArrayList<String> getVaccines() {
		return vaccines;
	}

}
