package pl.info.makler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj dlugosc tabliczki: ");
        final int len = myObj.nextInt();
        System.out.println("Podaj szerokosc tabliczki: ");
        final int width = myObj.nextInt();
        System.out.println("Podaj liczbe pozadanych kostek: ");
        final int cubes = myObj.nextInt();

        if (cubes % len == 0 || cubes % width == 0) {
            if (cubes / len < width || cubes / width < len) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        else {
             System.out.println("NO");
        }
    }
}
