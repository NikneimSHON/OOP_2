package service.impl;

import colors.Color;
import service.ShapesService;
import shape.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        double sum = 0;

        for (int i = 0; i < shapeList.size(); i++) {
            sum += shapeList.get(i).getArea();
        }

        return sum;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxP=0;

        for (int i = 0; i < shapeList.size(); i++) {
            if(maxP < shapeList.get(i).getPerimeter()){
                maxP = shapeList.get(i).getPerimeter();
            }
        }

        return maxP;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        HashSet<Color> colors = new HashSet<Color>();
        for (int i = 0; i < shapeList.size(); i++) {
            colors.add(shapeList.get(i).getColor());
        }
        return colors;
    }


}
