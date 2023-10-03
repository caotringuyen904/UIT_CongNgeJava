import java.util.ArrayList;

public class TongCTY {
    public ArrayList<CongTy> dsCty;

    public TongCTY() {
        dsCty = new ArrayList<CongTy>();
        load();
    }

    public void load() {
        dsCty.add(new BDS("B111", 108.5f, 65, 1.3f, 0.19f));
        dsCty.add(new BDS("B112", 158.6f, 50, 1.2f, 0.15f));
        dsCty.add(new BDS("B113", 130.8f, 67, 1.1f, 0.02f));

        dsCty.add(new VanTai("V201", 50.9f, 61.1f, 30.1f, 0.06f));
        dsCty.add(new VanTai("V202", 80.5f, 71.1f, 0, 0.08f));

        dsCty.add(new GiaoDuc("G301", 39.3f, 30.2f, 0.02f));
        dsCty.add(new GiaoDuc("G302", 59.2f, 65.6f, 0.03f));
    }

    public void capNhatVonDieuHanh(String macty, float von) {
        for (CongTy m : dsCty) {
            if (m.maCty.equals(macty)) {
                m.vonDieuHanh = von;
                System.out.println(m);
            }
        }
    }

    public ArrayList<CongTy> timCongTyKhongDat() {
        ArrayList<CongTy> result = new ArrayList<CongTy>();
        for (CongTy m : dsCty) {
            if (m.xetDoanhThu().equals("KHONG DAT")) {
                result.add(m);
            }
        }
        return result;
    }

    public void timCongTyThueNhoNhat() {
        float min = 1;
        for (CongTy m : dsCty) {
            if (m.thue < min) {
                min = m.thue;
            }
        }
        for (CongTy m : dsCty) {
            if (m.thue == min) {
                System.out.println("Ma cong ty: " + m.maCty + "\t" + "Ket qua xet: " + m.thue);
            }
        }
    }

}