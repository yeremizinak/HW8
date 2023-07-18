public class CheckShape {
    PrintShape printshape = new PrintShape();
    Shape circle = new Circle();
    Shape quad = new Quad();
    Shape triangle = new Triangle();
    Shape rhombus = new Rhombus();
    Shape oval = new Oval();
    public String getShapeName() {
        switch (printshape.getShape()) {
            case "circle":
                return circle.getName();
            case "triangle":
                return triangle.getName();
            case "quad":
                return quad.getName();
            case "rhombus":
                return rhombus.getName();
            case "oval":
                return oval.getName();
        }

        throw new IllegalArgumentException("We don't know name for " + printshape.getShape() + "\nTry these ones: circle, quad, triangle, rhombus, oval");
    }
}
