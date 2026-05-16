package communityuni.com;

public class HinhChuNhat extends Hinh {
    protected double chieudai;
    protected double chieurong;

    public HinhChuNhat(String mau, double chieudai, double chieurong) {
        super(mau);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double TinhDienTich() {
        return chieudai * chieurong;
    }

    public double TinhChuVi() {
        return (chieudai + chieurong) * 2;
    }

    public String LayThongTin() {
        return super.LayThongTin() + ", Chiều dài: " + chieudai + ", Chiều rộng: " + chieurong;
    }
}
