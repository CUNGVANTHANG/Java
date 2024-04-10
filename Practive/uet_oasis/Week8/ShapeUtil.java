import java.util.List;

public class ShapeUtil {
    /**
     * printInfo().
     * 
     * @param shapes shapes.
     * @return return.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result += shape.getInfo() + "\n";
            }
        }
        result += "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                result += shape.getInfo() + "\n";
            }
        }
        return result;
    }
}
