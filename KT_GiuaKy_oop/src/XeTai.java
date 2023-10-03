public class XeTai extends Xe {
    protected int soTanHang;
    protected double chiPhiCho;
    protected double phiCauDuong;

    public XeTai(String bienSo, double tienXang, int soTanHang, double chiPhiCho, double phiCauDuong) {
        super(bienSo, tienXang);
        this.soTanHang = soTanHang;
        this.chiPhiCho = chiPhiCho;
        this.phiCauDuong = phiCauDuong;
    }
}
