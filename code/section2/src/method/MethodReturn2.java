package code.section2.src.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);

    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 입장불가합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요.");
    }
}
