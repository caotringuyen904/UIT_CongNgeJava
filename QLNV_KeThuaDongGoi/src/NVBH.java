public class NVBH extends NhanVien {
    private int soSP;

    NVBH(int maNV, String HoTen, double luongCB, double luongHT, int soSP) {
        super(maNV, HoTen, luongCB, 0f);
        this.soSP = soSP;
    }

    public double tinhLuong() {
        return this.luongHT = luongCB + soSP * 18000;
    }

    public void print() {
        System.out.println("Ma NV: " + "\tHo ten: " + "\tLuong CB: " + "\tLuong HT: " + "\tSoSP:");
        System.out.println(maNV + "\t" + HoTen + "\t" + luongCB + "\t" + luongHT + "\t" + soSP);
    }

}
