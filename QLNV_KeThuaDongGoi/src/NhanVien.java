public abstract class NhanVien implements InNhanVien {
    protected int maNV;
    protected String HoTen;
    protected double luongCB;
    protected double luongHT;

    NhanVien(int maNV, String HoTen, double luongCB, double luongHT) {
        this.maNV = maNV;
        this.HoTen = HoTen;
        this.luongCB = luongCB;
        this.luongHT = 0f;
    }

    @Override
    public double tinhLuong() {
        return 0f;
    }

    @Override
    public void print() {
        System.out.println("Ma NV: " + "\tHo ten: " + "\tLuong CB: " + "\tLuong HT: ");
        System.out.println(maNV + "\t" + HoTen + "\t" + luongCB + "\t\t" + luongHT);
    }

}
