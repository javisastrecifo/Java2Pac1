package studentWorld;

import java.util.ArrayList;

public class Person {
	private String name;
	private String surname;
	private Date dateOfBirth;
	private int age;
	private ArrayList<Pet> petList;

	public Person(String name, String surname, int birthDay, int birthMonth, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(birthDay, birthMonth, birthYear);
		this.age = this.dateOfBirth.calculateAge();
		this.petList = new ArrayList<Pet>();
	}

	public Person(String name, String surname, int year) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(year);
		this.age = this.dateOfBirth.calculateAge();
		this.petList = new ArrayList<Pet>();
	}

	public String isAdult() {
		if (this.age > 17) {
			return " is an adult.";
		} else {
			return " is underage.";
		}
	}

	public Pet addPet(String kind, String name, int yearOfBirth) {
		Pet p = new Pet(kind, name, yearOfBirth);
		this.petList.add(p);
		return p;
	}
	
	public static String printPetList(ArrayList<Pet> petList, String name) {
		String answer = "";
		if (!petList.isEmpty()) {
			answer += name + " has the following pets:\n";
			for (Pet p : petList) {
				answer += p.toString();
				answer += "\n------\n";
			}
		} else {
			answer += name + " has no pets.\n";
		}
		return answer;
	}

	@Override
	public String toString() {
		String answer = "This person is " + getName() + " " + getSurname() + ".";
		answer += "\nThey were born on the " + getDateOfBirth().toString() + ".";
		answer += "\n" + this.getName() + " is " + this.age + " years old and" + isAdult();
		answer += "\n------\n";
		answer += printPetList(this.petList, this.name);
		return answer;
	}
	
	

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}

}
