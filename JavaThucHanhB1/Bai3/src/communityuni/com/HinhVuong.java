package communityuni.com;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(String mau, double canh) {
        super(mau, canh, canh);
    }

    public String LayThongTin() {
        return "Màu sắc: " + mau + ", Cạnh: " + chieudai;
    }
}
