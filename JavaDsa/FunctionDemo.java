//Functions

public class FunctionDemo {

    static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    static int addNumbers(int a, int b) {
        // return a + b;
        // char c = 'A';
        // System.out.println(c);
        char c = 90;
        return c; // ASCII
    }

    static String returnMyName() {
        String a = "Yash";
        int v = 90;
        return a;
    }

    static void printName() {
        System.out.println("Yash");
    }

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c = a + b;
        // System.out.println(c);
        // int d = 20;
        // int e = 30;
        // int f = d + e;
        // System.out.println(f);
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // addTwoNumbers(a, b);
        // addTwoNumbers(20, 30);
        // System.out.println(addNumbers(10, 20));
        // System.out.println(addNumbers(10, 20));
        // String name = returnMyName();
        // String nameUpperCase = name.toUpperCase();
        // System.out.println(nameUpperCase);
        System.out.println(addNumbers(10, 20));
    }
}