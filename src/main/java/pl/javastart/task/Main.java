package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        double b = 10.0;
        MathStuff mathStuff = new MathStuff();
        System.out.println("Czy liczba " + a + " jest parzysta? " + mathStuff.isEven(a));
        System.out.println("Czy liczba " + a + " jest nieparzysta? " + mathStuff.isOdd(a));
        System.out.println("Czy liczba " + (a + 1) + " jest parzysta? " + mathStuff.isEven(a + 1));
        System.out.println("Czy liczba " + (a + 1) + " jest nieparzysta? " + mathStuff.isOdd(a + 1));
        System.out.println("Pole koła o promieniu " + b + " to " + mathStuff.circleField(b));
        System.out.println("Pole koła o promieniu " + (b / 2) + " to " + mathStuff.circleField(b / 2));
        System.out.println("Kwadrat liczby " + a + " to " + mathStuff.power(a));
        System.out.println("Kwadrat liczby " + (a / 2) + " to " + mathStuff.power(a / 2));
    }
}
