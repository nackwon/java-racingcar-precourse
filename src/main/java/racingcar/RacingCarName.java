package racingcar;

public class RacingCarName {

    private static final String MSG_OVER_MAX_LENGTH = "[ERROR] 자동차 이름은 5자리가 넘어선 안됩니다.";
    private static final String SPLIT_CODE = ",";

    private String carName;

    public RacingCarName(String carName) {
        isCheckCarNameLength(carName);
        this.carName = carName;
    }

    private void isCheckCarNameLength(String sCarNames) {

        String[] arrCarNames = sCarNames.split(SPLIT_CODE);

        for(String sCarName : arrCarNames) {
            if(sCarName.length() > 5) {
                throw new IllegalStateException(MSG_OVER_MAX_LENGTH);
            }
        }
    }
}
