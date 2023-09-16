import colors.Color;
import service.ShapesService;
import service.impl.ShapesServiceImpl;
import shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle();
        r.draw();

        Point point = new Point(1,2, Color.RED);
        point.draw();
        System.out.println();
        point.move(2,3);
        point.draw();

        System.out.println();

        Circle circle = new Circle(2,3,5,Color.BLUE);
        circle.draw();
        System.out.println();
        circle.move(2,3);
        circle.draw();

        System.out.println();

        Rectangle rectangle = new Rectangle(2,3,4,5,Color.BLUE);
        rectangle.draw();
        System.out.println();
        rectangle.move(3,4);
        rectangle.draw();

        System.out.println();

        Triangle triangle = new Triangle(3,4,3,5,9,1,Color.BROWN);
        triangle.draw();
        System.out.println();
        triangle.move(3,4);
        triangle.draw();

        List<Shape> s = new ArrayList<>();
        s.add(circle);s.add(rectangle);s.add(triangle);
        ShapesService service = new ShapesService();





    }
}