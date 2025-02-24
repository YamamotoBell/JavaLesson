public class challenge009 {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }

    /**
     * 引数に13以上19以下の値が含まれているか判定
     * @param num1 数値
     * @param num2 数値
     * @param num3 数値
     * @return 条件を満たす場合：true、左記以外の場合：false
     */
    public static boolean hasTeen (int num1, int num2, int num3) {
        // 引数に13以上19以下の値が含まれているか判定
        return (num1 > 12 && num1 < 20)
                || (num2 > 12 && num2 < 20)
                || (num3 > 12 && num3 < 20);
    }

    /**
     * 引数が13以上19以下か判定
     * @param num1 数値
     * @return 条件を満たす場合：true、左記以外の場合：false
     */
    public static boolean isTeen (int num1) {
        return num1 > 12 && num1 < 20;
    }
}
