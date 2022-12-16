import java.util.Scanner;

import static java.lang.System.in;

public class Square implements Figury {
    Scanner sc = new Scanner(in);
    static double s;
    double a=sc.nextDouble();

    public Square(double s) {
    }


    @Override
    public double getfigury() {
        return s=a+a+a+a;
    }
}
