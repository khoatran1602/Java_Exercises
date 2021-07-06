Main class
package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter data of the equation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        Method method = new Method();
        if (method.isSolvable(a, b, c, d, e, f)) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println(method.getX(a, b, c, d, e, f));
            System.out.println(method.getY(a, b, c, d, e, f));
        }
    }
}
------------------------------------------------------------------
Method class
package com.company;

public class Method {

    public boolean isSolvable(double a, double b, double c, double d, double e, double f) {
        if ((a*d) - (b*c) != 0) {
            return false;
        }
        return true;
    }

    public double getX(double a, double b, double c, double d, double e, double f) {
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return x;
    }

    public double getY(double a, double b, double c, double d, double e, double f) {
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return y;
    }
}
