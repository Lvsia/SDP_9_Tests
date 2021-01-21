public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int a, int b, int c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public TriangleType getType(){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0)
            throw new IllegalArgumentException("All given values must be greater than 0.");
        if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB)
            throw new IllegalArgumentException("Triangle with given sides does not exist.");
        if (sideA == sideB && sideB == sideC)
            return TriangleType.EQUILATERAL;
        if (sideA == sideB || sideB == sideC || sideA == sideC)
            return TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }
}
