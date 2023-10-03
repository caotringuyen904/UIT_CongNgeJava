import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CongTy ct = new CongTy();

        // In danh sach thong tin nhan vien
        for (NhanVien nv : ct.dsNV) {
            nv.tinhLuong();
            nv.print();
        }

        // Tim nhan vien theo maNV
        boolean found;
        do {
            // Tim nhan vien theo maNV
            System.out.println("\nTim nhan vien theo maNV" + "\nNhap ma nhan vien can tim: ");

            Scanner sc = new Scanner(System.in);
            int manv = sc.nextInt();

            found = false;
            for (NhanVien nv : ct.timNV(manv)) {
                if (nv.maNV == manv) {
                    found = true;
                    nv.print();
                }
            }

            if (!found) {
                System.out.println("Khong tim thay nhan vien co ma " + manv);
            }
        } while (!found);

        // Tim nhan vien co luong hang thang cao nhat
        System.out.println("\nTim nhan vien co luong hang thang cao nhat:");

        for (NhanVien nv : ct.timNVMax()) {
            nv.print();
        }

        // Tim nhan vien co luong hang thang thap nhat
        System.out.println("\nTim nhan vien co luong hang thang thap nhat:");

        for (NhanVien nv : ct.timNVMin()) {
            nv.print();
        }

        // Tim nhan vien ban hang co luong hang thang thap nhat
        System.out.println("\nTim nhan vien ban hang co luong hang thang thap nhat:");

        for (NhanVien nv : ct.timBHMin()) {
            nv.print();
        }
    }
}
