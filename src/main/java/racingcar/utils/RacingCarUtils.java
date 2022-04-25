package racingcar.utils;

public class RacingCarUtils {

    private static int ZERO = 0;
    private static int PROMOTE_NUMBER = 4;

    private static String SPLIT_CODE = ",";
    private static String ERROR_NUMBER_FORMAT = "횟수는 정수로 입력하세요.";

    public static String[] splitName(String sNames) {
        if(isCheckSplit(sNames))
            return sNames.split(SPLIT_CODE);
        return null;
    }

    private static boolean isCheckSplit(String sNames) {
        return sNames.contains(SPLIT_CODE);
    }

    public static int roundNumber(String sNumber) {
        if(isCheckNumberFormat(sNumber)) {
            return Integer.parseInt(sNumber);
        }
        return 0;
    }

    private static boolean isCheckNumberFormat(String sNumber) {
        int result = 0;
        try {
            result = Integer.parseInt(sNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException(ERROR_NUMBER_FORMAT);
        }

        if(result < ZERO) {
            throw new IllegalArgumentException(ERROR_NUMBER_FORMAT);
        }
        return true;
    }

}
