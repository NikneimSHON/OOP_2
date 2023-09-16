package shape;

import colors.Color;

public class Triangle extends Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(){

    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color) throws Exception {
        validate(x1, y1, x2, y2, x3, y3);
        pointA = new Point(x1,y1,null);
        pointB = new Point(x2,y2,null);
        pointC = new Point(x3,y3,null);
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
        super.setColor(color);
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
    private void date() throws Exception {
        validate(pointA.getX(),pointA.getY(),pointB.getX(),pointB.getY(),pointC.getX(),pointC.getY());
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }

    public double calculatePerimeter() {
        double sideAB = distance(pointA, pointB);
        double sideBC = distance(pointB, pointC);
        double sideCA = distance(pointC, pointA);
        return sideAB + sideBC + sideCA;
    }

    public double calculateArea() {
        double sideAB = distance(pointA, pointB);
        double sideBC = distance(pointB, pointC);
        double sideCA = distance(pointC, pointA);

        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }
    private void validate(double x1, double y1, double x2, double y2,double x3,double y3) throws Exception {
        if((((x1==x2)&&(x2==x3))||((y1==y2)&&(y2==y3)))){
            throw new Exception("Кординаты лежат на одной прямой");
        }
    }
    public void setPointA(double moveX,double moveY) throws Exception {
        pointA.setX(pointA.getX() + moveX);
        pointA.setY(pointA.getY() + moveY);
        date();

    }
    public void setPointB(double moveX,double moveY) throws Exception {
        pointA.setX(pointB.getX() + moveX);
        pointA.setY(pointB.getY() + moveY);
        date();
    }
    public void setPointC(double moveX,double moveY) throws Exception {
        pointA.setX(pointC.getX() + moveX);
        pointA.setY(pointC.getY() + moveY);
        date();
    }
    public double getPointAx(){
        return pointA.getX();

    }
    public double getPointAy(){
        return pointA.getY();

    }
    public double getPointBx(){
        return pointB.getX();

    }
    public double getPointBy(){
        return pointB.getY();

    }
    public double getPointCx(){
        return getPointCx();

    }
    public double getPointCy(){
        return pointC.getY();

    }

    @Override
    public void move(double moveX, double moveY) throws Exception {
        try{
            pointA.setX(pointA.getX() + moveX);
            pointA.setY(pointA.getY() + moveY);
            pointA.setX(pointB.getX() + moveX);
            pointA.setY(pointB.getY() + moveY);
            pointA.setX(pointC.getX() + moveX);
            pointA.setY(pointC.getY() + moveY);

        }
        catch (Exception e ){
            throw new Exception("Ты не создал фигуру так то...");
        }

    }

    @Override
    public void draw() throws Exception {
        try {
            System.out.println("Фигура треугольник");
            System.out.println("Кординаты диагональных точек треугольник: " + "x1 = " + pointA.getX() + " y1 = " + pointA.getY() + " x2 = " + pointB.getX() + " y2 = " + pointB.getY() + " x3 = " + pointC.getX() + " y3 = " + pointC.getY());
            System.out.println("Цвет треугольник: " + super.getColor());
            System.out.println("Площадь треугольник: " + super.getArea());
            System.out.println("Периметр треугольник: " + super.getPerimeter());
        }
        catch (Exception e ){
            throw new Exception("Ты не создал фигуру так то...");
        }
    }
}
