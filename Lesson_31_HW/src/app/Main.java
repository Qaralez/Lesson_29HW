package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures= new ArrayList<>();
        figures.add(new Circle(3));
        figures.add(new Square(4));
        figures.add(new Rectangle(3, 5));
        figures.add(new Circle(5));
        figures.add(new Square(2));

        double totalArea=0;
        for (Figure f : figures){
            totalArea += f.calcArea();
        }
        System.out.println("Общая площадь всех фигур" + totalArea);

        Figure maxFigure= findMaxAreaFigure(figures);
        System.out.println("Фигура с максимальной площадью" + maxFigure + maxFigure + " (площадь = " + maxFigure.calcArea() + ")");


    }
    public static Figure findMaxAreaFigure(List<Figure>list){
        if (list.isEmpty());
        Figure max=list.get(0);
        for (Figure f : list){
            if (f.calcArea()>max.calcArea()){
                max=f;
            }
        }
        return max;
    }

}



