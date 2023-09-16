package shape;

import colors.Color;


public class Rectangle extends Shape{
    private Point diagonalPoint1;
    private Point diagonalPoint2;

    public Rectangle(){
    }
    public Rectangle(double x1, double y1, double x2, double y2, Color color) throws Exception {
        validate(x1,y1,x2,y2);
        diagonalPoint1 = new Point(x1,y1,Color.BLUE);
        diagonalPoint2 = new Point(x2,y2,Color.BLUE);
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
        super.setColor(color);
    }
    private void date() throws Exception {
        validate(diagonalPoint1.getX(),diagonalPoint1.getY(),diagonalPoint2.getX(),diagonalPoint2.getY());
        super.setArea(calculateArea());
        super.setPerimeter(calculatePerimeter());
    }
    public void setDiagonalPoint1xX(double x) throws Exception {
        diagonalPoint1.setX(x);
        date();
    }
    public void setDiagonalPoint1yY(double y) throws Exception {
        diagonalPoint1.setY(y);
        date();
    }
    public void setDiagonalPoint2xX(double x) throws Exception {
        diagonalPoint2.setX(x);
        date();
    }
    public void setDiagonalPoint2yY(double y) throws Exception {
        diagonalPoint2.setY(y);
        date();
    }
    public double getDiagonalPoint1xX(){
        return diagonalPoint1.getX();
    }
    public double getDiagonalPoint1yY(){
        return diagonalPoint1.getY();
    }
    public double getDiagonalPoint2xX(){
        return diagonalPoint2.getX();
    }
    public double getDiagonalPoint2yY(){
        return diagonalPoint2.getY();
    }
    public void validate(double x1, double y1, double x2, double y2) throws Exception {
        if((x1==x2)||(y1==y2)){
            throw new Exception("Кординаты лежат на одной прямой");
        }
    }
    private double calculatePerimeter() {
        double width = Math.abs(diagonalPoint1.getX() - diagonalPoint2.getX());
        double height = Math.abs(diagonalPoint1.getY() - diagonalPoint2.getY());
        return 2 * (width + height);
    }
    private double calculateArea() {
        double width = Math.abs(diagonalPoint1.getX() - diagonalPoint2.getX());
        double height = Math.abs(diagonalPoint1.getY() - diagonalPoint2.getY());
        return width * height;
    }
    @Override
    public void move(double x,double y) throws Exception {
        try {
            diagonalPoint2.setX(diagonalPoint1.getX() + x);
            diagonalPoint2.setY(diagonalPoint1.getY() + y);
            diagonalPoint1.setX(diagonalPoint2.getX() + x);
            diagonalPoint2.setY(diagonalPoint2.getY() + y);
        }
        catch (Exception e ){
            throw new Exception("Ты не создал фигуру так то...");
        }
    }

    @Override
    public void draw() throws Exception {
        try {
            System.out.println("Фигура прямоугольник");
            System.out.println("Кординаты диагональных точек прямоугольника: " + "x1 = " + diagonalPoint1.getX() + " y1 = " + diagonalPoint1.getY() + " x2 = " + diagonalPoint2.getX() + " y = " + diagonalPoint2.getY());
            System.out.println("Цвет прямоугольника: " + super.getColor());
            System.out.println("Площадь прямоугольника: " + super.getArea());
            System.out.println("Периметр прямоугольника: " + super.getPerimeter());
        }
        catch (Exception e){
            throw new Exception("Ты не создал фигуру так то...");
        }
    }

}
