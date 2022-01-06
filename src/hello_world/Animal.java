package hello_world;

class Animal {
	public void bark() {
		System.out.println("woof ");
	}
}

class Hound extends Animal {
	public void sniff() {
		System.out.println("sniff ");
	}

	@Override
	public void bark() {
		System.out.println("bowl");
	}
}

class Cow extends Animal {
	@Override
	public void bark() {
		System.out.println("Baaaa");
	}
}

class OverridingTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.bark();
	}
}

/*
 * 
 * Assignment =========== --> customer object Array operations
 * 
 * 
 * Reading input & print the output
 * 
 * 
 * customer_id cuatomer_name customer_address
 * ------------------------------------------------------- 10 rajesh NJ 20
 * ramesh NY 30 harish NY
 */