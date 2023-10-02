package JavaTutorial;

import java.util.Scanner;

public class RadiusOfCircle {

    public static void main(String args[]) {

        int radius=10;
        double pie = 3.14, area;
        /*Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        radius = s.nextInt();*/
        area = pie * radius * radius;
        System.out.println("Area of circle:" + area);
    }
}
