public class XeTaiNhe extends XeTai {

    public XeTaiNhe(String bienSo, double tienXang, int soTanHang, double chiPhiCho, double phiCauDuong) {
        super(bienSo, tienXang, soTanHang, chiPhiCho, phiCauDuong);
    }

    @Override
    public String xetDoanhThu() {
        this.doanhThu = "Lo";
        if (this.soTanHang * this.chiPhiCho - this.tienXang - this.phiCauDuong > 2_600_000) {
            this.doanhThu = "Loi";
            return this.doanhThu;
        }
        return this.doanhThu;
    }

    @Override
    public String toString() {
        return "Xe tai nhe:\t" + super.toString() + "\nSo tan hang: " + soTanHang + "\nChi phi cho: " + chiPhiCho
                + "\nPhi cau duong: "
                + phiCauDuong + "\nDoanh thu: " + doanhThu;
    }
}
