public class BDS extends CongTy {
    private int soCanHo;
    private float giaCanHo;

    public BDS(String maCty, float vonDieuHanh, int soCanHo, float giaCanHo, float thue) {
        super(maCty, vonDieuHanh, thue);
        this.soCanHo = soCanHo;
        this.giaCanHo = giaCanHo;
    }

    @Override
    public String xetDoanhThu() {
        return (this.vonDieuHanh - this.soCanHo * this.giaCanHo - this.giaCanHo * this.thue) < 0 ? "VUOT"
                : (this.vonDieuHanh - this.soCanHo * this.giaCanHo > 50) ? "DAT" : "KHONG DAT";
    }

    public String toString() {
        return super.toString() + "\tSo can ho: " + this.soCanHo + "\tGia can ho: " + this.giaCanHo;
    }
}
