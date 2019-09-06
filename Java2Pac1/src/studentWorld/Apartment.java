package studentWorld;

public class Apartment {

	private String address;
	private int squareMeters;
	private String city;
	private double monthRent;
	private int flatMates;
	private Person owner;

	public Apartment(Person owner, String city, String address, int size, int friends, double rent) {
		this.city = city;
		this.address = address;
		this.squareMeters = size;
		this.monthRent = rent;
		this.flatMates = friends;
		this.owner = owner;
	}

	public static double rentPerPerson(int friends, double rent) {
		return rent / (double) friends;
	}

	public String toString() {
		String answer = this.owner.getName() + " lives in an apartment on " + this.address + ", in " + this.city + ".";
		answer += "\nIt is " + this.squareMeters + " square meters big and costs " + this.monthRent + " per month.";
		if (this.flatMates > 1) {
			answer += "\n" + this.owner.getName() + " shares it with " + (this.flatMates - 1)
					+ " others, each one paying " + rentPerPerson(this.flatMates, this.monthRent) + " per month.";
		}
		return answer;
	}

	public String getAddress() {
		return address;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public String getCity() {
		return city;
	}

	public double getMonthRent() {
		return monthRent;
	}

	public int getFlatMates() {
		return flatMates;
	}

}
