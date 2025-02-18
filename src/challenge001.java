public class challenge001 {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        // ゲームオーバーの場合
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println("最終スコアは" + finalScore);
        }

    }
}
