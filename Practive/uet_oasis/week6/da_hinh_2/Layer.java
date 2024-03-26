package uet_oasis.week6.da_hinh_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Get info.
     * 
     * @return return.
     */
    public String getInfo() {
        String result = "Layer of crazy shapes:";
        for (Shape shape : shapes) {
            result += "\n" + shape.toString();
        }

        return result;
    }

    public void removeDuplicates() {
        LinkedHashSet<Shape> shapeSet = new LinkedHashSet<>(shapes);
        this.shapes = new ArrayList<>(shapeSet);
    }
}
