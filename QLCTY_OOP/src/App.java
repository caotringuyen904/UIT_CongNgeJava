import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TongCTY t = new TongCTY();

        // Khoi tao du lieu
        for (CongTy m : t.dsCty) {
            System.out.println(m);
        }

        // Xet doanh thu
        System.out.println("\nXet doanh thu:");
        for (CongTy m : t.dsCty) {
            System.out.println("Ma cong ty: " + m.maCty + "\t" + "Ket qua xet: " + m.xetDoanhThu());
        }

        // Cap nhat von dieu hanh theo ma cong ty
        System.out.println("\nCap nhat von dieu hanh theo ma cong ty:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma cong ty: ");
        String macty = sc.nextLine();
        System.out.print("Nhap von dieu hanh: ");
        float von = sc.nextFloat();

        System.out.println("\nCong ty sau khi cap nhat:\t");
        t.capNhatVonDieuHanh(macty, von);

        // Tim cong ty co doanh thu la KHONG DAT
        System.out.println("\nTim cong ty co doanh thu la KHONG DAT:");
        ArrayList<CongTy> result = t.timCongTyKhongDat();
        for (CongTy m : result) {
            System.out.println("Ma cong ty: " + m.maCty + "\t" + "Ket qua xet: " + m.xetDoanhThu());
        }

        // Tim cong ty co thue nho nhat
        System.out.println("\nTim cong ty co thue nho nhat:");
        t.timCongTyThueNhoNhat();
    }

}
