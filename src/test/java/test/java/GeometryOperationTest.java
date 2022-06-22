package test.java;

import org.testng.annotations.Test;

public class GeometryOperationTest {

    @Test
    public void geometry(){
        
        TriangleOperations to = new TriangleOperations();
        SquareOperations so = new SquareOperations();
        CircleOperations co = new CircleOperations();
        System.out.println(so.perimeterOfSquare(12));
        System.out.println(so.perimeterOfRectangle(12, 24));
        System.out.println(to.perimeterOfTriangle(12, 24, 20));
        System.out.println(co.squareOfCircle(12));
        System.out.println(co.valueOfCilinder(12, 20));
    }
}
