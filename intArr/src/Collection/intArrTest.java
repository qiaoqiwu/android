package Collection;

public class intArrTest {
	int a;
	int b;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		intArrTest tom = new intArrTest(1,25);
		intArrTest mike = new intArrTest(1,25);
		Dog dog = new Dog();
		String s1 = new String("s1");
		String s2 = new String("s1");
 		System.out.println(dog);
 		System.out.println(s1.equals(s2));
 		System.out.println(tom.equals(mike));
	}
	intArrTest(int i, int j){
		a = i;
		b = j;
		}
	
	public boolean equals(Object obj) {
		intArrTest iat = (intArrTest) obj;
		if (iat.a == this.a && iat.b == this.b) {
			return true;
		}
		else {
			return false;
		}
	}
	
static class Dog {
	public String toString() {
		return "hello";
	}
}
	 
}

