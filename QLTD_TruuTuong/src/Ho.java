public abstract class Ho implements InHo {
    protected static final double gia1 = 3500;
    protected static final double gia2 = 5500;
    protected static final double gia3 = 7000;

    protected int maHo;
    protected String tenHo;
    protected int csCu;
    protected int csMoi;
    protected int A;

    public Ho(int maHo, String tenHo, int csCu, int csMoi) {
        this.maHo = maHo;
        this.tenHo = tenHo;
        this.csCu = csCu;
        this.csMoi = csMoi;
        this.A = this.csMoi - this.csCu;
    }

    @Override
    public double tinhTienDien() {
        return A;
    };

    @Override
    public String toString() {
        return "\tMa ho:" + this.maHo + "\t\tTen chu ho: " + this.tenHo;
    }

}
