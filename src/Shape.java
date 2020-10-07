public class Shape {

    private double length, width;
    private double side1, side2, side3;
    private double radius;

    public Shape(double enteredLength, double enteredWidth){
        length = enteredLength;
        width = enteredWidth;
    }

    public Shape(double enteredLength){
        length = enteredLength;
    }

    public Shape(double enteredRadius){
        radius = enteredRadius;
    }

    public Shape(double enteredSide1, double enteredSide2, double enteredSide3){
        side1 = enteredSide1;
        side2 = enteredSide2;
        side3 = enteredSide3;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getRadius() {
        return radius;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

}
