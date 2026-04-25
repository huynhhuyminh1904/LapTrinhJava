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
			System.out.println("e) Tìm Sinh viên mà tên là 'An'");
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
					System.out.print("Nhập họ và tên SV: ");
					dsSV.add(sc.nextLine());
					System.out.println("Đã thêm thành công.");
					break;

				case "b":
					if (dsSV.isEmpty()) {
						System.out.println("Danh sách hiện đang trống.");
					} else {
						System.out.println("Danh sách SV hiện có:");
						for (int i = 0; i < dsSV.size(); i++) {
							System.out.println((i + 1) + ". " + dsSV.get(i));
						}
					}
					break;

				case "c":
					System.out.print("Nhập vị trí cần sửa (STT từ danh sách): ");
					try {
						int index = Integer.parseInt(sc.nextLine()) - 1;
						if (index >= 0 && index < dsSV.size()) {
							System.out.print("Nhập tên mới: ");
							dsSV.set(index, sc.nextLine());
							System.out.println("Đã cập nhật xong.");
						} else {
							System.out.println("Vị trí không tồn tại.");
						}
					} catch (Exception e) {
						System.out.println("Lỗi: Vui lòng nhập số thứ tự hợp lệ.");
					}
					break;

				case "d":
					System.out.print("Nhập chính xác tên muốn xóa: ");
					String tenXoa = sc.nextLine();
					if (dsSV.remove(tenXoa)) {
						System.out.println("Đã xóa thành công sinh viên: " + tenXoa);
					} else {
						System.out.println("Không tìm thấy tên '" + tenXoa + "' để xóa.");
					}
					break;

				case "e":
					boolean found = false;
					System.out.println("Kết quả tìm kiếm sinh viên tên 'An':");
					for (String hoTen : dsSV) {
						String hoTenTrim = hoTen.trim();
						int lastSpace = hoTenTrim.lastIndexOf(" ");
						String tenRieng;
						
						if (lastSpace == -1) {
							tenRieng = hoTenTrim;
						} else {
							tenRieng = hoTenTrim.substring(lastSpace + 1);
						}

						if (tenRieng.equalsIgnoreCase("An")) {
							System.out.println("- " + hoTen);
							found = true;
						}
					}
					if (!found) {
						System.out.println("=> Không tìm thấy sinh viên nào có tên là 'An'.");
					}
					break;

				case "f":
					Collections.sort(dsSV);
					System.out.println("Đã sắp xếp danh sách theo thứ tự A-Z.");
					break;

				case "g":
					System.out.println("Tổng số lượng sinh viên: " + dsSV.size());
					break;

				default:
					System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
			}
		}
		sc.close();
	}
}
