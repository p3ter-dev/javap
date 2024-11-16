import java.awt.Color;


public class RaceCar {
    private String carName;
    private Color carColor;
    private static final double TOP_SPEED = 120;

    public RaceCar(String carName, Color carColor) {
        this.carName = carName;
        this.carColor = carColor;
    }
    public String getName() {
        return carName;
    }
    public Color getColor() {
        return carColor;
    }

    public static RaceCar race(RaceCar car1, RaceCar car2) {
        double speed1 = Math.random();
        double speed2 = Math.random();
        if (speed1 > speed2) {
            return car1;
        }
        else if (speed2 > speed1) {
            return car2;
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        RaceCar car1 = new RaceCar("Chevrolet", Color.BLACK);
        RaceCar car2 = new RaceCar("VW", Color.GRAY);
        RaceCar winner = race(car1, car2);
        if (winner != null) {
            System.out.printf("The winner car name: %s, color: %s\n", winner.getName(), winner.getColor());
        }
        else {
            System.out.println("The race is a tie");
        }
    }
}
