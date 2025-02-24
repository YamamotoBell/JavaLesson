public class challenge006 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    /**
     * うるう年判定
     * @param year 年
     * @return うるう年の場合：true、左記以外の場合：false
     */
    public static boolean isLeapYear (int year) {
        // 年が有効範囲外の場合、falseを返して終了
        if (year < 1 || year > 9999) {
            return false;
        }

        // 年がうるう年の場合、trueを返して終了
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }

}
