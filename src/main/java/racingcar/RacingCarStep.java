package racingcar;

public class RacingCarStep {
    private static final String MSG_ONLY_INPUT_NUMBER = "[ERROR] 시도 횟수는 숫자를 입력해야 합니다.";

    private String stepCount;

    public RacingCarStep(String stepCount) {
        isCheckNumberFormat(stepCount);
        this.stepCount = stepCount;
    }

    public void isCheckNumberFormat(String inputNumber) {
        int intSize = inputNumber.length();

        for (int i=0; i<intSize; ++i) {
            if(!Character.isDigit(inputNumber.charAt(i))) {
                throw new IllegalArgumentException(MSG_ONLY_INPUT_NUMBER);
            }
        }
    }
}