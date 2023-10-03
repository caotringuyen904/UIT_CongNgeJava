import java.util.ArrayList;

public class CongTy {
    public ArrayList<NhanVien> dsNV;

    CongTy() {
        dsNV = new ArrayList<NhanVien>();
        load();
    }

    public void load() {
        dsNV.add(new NVBH(1, "Nguyen Van A", 1000000, 0, 100));
        dsNV.add(new NVVP(2, "Nguyen Van B", 1500000, 0, 29));
        dsNV.add(new NVVP(3, "Nguyen Van C", 2000000, 0, 15));
        dsNV.add(new NVBH(4, "Nguyen Van D", 3000000, 0, 100));
    }

    // Tim nhan vien theo maNV
    public ArrayList<NhanVien> timNV(int maNV) {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        for (NhanVien nv : dsNV) {
            if (nv.maNV == maNV) {
                result.add(nv);
            }
        }
        return result;
    }

    // Tim nhan vien co luong hang thang cao nhat
    public ArrayList<NhanVien> timNVMax() {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        double max = 0;
        for (NhanVien nv : dsNV) {
            if (nv.luongHT > max) {
                max = nv.luongHT;
            }
        }
        for (NhanVien nv : dsNV) {
            if (nv.luongHT == max) {
                result.add(nv);
            }
        }
        return result;
    }

    // Tim nhan vien co luong hang thang thap nhat
    public ArrayList<NhanVien> timNVMin() {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        double min = Double.MAX_VALUE;
        for (NhanVien nv : dsNV) {
            if (nv.luongHT < min) {
                min = nv.luongHT;
            }
        }
        for (NhanVien nv : dsNV) {
            if (nv.luongHT == min) {
                result.add(nv);
            }
        }
        return result;
    }

    // Tim nhan vien ban hang co luong hang thang thap nhat
    public ArrayList<NhanVien> timBHMin() {
        ArrayList<NhanVien> result = new ArrayList<NhanVien>();
        double min = Double.MAX_VALUE;
        for (NhanVien nv : dsNV) {
            if (nv instanceof NVBH) {
                if (nv.luongHT < min) {
                    min = nv.luongHT;
                }
            }
        }
        for (NhanVien nv : dsNV) {
            if (nv instanceof NVBH) {
                if (nv.luongHT == min) {
                    result.add(nv);
                }
            }
        }
        return result;
    }

}
