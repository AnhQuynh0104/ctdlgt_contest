import java.math.BigInteger;
import java.util.Scanner;

class PhanSoDonGian{
    private BigInteger tu, mau;

    public PhanSoDonGian(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public BigInteger getTu() {
        return tu;
    }

    public void setTu(BigInteger tu) {
        this.tu = tu;
    }

    public BigInteger getMau() {
        return mau;
    }

    public void setMau(BigInteger mau) {
        this.mau = mau;
    }

    public BigInteger ucln(BigInteger a, BigInteger b){
        BigInteger result = a.gcd(b);
        return result;
    }

}

public class InPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        PhanSoDonGian ps = new PhanSoDonGian(a,b);
        //ps.ucln(a,b);
        System.out.println(a.divide(ps.ucln(a,b)) + "/" + b.divide(ps.ucln(a,b)));

    }
}
