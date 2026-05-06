package communityuni.com;

import java.util.Scanner;

public class NhanVien {
    // 1. Các thuộc tính (Họ, Tên, Số sản phẩm)
    private String ho;
    private String ten;
    private int soSP;

    // 2. Hàm khởi tạo NhanVien(String, String, int)
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        // Kiểm tra số sản phẩm >= 0, nếu âm thì gán bằng 0
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    // 3. Các hàm lấy và gán giá trị (Getter và Setter)
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // 4. Hàm getLuong() tính lương theo đơn giá lũy tiến
    public double getLuong() {
        double donGia = 0;
        if (this.soSP >= 1 && this.soSP <= 199) {
            donGia = 0.5;
        } else if (this.soSP >= 200 && this.soSP <= 399) {
            donGia = 0.55;
        } else if (this.soSP >= 400 && this.soSP <= 599) {
            donGia = 0.6;
        } else if (this.soSP >= 600) {
            donGia = 0.65;
        }
        return this.soSP * donGia;
    }

    // 5. Hàm LonHon(NhanVien nv2) so sánh số sản phẩm
    public boolean lonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }

    // 6. Hàm main để chạy chương trình theo yêu cầu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập liệu nhân viên thứ nhất
        System.out.println("Nhập thông tin nhân viên 1:");
        System.out.print("Nhập họ: "); 
        String ho1 = scanner.nextLine();
        System.out.print("Nhập tên: "); 
        String ten1 = scanner.nextLine();
        System.out.print("Nhập số sản phẩm: "); 
        int sp1 = scanner.nextInt();
        scanner.nextLine();
        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);

        // Nhập liệu nhân viên thứ hai
        System.out.println("\nNhập thông tin nhân viên 2:");
        System.out.print("Nhập họ: "); 
        String ho2 = scanner.nextLine();
        System.out.print("Nhập tên: "); 
        String ten2 = scanner.nextLine();
        System.out.print("Nhập số sản phẩm: "); 
        int sp2 = scanner.nextInt();
        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        // Xuất kết quả lương của từng người
        System.out.println("\n--- Kết quả tính lương ---");
        System.out.println("Nhân viên " + nv1.getHo() + " " + nv1.getTen() + " có lương: " + nv1.getLuong());
        System.out.println("Nhân viên " + nv2.getHo() + " " + nv2.getTen() + " có lương: " + nv2.getLuong());

        // So sánh xem ai làm nhiều sản phẩm hơn
        System.out.println("\n--- So sánh năng suất ---");
        if (nv1.lonHon(nv2)) {
            System.out.println(nv1.getTen() + " làm nhiều sản phẩm hơn " + nv2.getTen());
        } else if (nv2.lonHon(nv1)) {
            System.out.println(nv2.getTen() + " làm nhiều sản phẩm hơn " + nv1.getTen());
        } else {
            System.out.println("Cả hai nhân viên có số sản phẩm bằng nhau.");
        }
        
        scanner.close();
    }
}