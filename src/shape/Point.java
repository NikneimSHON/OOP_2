package shape;

import colors.Color;

public class Point extends Shape{
    private double x,y;
    public Point(){
    };
    public Point(double x, double y, Color color){
        this.x = x;
        this.y = y;
        super.setColor(color);
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double Y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    @Override
    public void move(double x,double y){
        this.x = this.x + x;
        this.y = this.y + y;
    }
    @Override
    public void draw(){
        System.out.println("Фигура точка");
        System.out.println("Кордината точки: " + "(x = " + x + ", y = " + y + " )");
        System.out.println("Цвет точки: " + super.getColor());
    }


}
