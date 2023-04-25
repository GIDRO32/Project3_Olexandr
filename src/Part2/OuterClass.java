package Part2;
public class OuterClass {
    private String message = "Hello from OuterClass!";

    public class InnerClass {
        public void displayMessage() {
            System.out.println(message);
        }
    }

    public void displayInnerClassMessage() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public void displayLocalClassMessage() {
        class LocalClass {
            public void displayMessage() {
                System.out.println(message);
            }
        }

        LocalClass local = new LocalClass();
        local.displayMessage();
    }
    public interface Greeting
    {
        public void greet();
    }
}


class Main {
    public static void main(String[] args) {
        OuterClass.Greeting greeting = new OuterClass.Greeting() {
            public void greet() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        OuterClass outer = new OuterClass();
        outer.displayInnerClassMessage();
        OuterClass outer2 = new OuterClass();
        outer2.displayLocalClassMessage();
        greeting.greet();
    }
}

