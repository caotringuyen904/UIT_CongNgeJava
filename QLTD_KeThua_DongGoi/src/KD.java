import java.text.DecimalFormat;

public class KD extends Ho {
    private double hesoSD;

    public KD(int maHo, String tenHo, int csCu, int csMoi, double heso) {
        super(maHo, tenHo, csCu, csMoi);
        this.hesoSD = heso;
    }

    @Override
    public double tinhTienDien() {
        double A = super.tinhTienDien();
        return A < 500 ? A * gia2 * hesoSD : A * gia3 * hesoSD;
    }

    @Override
    public String toString() {
        DecimalFormat fm = new DecimalFormat("#,###,###");
        String tienDienString = fm.format(tinhTienDien());
        return "Ho kinh doanh: " + super.toString() + "\tTien dien:" + tienDienString;
    }

}
