package code.section2.src.method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum = add(5, 10);

        System.out.println("sum = " + sum);

    }

    public static int add(int a, int b) {
        return a + b;
    }

}
