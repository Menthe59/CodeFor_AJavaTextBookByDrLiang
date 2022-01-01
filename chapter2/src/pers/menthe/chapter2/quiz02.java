package pers.menthe.chapter2;

public class quiz02 {

    public static void calCylinder(double radiud, double length) {
        double area = radiud * radiud * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.2f \n The volume is %.2f",area,volume);
    }
}
