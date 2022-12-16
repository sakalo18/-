

import java.util.Scanner;

import static java.lang.System.in;

public class Kolo implements Figury {
    Scanner sc = new Scanner(in);
    double pi = 3.14;
    double r = sc.nextDouble();
    static double s;

    public Kolo(double s) {
    }

    @Override
    public double getfigury() {
        return s = pi * r;

    }
}