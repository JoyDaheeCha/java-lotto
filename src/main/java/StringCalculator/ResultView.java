package StringCalculator;

public class ResultView {

    private ResultView() {
    }

    public static void printSum(WholeNumber number) {
        System.out.println("결과값은 " + number.getValue() + "입니다.");
    }
}
