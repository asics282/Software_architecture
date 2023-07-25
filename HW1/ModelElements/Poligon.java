package HW1.ModelElements;

import HW1.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    /**
     * Конструктор
     * @param point начальная точка
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}
