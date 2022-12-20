package donut;

import donut.Circle;
import donut.Donut;
import donut.Line;
import donut.Point;

public class Main {

    public static void main(String[] args) {
        Point tacka1 = new Point(5,6);
        Point tacka2 = new Point(5,6);
        System.out.println(tacka1);
        Line linija1 = new Line(new Point(1,1) , new Point(5,5));
        Line linija2 = new Line(new Point(1,1) , new Point(5,5));
        Circle c3 = new Circle(tacka1,8);
        Donut d = new Donut(tacka1, 8,3);
        Donut d2 = new Donut(tacka1, 9,3);
        System.out.println(d2.equals(d));

        System.out.println(linija1);
        Circle krug1 = new Circle(tacka1,6);
        System.out.println(krug1);
        System.out.println();
        System.out.println(tacka1.equals(tacka2));
        System.out.println(linija1.equals(linija2));
    }
}
