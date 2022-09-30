import java.util.Scanner;

class Point2 {
    private double x;
    private  double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcDistance(Point p){
        return Math.sqrt(((this.getX() - p.getX()) * (this.getX() - p.getX())) + (this.getY() - p.getY()) * (this.getY() - p.getY()));
    }

}


public class chuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0){
            Point a  = new Point(sc.nextInt(), sc.nextInt());
            Point b  = new Point(sc.nextInt(), sc.nextInt());
            Point c  = new Point(sc.nextInt(), sc.nextInt());
            double ab = a.calcDistance(b);
            double ac = a.calcDistance(c);
            double bc = b.calcDistance(c);
            if(ab+ac>bc && ab+bc>ac && ac+bc>ab){
                System.out.println(String.format("%.3f", ab+ac+bc));
            } else System.out.println("INVALID");
        }
    }
}
