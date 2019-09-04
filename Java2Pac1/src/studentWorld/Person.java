package studentWorld;

public abstract class Person {
	private String name;
	private String surname;
	private Date dateOfBirth;
	private int age;

	public Person(String name, String surname, int birthDay, int birthMonth, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(birthDay, birthMonth, birthYear);
		this.age = this.dateOfBirth.calculateAge();
	}

	public boolean isAdult() {
		if (this.age > 17) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.name + " " + this.surname + ", born on the " + this.dateOfBirth.toString();
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
