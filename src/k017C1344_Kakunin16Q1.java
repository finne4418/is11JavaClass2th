public class k017C1344_Kakunin16Q1 {
    public static void main(String[] args) {
        Convenience convenience = new Convenience();
        CDshop cdShop = new CDshop();
        GasStation gasStation = new GasStation();

        gasStation.calc(3);
        gasStation.hyouji();

        convenience.calc(4);
        convenience.hyouji();

        cdShop.calc(2);
        cdShop.hyouji();
    }
}

abstract class Arbeit {
    int kingaku = 0;

    abstract void calc(int hour);

    void hyouji() {
        System.out.println(kingaku + "円入手しました。");
    }
}

class Convenience extends Arbeit {
    private static final int PAYMENT_BY_HOUR = 1000;

    void calc(int hour) {
        System.out.println("コンビニで" + hour + "時間働きました。");
        kingaku = PAYMENT_BY_HOUR * hour;
    }
}

class CDshop extends Arbeit {
    private static final int PAYMENT_BY_HOUR = 850;

    void calc(int hour) {
        System.out.println("CDショップで" + hour + "時間働きました。");
        kingaku = PAYMENT_BY_HOUR * hour;
    }
}

class GasStation extends Arbeit {
    private static final int PAYMENT_BY_HOUR = 1000;

    void calc(int hour) {
        System.out.println("スタンドで" + hour + "時間働きました。");
        kingaku = PAYMENT_BY_HOUR * hour;
    }
}