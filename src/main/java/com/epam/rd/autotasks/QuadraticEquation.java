package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            System.out.println(((-b + Math.sqrt(d))) / (2 * a) + " " + ((-b - Math.sqrt(d))) / (2 * a));
        } else if (d == 0) {
            System.out.println((-b) / (2 * a));
        } else {
            System.out.println("no roots");
        }


    }

}