public class Xe implements InXe {
    protected String bienSo;
    protected double tienXang;
    protected String doanhThu;

    public Xe(String bienSo, double tienXang) {
        this.bienSo = bienSo;
        this.tienXang = tienXang;
    }

    public String xetDoanhThu() {
        return "";
    }

    public String toString() {
        return "Bien so: " + bienSo + "\nTien xang: " + tienXang;
    }

}
