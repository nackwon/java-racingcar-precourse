package racingcar;

public class RacingCar {

    private RacingCarName carName;
    private int carStep;

    public RacingCar(String carName, int carStep) {
        this.carName = new RacingCarName(carName);
        this.carStep = carStep;
    }
}
