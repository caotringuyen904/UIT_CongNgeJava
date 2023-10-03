import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phuong {
    public ArrayList<Ho> dsHo = new ArrayList<>();

    public Phuong() {
        load();
    }

    public void load() {
        dsHo.add(new KD(123, "A", 120, 960, 1.8));
        dsHo.add(new GD(124, "B", 400, 450));
        dsHo.add(new KD(125, "C", 300, 689, 1.3));
        dsHo.add(new SX(126, "D", 150, 965, 1.5));
        dsHo.add(new GD(127, "E", 500, 999));
        dsHo.add(new SX(128, "F", 350, 987, 1.6));
        dsHo.add(new SX(129, "G", 100, 989, 1.9));
    }

    // Tim kiem ten chu ho, tien dien theo ma khach hang

    public List<Ho> timHo(int maKH) {
        return dsHo.stream()
                .filter(ho -> ho.maHo == maKH)
                .collect(Collectors.toList());
    }

    // Tinh tien dien TB cua tat ca cac ho trong phuong
    public double tinhTienDienTB() {
        double sum = 0.0;
        for (Ho h : dsHo) {
            sum += h.tinhTienDien();
        }
        return sum / dsHo.size();
    }

    // Tim khach hang dau tien co so tien dien lon nhat
    public Ho timHoMax() {
        double max = 0;
        for (Ho h : dsHo) {
            double cur = h.tinhTienDien();
            if (cur > max) {
                max = cur;
            }
        }
        for (Ho h : dsHo) {
            double cur = h.tinhTienDien();
            if (cur == max) {
                return h;
            }
        }
        return null;
    }

    // Tim khach hang la ho san xuat co so tien dien lon nhat
    public Ho timHoSXMax() {
        double max = 0;
        for (Ho h : dsHo) {
            if (h instanceof SX) {
                double cur = h.tinhTienDien();
                if (cur > max) {
                    max = cur;
                }
            }
        }
        for (Ho h : dsHo) {
            if (h instanceof SX) {
                double cur = h.tinhTienDien();
                if (cur == max) {
                    return h;
                }
            }
        }
        return null;
    }

}
