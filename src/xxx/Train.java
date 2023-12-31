package xxx;

import java.util.*;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private int price;

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int number, String type, String start, String dest, int price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	// TreeSet比大小要改這個
	public int compareTo(Train o) {
		if (this.number < o.number) {
			return 1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return -1;
		}

	}

	public void getTrain() {

		System.out.println(number + "," + type + "," + start + "," + dest + "," + price);

	}

}