public class GiaoDuc extends CongTy {
    public float tongThu;

    public GiaoDuc(String maCty, float vonDieuHanh, float tongThu, float thue) {
        super(maCty, vonDieuHanh, thue);
        this.tongThu = tongThu;
    }

    @Override
    public String xetDoanhThu() {
        return (this.vonDieuHanh > this.tongThu) ? "KHONG DAT" : ((this.tongThu * this.thue) > 10) ? "VUOT" : "DAT";
    }

    public String toString() {
        return super.toString() + "\tTong thu: " + this.tongThu;
    }
}
