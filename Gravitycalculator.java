package TSI.lv;

public class Gravitycalculator {
    public static final double GRAVITY_CONSTANT = 9.8;
    public static final double ANOTHER_CONSTANT = 0.5;

    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;

    public Gravitycalculator() {

    }

    public Gravitycalculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double finalPosition = (fallingTime * fallingTime) * GRAVITY_CONSTANT * ANOTHER_CONSTANT + (initialVelocity * fallingTime) + initialPosition;
        System.out.println(("Position in " + fallingTime + "secondes: " + finalPosition));
    }
    public static void main(String[] args) {
        Gravitycalculator calculator = new Gravitycalculator(10, 5, 23);

        calculator.calculate();
    }

}
