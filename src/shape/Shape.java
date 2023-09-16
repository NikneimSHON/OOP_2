package shape;

import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;
    private double perimeter;
    private double area;

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setArea(Double a){
        this.area = a;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }

    public void setColor(Color color){

        this.color = color;
    }
    public Color getColor(){
        return color;
    }

    abstract void move(double moveX,double moveY) throws Exception;
    abstract void draw() throws Exception;




}
