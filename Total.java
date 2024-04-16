import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // Kiểm tra số chẵn
                sum += i; // Thêm số chẵn vào tổng
            }
        }

        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + sum);
    }
}