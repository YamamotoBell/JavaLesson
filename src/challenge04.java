public class challenge04 {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.144);
    }

    // 課題要件②
    // このメソッドは何も返さず（void）、パラメータ から milesPerHour を計算する。
    // 「XX km/h = YY mi/h 」というフォーマットでメッセージを表示する。
    public static void printConversion(double kilometersPerHour) {
        // kmがマイナスの場合
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        //XX km/h = YY mi/h
        System.out.println(kilometersPerHour + " km/h = "
                + toMilesPerHour(kilometersPerHour) + " mi/h ");

    }

    // 課題要件①
    // long 型の計算の丸めた値を返す。
    // パラメータ が 0 より小さい場合、無効な値を示す -1 を返す。
    // 上記以外の場合、miからkmに変換し丸めて返す。
    public static long toMilesPerHour (double kilometersPerHour) {
        // kmがマイナスの場合
        if (kilometersPerHour < 0) {
            return -1;
        }

        // kmからmiに変換（1mi = 1.609km）
        return Math.round(kilometersPerHour / 1.609);
    }
}
