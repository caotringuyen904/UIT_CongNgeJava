public class VanTai extends GiaoDuc {
    private float chiPhiMuaXe;

    public VanTai(String maCty, float vonDieuHanh, float tongThu, float chiPhiMuaXe, float thue) {
        super(maCty, vonDieuHanh, tongThu, thue);
        this.chiPhiMuaXe = chiPhiMuaXe;
    }

    @Override
    public String xetDoanhThu() {
        return (this.vonDieuHanh < this.tongThu) ? "KHONG DAT"
                : ((this.chiPhiMuaXe * this.thue) > this.tongThu) ? "VUOT" : "DAT";
    }

    @Override
    public String toString() {
        return super.toString() + "\tChi phi mua xe: " + this.chiPhiMuaXe;
    }
}
