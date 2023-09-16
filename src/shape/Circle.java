package shape;

import colors.Color;

import static java.lang.Math.pow;

public class Circle extends Shape{
    private Point point;
    private double radius;
    private double perimeter;
    private double square;
    public Circle(){
        point = new Point();
        point.setX(0);point.setY(0);
        square = 0;
        perimeter = 0;
        radius = 0;
    };
    public Circle(double x, double y, double radius, Color color) throws Exception {
        validate(radius);
        point = new Point();
        this.radius = radius;
        square = Math.PI * pow(radius,2);
        perimeter = 2*Math.PI * radius;
        point.setX(x);
        point.setY(y);
        super.setColor(color);

    }
    public double getPer(){
        return perimeter;
    }
    public void validate(double r) throws Exception {
        if(r<=0){
            throw new Exception("Радиус меньше или равен нулю");
        }
    }
    public void setColor(Color color){
        super.setColor(color);
    }
    public void setX(double x){
        point.setX(x);
    }
    public void setY(double y){
        point.setY(y);
    }
    public double getX(){
        return point.getX();
    }
    public double getY(){
        return point.getY();
    }


    @Override
    public void move(double x,double y){
        point.setX(point.getX() + x);
        point.setY(point.getY() + y);
    }
    @Override
    public void draw(){
        System.out.println("Фигура круг");
        System.out.println("Кордината центра круга: " + "(x = " + point.getX() + ", y = " + point.getY() + " )");
        System.out.println("Цвет круга: " + super.getColor());
        System.out.println("Площадь круга: " + square);
        System.out.println("Периметр круга: " + perimeter);

    }

}
