public class Hello {

    public static void main(String[] args) {
        // psvmを補完でmainを作成
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 99;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed happen");
        }

        // 3項演算子：条件 ? trueの場合 : falseの場合
        String makeOfcar = "volkswagen";
        boolean isDomestic = makeOfcar == "volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        // 値を合計し100倍する
        double d1 = 20.00d;
        double d2 = 80.00d;
        double d3 = (d1 + d2) * 100.00d;
        System.out.println("total = " + d3);
        // 40で除算した余りを出す
        double d4 = d3 % 40.00d;
        System.out.println("Remainder = " + d4);
        // 余りの有無を表示する
        boolean b1 = d4 == 0;
        if (!b1) {
            System.out.println("Got some remainder");
        }
    }
}
