public class challenge005 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
    }

    // 課題要件
    // 2つのパラメータを持つメソッドshouldWakeUpを書く。
    // 第1パラメータはboolean型で、barkingという名前にする。
    // 2番目のパラメーターはその日の時間を表し、int型でhourOfDayという名前、有効範囲は0-23です。
    // hourOfDayパラメータが0より小さいか23より大きい場合はfalseを返します。

    /**
     * 飼い主を起こすか判定（夜中に犬が吠えた場合飼い主を起こす）
     * @param barking 犬が吠えたフラグ（吠えた場合:true）
     * @param hourOfDay 時間（0~23時）
     * @return 夜中(23時~7時)に吠えた場合：true、左記以外：false
     */
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        // 時間が不正の場合、終了
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // 夜中(23時~7時)に吠えた場合、飼い主を起こす。
        return barking && (hourOfDay == 23 || hourOfDay <= 7);
    }

}
