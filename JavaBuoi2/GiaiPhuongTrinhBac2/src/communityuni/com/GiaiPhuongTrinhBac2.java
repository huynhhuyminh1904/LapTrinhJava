package communityuni.com;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		// 1. Nhập dữ liệu a, b, c
		System.out.println("Giải phương trình ax^2 + bx + c = 0");
		System.out.print("Nhập a: ");
		double a = new Scanner(System.in).nextDouble();
		System.out.print("Nhập b: ");
		double b = new Scanner(System.in).nextDouble();
		System.out.print("Nhập c: ");
		double c = new Scanner(System.in).nextDouble();

		// 2. Biện luận theo lưu đồ
		if (a == 0) {
			// Giải pt bậc 1: bx + c = 0
			if (b == 0) {
				if (c == 0) {
					System.out.println("PT Vô số nghiệm");
				} else {
					System.out.println("PT Vô nghiệm");
				}
			} else {
				double x = -c / b;
				System.out.println("PT có 1 nghiệm x = " + x);
			}
		} else {
			// Giải pt bậc 2
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("PT Vô nghiệm");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("PT có nghiệm kép x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("PT có 2 nghiệm phân biệt:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
