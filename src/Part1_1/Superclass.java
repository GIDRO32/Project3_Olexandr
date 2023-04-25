package Part1_1;

public class Superclass {
    public void theMethod() {
        System.out.println("Method of Superclass");
    }
}

class Subclass extends Superclass {
    @Override
    public void theMethod() {
        System.out.println("Method of Subclass");
    }
}

class Main {
    public static void main(String[] args) {
        Superclass a = new Subclass();
        a.theMethod(); // will call theMethod of Subclass
    }
}