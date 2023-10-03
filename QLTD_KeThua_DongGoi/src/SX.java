import java.text.DecimalFormat;

public class SX extends Ho {
    private double hesoSD;

    public SX(int maHo, String tenHo, int csCu, int csMoi, double heso) {
        super(maHo, tenHo, csCu, csMoi);
        this.hesoSD = heso;
    }

    @Override
    public double tinhTienDien() {
        double A = super.tinhTienDien();
        return A * gia3 * hesoSD;
    }

    @Override
    public String toString() {
        DecimalFormat fm = new DecimalFormat("#,###,###");
        String tienDienString = fm.format(tinhTienDien());
        return "Ho san xuat: " + super.toString() + "\tTien dien:" + tienDienString;
    }
}
