public abstract class CongTy implements InTongCTY {
    protected String maCty;
    protected float vonDieuHanh;
    protected float thue;

    public CongTy(String maCty, float vonDieuHanh, float thue) {
        this.maCty = maCty;
        this.vonDieuHanh = vonDieuHanh;
        this.thue = thue;
    }

    @Override
    public String xetDoanhThu() {
        String result = "";
        return result;
    }

    @Override
    public String toString() {
        return "Ma cong ty: " + this.maCty + "\tVon dieu hanh: " + this.vonDieuHanh + "\tThue: " + this.thue;
    }

}
