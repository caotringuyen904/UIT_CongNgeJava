import java.text.DecimalFormat;

public class GD extends Ho {

    public GD(int maHo, String tenHo, int csCu, int csMoi) {
        super(maHo, tenHo, csCu, csMoi);
    }

    @Override
    public double tinhTienDien() {
        double A = super.tinhTienDien();
        return A < 100 ? A * gia1 : A * gia2;
    }

    @Override
    public String toString() {
        DecimalFormat fm = new DecimalFormat("#,###,###");
        String tienDienString = fm.format(tinhTienDien());
        return "Ho gia dinh: " + super.toString() + "\tTien dien:" + tienDienString;
    }
}
