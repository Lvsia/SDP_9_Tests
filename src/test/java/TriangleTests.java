import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void triangleGetType_allNegativeInput_throwException(){
        Triangle triangle = new Triangle(-5, -4, -3);
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedResponse = "All given values must be greater than 0.";
        String givenResponse = exc.getMessage();
        Assertions.assertTrue(givenResponse.contains(expectedResponse));
    }
    @Test
    void triangleGetType_allZeroInput_throwException(){
        Triangle triangle = new Triangle(0, 0, 0);
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedResponse = "All given values must be greater than 0.";
        String givenResponse = exc.getMessage();
        Assertions.assertTrue(givenResponse.contains(expectedResponse));
    }
    @Test
    void triangleGetType_invalidInput_throwException(){
        Triangle triangle = new Triangle(0, -2, 1);
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedResponse = "All given values must be greater than 0.";
        String givenResponse = exc.getMessage();
        Assertions.assertTrue(givenResponse.contains(expectedResponse));
    }
    @Test
    void triangleGetType_invalidSidesSumEqualsSide_throwException(){
        Triangle triangle = new Triangle(1, 1, 2);
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedResponse = "Triangle with given sides does not exist.";
        String givenResponse = exc.getMessage();
        Assertions.assertTrue(givenResponse.contains(expectedResponse));
    }
    @Test
    void triangleGetType_invalidSidesSumLongerSide_throwException(){
        Triangle triangle = new Triangle(5, 5, 20);
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, triangle::getType);
        String expectedResponse = "Triangle with given sides does not exist.";
        String givenResponse = exc.getMessage();
        Assertions.assertTrue(givenResponse.contains(expectedResponse));
    }
    @Test
    void triangleGetType_allSidesEquals_returnEquilateral(){
        Triangle triangle = new Triangle(6, 6, 6);
        Assertions.assertEquals(triangle.getType(), TriangleType.EQUILATERAL);
    }
    @Test
    void triangleGetType_twoSidesEquals_returnIsosceles(){
        Triangle triangle = new Triangle(12, 12, 9);
        Assertions.assertEquals(triangle.getType(), TriangleType.ISOSCELES);
    }
    @Test
    void triangleGetType_twoSidesEquals_returnScalene(){
        Triangle triangle = new Triangle(5, 4, 3);
        Assertions.assertEquals(triangle.getType(), TriangleType.SCALENE);
    }
}
