package studentWorld;

public class Student extends Person {
	private String name;
	private String surname;
	private Date dateOfBirth;
	private int age;
	private String username;
	private String password;

	public Student(String name, String surname, int birthDay, int birthMonth, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = new Date(birthDay, birthMonth, birthYear);
		this.age = this.dateOfBirth.calculateAge();
		this.username = this.name.toLowerCase() + this.surname.toLowerCase();
		this.password = this.surname + birthYear;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.surname + ", with username " + this.username + ", and born on the " + this.dateOfBirth.toString();
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

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
