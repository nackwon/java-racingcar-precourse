package racingcar.domain;

import racingcar.view.RacingCarOutputView;

public class CarName {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static String carName;

    public CarName(String carName) {
        isCheckValidateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public static void isCheckValidateCarName(String carName) {
        if (isCheckMaxLength(carName)) {
            throw new IllegalArgumentException(RacingCarOutputView.errorMaxLength());
        }

        if (isCheckEmpty(carName)) {
            throw new IllegalArgumentException(RacingCarOutputView.errorNameEmpty());
        }
    }

    private static boolean isCheckMaxLength(String carName) {
        return carName.length() > MAX_CAR_NAME_LENGTH;
    }

    private static boolean isCheckEmpty(String carName) {
        return carName.isEmpty();
    }
}
