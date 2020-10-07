public class Square extends Shape{

    public Square (double enteredLength){
        this(enteredLength);
    }

    private Square (double enteredLength, double enteredWidth, double enteredRadius, double enteredSide1, double enteredSide2, double enteredSide3){
        super(enteredLength, enteredWidth, enteredRadius, enteredSide1, enteredSide2, enteredSide3);
    }

    static double calcSquarePer(double enteredLength) {
        return 4 * enteredLength;
    }

    static double calcSquareArea(double enteredLength) {
        return enteredLength * enteredLength;
    }

}
