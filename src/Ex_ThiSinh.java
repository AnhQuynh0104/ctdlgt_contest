import java.util.Scanner;

class ThiSinh {
    private String hoTen, ngaySinh;
    private float diem1, diem2, diem3;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public float tongDiem(float diem1, float diem2, float diem3){
        return diem1 + diem2 + diem3;
    }
}

public class Ex_ThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diem1, diem2, diem3);
        System.out.println(hoTen + " " + ngaySinh + " " +ts.tongDiem(diem1, diem2, diem3));
    }
}


 //       10.0
//        5.5
