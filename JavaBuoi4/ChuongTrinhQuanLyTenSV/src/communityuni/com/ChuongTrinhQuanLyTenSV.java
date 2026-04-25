package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChuongTrinhQuanLyTenSV {

	public static void main(String[] args) {
		ArrayList<String> dsSV = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n========= MENU QUẢN LÝ TÊN SINH VIÊN =========");
			System.out.println("a) Thêm Sinh viên");
			System.out.println("b) Xuất danh sách sinh viên");
			System.out.println("c) Sửa Sinh Viên");
			System.out.println("d) Xóa Sinh viên chứa tên bất kỳ");
			System.out.println("e) Tìm Sinh viên mà tên có chữ An");
			System.out.println("f) Sắp xếp Sinh Viên");
			System.out.println("g) Xuất ra số lượng sinh viên");
			System.out.println("h) Thoát chương trình");
			System.out.print("Mời bạn chọn: ");
			
			String chon = sc.nextLine().toLowerCase();

			if (chon.equals("h")) {
				System.out.println("Đã thoát chương trình!");
				break;
			}

			switch (chon) {
				case "a":
					System.out.print("Nhập tên SV: ");
					dsSV.add(sc.nextLine());
					break;
				case "b":
					System.out.println("Danh sách SV: " + dsSV);
					break;
				case "c":
					System.out.print("Nhập vị trí cần sửa (từ 0): ");
					int index = Integer.parseInt(sc.nextLine());
					if (index >= 0 && index < dsSV.size()) {
						System.out.print("Nhập tên mới: ");
						dsSV.set(index, sc.nextLine());
					}
					break;
				case "d":
					System.out.print("Nhập tên chính xác muốn xóa: ");
					dsSV.remove(sc.nextLine());
					break;
				case "e":
					System.out.println("Các SV có tên chứa 'An':");
					for (String ten : dsSV) {
						if (ten.toLowerCase().contains("an")) System.out.println(ten);
					}
					break;
				case "f":
					Collections.sort(dsSV);
					System.out.println("Đã sắp xếp xong.");
					break;
				case "g":
					System.out.println("Số lượng sinh viên: " + dsSV.size());
					break;
				default:
					System.out.println("Vui lòng chọn từ a đến h!");
			}
		}
		sc.close();
	}
}