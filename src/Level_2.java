import java.util.Scanner;

public class Level_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int first = input % 10;
        int second = input / 10 % 10;
        int third = input / 100;

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}