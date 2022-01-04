package pers.menthe.chapter4;

public class quiz01 {
    public static double calPentagonArea(double length) {
        double sOfPent,area;
        sOfPent = 2 * length * Math.sin(Math.PI / 5);
        area = (5 * Math.pow(sOfPent,2)) / (4*Math.tan(Math.PI / 5 ));
        return  area;
    }
}
