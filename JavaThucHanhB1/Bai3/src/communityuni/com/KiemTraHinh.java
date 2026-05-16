package communityuni.com;

import java.util.Scanner;

public class KiemTraHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập số liệu cho Hình Chữ Nhật
        System.out.println("--- NHẬP HÌNH CHỮ NHẬT ---");
        System.out.print("Nhập màu: ");
        String mauHCN = sc.nextLine();
        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();
        sc.nextLine();

        HinhChuNhat hcn = new HinhChuNhat(mauHCN, dai, rong);

        // 2. Nhập số liệu cho Hình Tròn
        System.out.println("\n--- NHẬP HÌNH TRÒN ---");
        System.out.print("Nhập màu: ");
        String mauHT = sc.nextLine();
        System.out.print("Nhập bán kính: ");
        double r = sc.nextDouble();
        sc.nextLine();

        HinhTron ht = new HinhTron(mauHT, r);

        // 3. Nhập số liệu cho Hình Vuông
        System.out.println("\n--- NHẬP HÌNH VUÔNG ---");
        System.out.print("Nhập màu: ");
        String mauHV = sc.nextLine();
        System.out.print("Nhập cạnh: ");
        double canh = sc.nextDouble();

        HinhVuong hv = new HinhVuong(mauHV, canh);

        // --- XUẤT KẾT QUẢ ---
        System.out.println("\n===============================");
        System.out.println("KẾT QUẢ SAU KHI TÍNH TOÁN:");
        
        System.out.println(hcn.LayThongTin());
        System.out.printf("S: %.2f | P: %.2f\n", hcn.TinhDienTich(), hcn.TinhChuVi());

        System.out.println("\n" + ht.LayThongTin());
        System.out.printf("S: %.2f | P: %.2f\n", ht.TinhDienTich(), ht.TinhChuVi());

        System.out.println("\n" + hv.LayThongTin());
        System.out.printf("S: %.2f | P: %.2f\n", hv.TinhDienTich(), hv.TinhChuVi());

        sc.close();
    }
}
