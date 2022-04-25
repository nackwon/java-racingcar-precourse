package racingcar.view;

public class RacingCarOutputView {

    private static String PRINT_RESULT = "실행결과";
    private static String PRINT_WINNER = "최종 우승자: ";


    public static void outputResult() {
        System.out.println(PRINT_RESULT);
    }

    public static void outputWinner(String sWinner) {
        System.out.println(PRINT_WINNER + sWinner);
    }

    public static void outputSeveralResult(String carName, String TrackNumber) {
        System.out.println(carName + " : " + TrackNumber);
    }
}
