package code.section2.src.array;

public class ArrayRef4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화





        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "점수: " + students[i]);
        }
    }
}
