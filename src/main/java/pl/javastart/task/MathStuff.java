package pl.javastart.task;

public class MathStuff {

    boolean isEven(int number) {
        return (number % 2 == 0);
    }

    boolean isOdd(int number) {
        return (!isEven(number));
    }

    double circleField(double radius) {
        return (Math.PI * radius * radius); // lub: 3.14159265 * radius * radius
    }

    int power(int number) {
        return (number * number);
    }
}
