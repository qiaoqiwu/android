class Animal {
	private String name;
	Animal(String name) {
		this.name = name;
	}
	public void enjoy() {
		System.out.println("screen...");
	}

}

class Cat extends Animal {
	private String eyesColor;
	Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}
	public void enjoy() {
		System.out.println("cat screen...");
	}
}

class Dog extends Animal {
	private String furColor;
	Dog(String n, String c) {
		super(n);
		furColor = c;
	}
	public void enjoy() {
		System.out.println("dog screen...");
	}
}

class Bird extends Animal {
	Bird() {
		super("bird");
	}
	public void enjoy() {
		System.out.println("bird screen...");
	}
}

class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		//Bird b = new Bird();
		Animal a  = new Bird();
		Animal a1 = new Animal("animal");
		Lady l1 = new Lady("l1",c);
		Lady l2 = new Lady("l2",d);
		Lady l3 = new Lady("l3",a);
		Lady l4 = new Lady("l4",a1);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
		l4.myPetEnjoy();

	}
}
