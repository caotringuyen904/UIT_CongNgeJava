public class XeTaiNang extends XeTai {

    public XeTaiNang(String bienSo, double tienXang, int soTanHang, double chiPhiCho, double phiCauDuong) {
        super(bienSo, tienXang, soTanHang, chiPhiCho, phiCauDuong);
    }

    @Override
    public String xetDoanhThu() {
        this.doanhThu = "Lo";
        if (this.soTanHang * this.chiPhiCho - this.tienXang - this.phiCauDuong < 12_000_000
                && this.phiCauDuong < 3_000_000) {
            this.doanhThu = "Loi";
            return this.doanhThu;
        }
        return this.doanhThu;
    }

    @Override
    public String toString() {
        return "Xe tai nang:\t" + super.toString() + "\nSo tan hang: " + soTanHang + "\nChi phi cho: " + chiPhiCho
                + "\nPhi cau duong: "
                + phiCauDuong + "\nDoanh thu: " + doanhThu;
    }
}