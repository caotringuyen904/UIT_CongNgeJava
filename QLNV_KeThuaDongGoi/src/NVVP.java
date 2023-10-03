public class NVVP extends NhanVien {
    protected int soNgay;

    NVVP(int maNV, String HoTen, double luongCB, double luongHT, int soNgay) {
        super(maNV, HoTen, luongCB, 0f);
        this.soNgay = soNgay;
    }

    public double tinhLuong() {
        return this.luongHT = luongCB + soNgay * 150000;
    }

    public void print() {
        System.out.println("Ma NV: " + "\tHo ten: " + "\tLuong CB: " + "\tLuong HT: " + "\tsoNgay:");
        System.out.println(maNV + "\t" + HoTen + "\t" + luongCB + "\t" + luongHT + "\t" + soNgay);
    }

}
