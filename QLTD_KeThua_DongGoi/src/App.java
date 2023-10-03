import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Phuong p = new Phuong();

        // Tinh tien dien cho tung khach hang
        System.out.println("Danh sach ho:");
        for (Ho m : p.dsHo) {
            System.out.println(m);
        }

        // Tim kiem ten chu ho, so tien dien theo ma khach hang
        System.out.println("\nChu ho va tien dien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma ho: ");
        int maKH = sc.nextInt();
        for (Ho m : p.timHo(maKH)) {
            System.out.println(m);
        }

        // Tinh tien dien TB cua tat ca cac ho trong phuong
        DecimalFormat fm = new DecimalFormat("#,###,###");
        String tienDienTBString = fm.format(p.tinhTienDienTB());
        System.out.println("\nTien dien TB cua tat ca cac ho trong phuong: " + tienDienTBString);

        // Tim khach hang dau tien co so tien dien lon nhat
        Ho hoMax = p.timHoMax();
        if (hoMax != null) {
            System.out.println("\nKhach hang dau tien co so tien dien lon nhat:\n" + hoMax);
        } else {
            System.out.println("\nKhong co khach hang nao co so tien dien lon nhat");
        }
        // Tim khach hang la ho san xuat co so tien dien lon nhat
        Ho hoSXMax = p.timHoSXMax();
        ArrayList<Ho> dsHoSX = new ArrayList<>();
        dsHoSX.add(hoSXMax);
        if (!dsHoSX.isEmpty()) {
            System.out.println("\nKhach hang la ho san xuat co so tien dien lon nhat:\n" + hoSXMax);
        } else {
            System.out.println("\nKhong co khach hang nao la ho san xuat");
        }

    }
}
