package donut;

public class Line
{
    private Point startPoint;
    private Point endPoint;
    private boolean selected;

    public Line() {}
    public Line(Point startPoint, Point endPoint) {this.startPoint = startPoint; this.endPoint = endPoint;}
    public Line(Point startPoint, Point endPoint, boolean selected) {this(startPoint, endPoint); this.selected = selected;}

    public double length()
    {
        return startPoint.distance(endPoint.getX(), endPoint.getY());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Line)
        {
            Line object = (Line) obj;
            if (startPoint.equals(object.getStartPoint()) && endPoint.equals(object.getEndPoint()))
                return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Start point: " + startPoint + ", End point: " + endPoint;
    }
    public Point getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }


}
