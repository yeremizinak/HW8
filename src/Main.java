import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter the shape: ");
        CheckShape checkShape = new CheckShape();
        System.out.println("The shape's name is " + checkShape.getShapeName());
    }
}
