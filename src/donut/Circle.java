package donut;

import java.awt.*;

public class Circle {
    private Point center;
    private double r;
    private boolean selected;

    public Circle() {

    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(Point center, double r, boolean selected) {
        this.center = center;
        this.r = r;
        this.selected = selected;
    }

    public double area() {
        return this.r*this.r*Math.PI;
    }

    public double circumference() {
        return this.r*2*Math.PI;
    }

    @Override
    public String toString(){
        return "center: " + center + " radius: " + r;
    }

    @Override
    public boolean equals(Object ObjA){
        if(ObjA instanceof Circle){
            Circle temp = (Circle) ObjA;
            if(center.equals(temp.center) && r == temp.r){
                return true;
            }
        }
        return false;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
