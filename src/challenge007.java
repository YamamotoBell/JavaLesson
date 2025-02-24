public class challenge007 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    /**
     * 数値（小数点含む）の小数点以下3桁まで等しいか判定
     * @param dob1 数値（小数点含む）
     * @param dob2 数値（小数点含む）
     * @return 小数点以下3桁まで等しい場合：true、左記以外の場合：false
     */
    public static boolean areEqualByThreeDecimalPlaces (double dob1, double dob2) {
        // 小数点以下4桁で切り捨て
        long num1 = (long) (dob1 * 1000);
        long num2 = (long) (dob2 * 1000);

        // 比較結果を返す
        return num1 == num2;
    }

}
