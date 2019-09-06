package studentWorld;

public class Student extends Person {
	private String username;
	private String password;
	private double accessMark;

	public Student(String name, String surname, int birthDay, int birthMonth, int birthYear, double mark) {
		super(name, surname, birthDay, birthMonth, birthYear);
		this.username = super.getName().toLowerCase() + super.getSurname().toLowerCase();
		this.password = super.getSurname() + birthYear;
		this.accessMark = mark;
	}
	
	public Student(String name, String surname, int birthYear, double mark) {
		super(name, surname, birthYear);
		this.username = super.getName().toLowerCase() + super.getSurname().toLowerCase();
		this.password = super.getSurname() + birthYear;
		this.accessMark = mark;
	}

	@Override
	public String toString() {
		String answer = super.toString();
		answer += "Their University access marks were " + this.accessMark + ".";
		answer += "\nTheir username is '" + this.username + "' and password '" + this.password + "'.";
		answer += "\n------\n";
		return answer;
	}

	public String getName() {
		return super.getName();
	}

	public String getSurname() {
		return super.getSurname();
	}

	public Date getDateOfBirth() {
		return super.getDateOfBirth();
	}

	public int getAge() {
		return super.getAge();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
