import java.util.Scanner;

class PhanSo {
        private String tu, mau;

        public PhanSo(String tu, String mau) {
            this.tu = tu;
            this.mau = mau;
        }

         public String getTu() {
            return tu;
        }

        public void setTu(String tu) {
            this.tu = tu;
        }

        public String getMau() {
            return mau;
        }

        public void setMau(String mau) {
            this.mau = mau;
        }

        public int ucln(String tu, String mau){
            int a = Integer.parseInt(tu);
            int b = Integer.parseInt(mau);
            while (a != b){
                if(a > b){
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        }

        public void toiGian(){
            int i = ucln(this.getTu(), this.getMau());
            this.setTu(String.valueOf(Integer.parseInt(this.getTu()) / i));
            this.setMau(String.valueOf(Integer.parseInt(this.getMau()) / i));
        }

        public PhanSo cong(PhanSo ps){
            int tuSo = Integer.parseInt(this.getTu()) * Integer.parseInt(ps.getMau()) + Integer.parseInt(this.getMau()) * Integer.parseInt(ps.getTu());
            int mauSo = Integer.parseInt(this.getMau()) * Integer.parseInt(ps.getMau());
            PhanSo psTong = new PhanSo(String.valueOf(tuSo), String.valueOf(mauSo));
            psTong.toiGian();
            return psTong;
        }

        public PhanSo nhan(PhanSo ps){
            int tuSo = Integer.parseInt(this.getTu()) * Integer.parseInt(ps.getTu());
            int mauSo = Integer.parseInt(this.getMau()) * Integer.parseInt(ps.getMau());
            PhanSo psTich = new PhanSo(String.valueOf(tuSo), String.valueOf(mauSo));
            psTich.toiGian();
            return psTich;
        }
}

public class Ex_PhanSo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
//        while(t-- >0){
//            PhanSo A = new PhanSo(sc.nextLine());
//            PhanSo B = new PhanSo(sc.nextLine());
//            System.out.println(A + " " + B);
//            PhanSo tongAB = A.cong(B);
//            PhanSo tichAB = A.nhan(B);
//            PhanSo C = tongAB.nhan(tongAB);
//            System.out.print(C);
//            System.out.print(" ");
//            System.out.println(tichAB.nhan(C));
//        }
    }
}
