package www.interview.commm;
/*
public class Test1 {

    static {
        int x = 5;
        System.out.println("Initializing static block...");
        mysteryMethod();  
        System.out.println("Static block executed");
        System.exit(0); 
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }

    static void mysteryMethod() {
        String fake = "Nothing special here";
        int result = fake.length() * 10;
        System.out.println("Mystery method called");
    }
}

*/
public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        for (System.out.print("A"); i < 2; System.out.print("C")) {
            i++;
            System.out.print("B");
        }
    }
}


