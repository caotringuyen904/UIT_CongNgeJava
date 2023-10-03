import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CongTy ct = new CongTy();

        // Khoi tao du lieu
        ct.loadData();

        // Xet doanh thu tung xe cho cong ty
        System.out.println("Xet doanh thu tung xe cho cong ty");
        ct.xetDoanhThu();

        // Tim cac xe co chi phi tien xang nho nhat trong cong ty
        ArrayList<Xe> xeXangMin = ct.timXeMinXang();
        System.out.println("\nXe co chi phi tien xang nho nhat trong cong ty:");
        if (!xeXangMin.isEmpty()) {
            for (Xe xe : xeXangMin) {
                System.out.println("Bien so: " + xe.bienSo + "\tTien xang: " + xe.tienXang);
            }
        } else {
            System.out.println("Khong co xe nao");
        }

        // Tim xe co doanh thu = Lo
        System.out.println("\nXe co doanh thu = Lo:");
        ArrayList<Xe> xeDoanhThuLo = ct.timXeDoanhThuLo();
        if (!xeDoanhThuLo.isEmpty()) {
            for (Xe xe : xeDoanhThuLo) {
                System.out.println("Bien so: " + xe.bienSo + "\tDoanh thu: " + xe.doanhThu);
            }
        } else {
            System.out.println("Khong co xe nao");
        }

        // Tim xe tai nang co doanh thu Loi
        System.out.println("\nXe tai nang co doanh thu = Loi:");
        ArrayList<Xe> xeTaiNangDoanhThuLo = ct.timXeTaiNangDoanhThuLo();
        if (!xeTaiNangDoanhThuLo.isEmpty()) {
            for (Xe xe : xeTaiNangDoanhThuLo) {
                System.out.println("Bien so: " + xe.bienSo + "\tDoanh thu: " + xe.doanhThu);
            }
        } else {
            System.out.println("Khong co xe nao");
        }

        // Tim cac xe co phi cau duong lon nhat
        System.out.println("\nXe co phi cau duong lon nhat:");
        ArrayList<Xe> xePhiCauDuongMax = ct.timXePhiCauDuongMax();
        if (!xePhiCauDuongMax.isEmpty()) {
            for (Xe xe : xePhiCauDuongMax) {
                System.out.println("Bien so: " + xe.bienSo + "\tPhi cau duong: " + ((XeTai) xe).phiCauDuong);
            }
        } else {
            System.out.println("Khong co xe nao");
        }
    }
}
