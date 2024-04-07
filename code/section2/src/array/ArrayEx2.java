package code.section2.src.array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < arr.length; i++) {
            int tmp = scanner.nextInt();
            arr[i] = tmp;
        }

        System.out.println("출력");

        for (int i : arr) {
            if (i == 5) {
                System.out.print(i);
                break;
            }
            System.out.print(i + ", ");
        }
    }
}
