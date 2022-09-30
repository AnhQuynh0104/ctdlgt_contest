

import java.util.Scanner;

class Point {
    private double x;
    private  double y;

    public Point(double x, double y) {
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
public class pointDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();

            Point x = new Point(a,b);
            Point y = new Point(c,d);
            System.out.println( String.format("%.4f", x.calcDistance(y)));
            t--;
        }

    }
}


