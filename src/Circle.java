public class Circle extends Shape{

    public Circle (double enteredRadius){
        this(enteredRadius);
    }

    private Circle (double enteredLength, double enteredWidth, double enteredRadius, double enteredSide1, double enteredSide2, double enteredSide3){
    super(enteredLength, enteredWidth, enteredRadius, enteredSide1, enteredSide2, enteredSide3);
    }

    static double calcCirCir(double enteredRadius) {
        return enteredRadius * (2 * 3.14);
    }
    static double calcCirArea(double enteredRadius) {
        return enteredRadius * (3.14 * enteredRadius);
    }


}
