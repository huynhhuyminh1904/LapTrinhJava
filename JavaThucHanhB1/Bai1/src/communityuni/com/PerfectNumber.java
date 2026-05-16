package communityuni.com;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Tìm GCD
        System.out.print("a) Nhập a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Ước số chung lớn nhất: " + findGCD(a, b));

        // 2. Kiểm tra số hoàn thiện
        System.out.print("b) Nhập n để kiểm tra số hoàn thiện: ");
        int nPerfect = sc.nextInt();
        if (isPerfectNumber(nPerfect)) {
            System.out.println(nPerfect + " là số hoàn thiện.");
        } else {
            System.out.println(nPerfect + " không phải là số hoàn thiện.");
        }

        // 3. Kiểm tra chữ số toàn chẵn
        System.out.print("c) Nhập n để kiểm tra các chữ số: ");
        int nEven = sc.nextInt();
        if (isAllDigitsEven(nEven)) {
            System.out.println("Tất cả chữ số của " + nEven + " đều là số chẵn.");
        } else {
            System.out.println(nEven + " có chứa chữ số lẻ.");
        }

        // 4. Tính tổng S(x, n)
        System.out.print("d) Nhập x và n để tính S(x, n): ");
        double x = sc.nextDouble();
        int nSum = sc.nextInt();
        System.out.println("Kết quả S(x, n) = " + calculateS(x, nSum));
    }

    // a) Tìm ước số chung lớn nhất (Sử dụng thuật toán Euclid)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // b) Kiểm tra số hoàn thiện
    public static boolean isPerfectNumber(int n) {
        if (n <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // c) Kiểm tra các chữ số có toàn là số chẵn không
    public static boolean isAllDigitsEven(int n) {
        n = Math.abs(n); // Xử lý cả số âm
        if (n == 0) return true;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }

    // d) Tính S(x, n) = x + x^3/3! + x^5/5! + ... + x^(2n+1)/(2n+1)!
    public static double calculateS(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            int mu = 2 * i + 1;
            sum += Math.pow(x, mu) / factorial(mu);
        }
        return sum;
    }

    // Hàm phụ tính giai thừa cho câu d
    public static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}