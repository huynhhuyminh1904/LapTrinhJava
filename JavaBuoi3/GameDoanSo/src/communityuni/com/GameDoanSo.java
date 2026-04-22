package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String tiepTuc;

		do {
			int soMayMan = rd.nextInt(101); // Máy chọn số [0..100]
			int soLanDoan = 0;
			int phepThuToiDa = 7;
			boolean daThang = false;

			System.out.println("\n--- GAME ĐOÁN SỐ (0-100) ---");
			System.out.println("Bạn có tối đa 7 lượt đoán. Chúc may mắn!");

			while (soLanDoan < phepThuToiDa) {
				soLanDoan++;
				System.out.print("Lượt " + soLanDoan + " - Nhập số đoán: ");
				int soNguoiChoi = sc.nextInt();

				if (soNguoiChoi == soMayMan) {
					System.out.println("Quá đỉnh! Bạn đoán đúng rồi.");
					daThang = true;
					break;
				} else if (soNguoiChoi < soMayMan) {
					System.out.println("Số bạn chọn NHỎ HƠN số máy.");
				} else {
					System.out.println("Số bạn chọn LỚN HƠN số máy.");
				}

				if (soLanDoan == phepThuToiDa) {
					System.out.println("Game Over nha thím! Số đúng là: " + soMayMan);
				}
			}

			System.out.print("Bạn có muốn chơi tiếp không? (c/k): ");
			sc.nextLine(); // Tránh trôi lệnh
			tiepTuc = sc.nextLine();

		} while (tiepTuc.equalsIgnoreCase("c"));

		System.out.println("Tạm biệt!");
		sc.close();
	}
}
