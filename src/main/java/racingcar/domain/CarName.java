package racingcar.domain;

public class CarName {

    private static final int MAX_CAR_NAME_LENGTH = 5;
    private static final String ERROR_CAR_NAME_MAX_LENGTH = "[ERROR] 자동차 이름은 최대 5자 까지 가능합니다.";
    private static final String ERROR_CAR_NAME_EMPTY = "[ERROR] 자동차 이름은 공백이 될 수 없습니다.";
    private final String carName;

    public CarName(String carName) {
        isCheckValidateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void isCheckValidateCarName(String carName) {
        if (isCheckMaxLength(carName)) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_MAX_LENGTH);
        }

        if (isCheckEmpty(carName)) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }
    }

    private static boolean isCheckMaxLength(String carName) {
        return carName.length() > MAX_CAR_NAME_LENGTH;
    }

    private static boolean isCheckEmpty(String carName) {
        return carName.isEmpty();
    }
}
