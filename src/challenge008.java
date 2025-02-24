public class challenge008 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));

    }

    /**
     * 引数1と引数2の合計が引数3と等しいか判定
     * @param num1 合計する値
     * @param num2 合計する値
     * @param num3 合計
     * @return 等しい場合：true、左記以外の場合：false
     */
    public static boolean hasEqualSum (int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}
