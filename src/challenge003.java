public class challenge003 {
    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);
    }

    // 課題要件
    // このメソッドはいかなる値も返してはならない：
    // パラメータ number が > 0 の場合、"positive" と出力する。
    // パラメータ番号が < 0 なら "negative"
    // パラメータ番号が0に等しい場合は "zero"
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
