package arrays;

interface One {
    static void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method () {
        System.out.println("One");
    }
}

class Example3 implements One, Two {
	static int count = 0;
	public static void main(String[] args) {
		if (count < 3) {
			count++;
			main(null);
		} else {
			return;
		}
		System.out.println("Hello World!");
	}
}
