public class challenge002 {
    public static void main(String[] args) {
        printResult("Mike", calcScorePosition(1500));
        printResult("James", calcScorePosition(1000));
        printResult("Tim", calcScorePosition(500));
        printResult("Cony", calcScorePosition(100));
        printResult("Bird", calcScorePosition(25));
    }

    public static void printResult(String playerName, int scorePosition) {
        System.out.println(playerName + "のスコアポジションは" + scorePosition + "でした。");
    }

    public static int calcScorePosition(int score) {
        int position = 4;
        // 1000以上の場合
        if (score >= 1000) {
            position = 1;

        } else if (score >= 500) {
            position = 2;

        } else if (score >= 100) {
            position = 3;

        }
        return position;

    }
}
