public class Rectangle extends Shape{

    public Rectangle (double enteredLength, double enteredWidth){
        this(enteredLength, enteredWidth);
    }

    private Rectangle (double enteredLength, double enteredWidth, double enteredRadius, double enteredSide1, double enteredSide2, double enteredSide3){
        super(enteredLength, enteredWidth, enteredRadius, enteredSide1, enteredSide2, enteredSide3);
    }

    static double calcRecPer(double enteredLength, double enteredWidth) {
        return 2 * (enteredLength + enteredWidth);
    }
    static double calcRecArea(double enteredLength, double enteredWidth) {
        return enteredLength * enteredWidth;
    }

}
