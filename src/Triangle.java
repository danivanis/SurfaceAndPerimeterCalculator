public class Triangle extends Shape{

    public Triangle (double enteredSide1, double enteredSide2, double enteredSide3){
        this(enteredSide1, enteredSide2, enteredSide3);
    }

    private Triangle (double enteredLength, double enteredWidth, double enteredRadius, double enteredSide1, double enteredSide2, double enteredSide3){
        super(enteredLength, enteredWidth, enteredRadius, enteredSide1, enteredSide2, enteredSide3);
    }

    static double calcTriArea(double enteredSide1, double enteredSide2, double enteredSide3) {
        return 0.5 * (enteredSide1 * enteredSide2);
    }
    static double calcTriPar(double baseIn, double heightIn) {
        return baseIn + (heightIn + heightIn);
    }



}
