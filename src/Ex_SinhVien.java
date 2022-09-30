import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien{
    private String hoTen, lop, ngaySinh;

    private float diem;

    public SinhVien(String hoTen, String lop, String ngaySinh, float diem) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }
     public Date formatDate(Date ngaySinh) throws ParseException {
         SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
         Date date = format1.parse(String.valueOf(ngaySinh));
         return date;
     }
}

public class Ex_SinhVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = sc.nextLine();
        float diem = sc.nextFloat();
        SinhVien sv = new SinhVien(hoTen, lop, ngaySinh, diem);
        //System.out.println("%d %d %d %d %.2f", hoTen, lop, sv.formatDate(ngaySinh), diem);
    }
}
