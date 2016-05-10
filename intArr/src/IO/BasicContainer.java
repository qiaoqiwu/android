package IO;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class BasicContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection c = new HashSet();
		c.add("hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(100));
		c.remove("hello");
		c.remove(new Integer(100));
		System.out.println(c.remove(new Name("f1","l1")));
		System.out.println(c);
		
		List l1 = new LinkedList();
		l1.add(new Name("karl","m"));
		l1.add(new Name("steven","lee"));
		l1.add(new Name("john","o"));
		l1.add(new Name("tom","m"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

static class Name implements Comparable {
	private String firstName, lastName;
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	public int hashCode() {
		return firstName.hashCode();
	}
	
	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
}

}
