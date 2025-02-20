public class challenge001 {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calcScore(gameOver, score, levelCompleted, bonus);
        System.out.println("ハイスコアは" + highScore);

        score = 10000;
        levelCompleted = 9;
        bonus = 200;
        System.out.println("次のハイスコアは" +
                calcScore(gameOver, score, levelCompleted, bonus));

    }

    public static int calcScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
        }

        return finalScore;
    }

}