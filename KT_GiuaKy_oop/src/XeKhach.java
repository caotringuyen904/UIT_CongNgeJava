public class XeKhach extends Xe {
    private int soHanhKhach;
    private double giaVe;

    public XeKhach(String bienSo, double tienXang, int soHanhKhach, double giaVe) {
        super(bienSo, tienXang);
        this.soHanhKhach = soHanhKhach;
        this.giaVe = giaVe;
    }

    @Override
    public String xetDoanhThu() {
        this.doanhThu = "Lo";
        if (this.soHanhKhach * this.giaVe - this.tienXang > 500_000) {
            this.doanhThu = "Loi";
            return this.doanhThu;
        }
        return this.doanhThu;
    }

    @Override
    public String toString() {
        return "Xe Khach:\t" + super.toString() + "\nSo hanh khach: " + soHanhKhach + "\nGia ve: " + giaVe
                + "\nDoanh thu: " + doanhThu;
    }
}
