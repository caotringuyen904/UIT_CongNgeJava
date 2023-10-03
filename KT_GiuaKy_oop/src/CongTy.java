import java.lang.reflect.Array;
import java.util.ArrayList;

public class CongTy {
    ArrayList<Xe> dsXe;

    public CongTy() {
        dsXe = new ArrayList<>();
    }

    public void loadData() {
        dsXe.add(new XeKhach("X101", 1_800_000, 47, 60_000));
        dsXe.add(new XeKhach("X102", 2_200_000, 39, 45_000));
        dsXe.add(new XeTaiNhe("N201", 1_800_000, 6, 1_350_000, 5_000_000));
        dsXe.add(new XeTaiNhe("N202", 5_600_000, 8, 2_500_000, 1_100_000));
        dsXe.add(new XeTaiNang("C301", 11_100_000, 21, 1_200_000, 2_600_000));
        dsXe.add(new XeTaiNang("C302", 10_800_000, 19, 1_950_000, 5_900_000));
        dsXe.add(new XeTaiNang("C303", 13_800_000, 26, 2_700_000, 1_900_000));
    }

    public void xetDoanhThu() {
        for (Xe xe : dsXe) {
            System.out.println(xe.bienSo + "\t-\t" + xe.xetDoanhThu());
        }
    }

    public ArrayList<Xe> timXeMinXang() {
        ArrayList<Xe> result = new ArrayList<>();
        double min = Double.MAX_VALUE;
        for (Xe xe : dsXe) {
            if (xe.tienXang < min) {
                min = xe.tienXang;
            }
        }

        for (Xe xe : dsXe) {
            if (xe.tienXang == min) {
                result.add(xe);
            }
        }
        return result;
    }

    public ArrayList<Xe> timXeDoanhThuLo() {
        ArrayList<Xe> result = new ArrayList<>();
        for (Xe xe : dsXe) {
            if (xe.doanhThu.equals("Lo")) {
                result.add(xe);
            }
        }
        return result;
    }

    public ArrayList<Xe> timXeTaiNangDoanhThuLo() {
        ArrayList<Xe> result = new ArrayList<>();
        for (Xe xe : dsXe) {
            if (xe instanceof XeTaiNang && xe.doanhThu.equals("Loi")) {
                result.add(xe);
            }
        }
        return result;
    }

    public ArrayList<Xe> timXePhiCauDuongMax() {
        ArrayList<Xe> result = new ArrayList<>();
        double max = 0;
        for (Xe xe : dsXe) {
            if (xe instanceof XeTai && ((XeTai) xe).phiCauDuong > max) {
                max = ((XeTai) xe).phiCauDuong;
            }
        }

        for (Xe xe : dsXe) {
            if (xe instanceof XeTai && ((XeTai) xe).phiCauDuong == max) {
                result.add(xe);
            }
        }
        return result;
    }

}
