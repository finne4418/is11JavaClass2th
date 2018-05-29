public class K017C1344_Kakunin10Q2 {
    private static final int NUMBER = 12345;

    public static void main(String[] args) {
        K017C1344_Kakunin10Q2 instance = new K017C1344_Kakunin10Q2();

        System.out.printf("渡した数値[%d]の倍数は%d", NUMBER, instance.nibai(NUMBER));
        System.out.println();
        System.out.printf("渡した数値[%d]の３倍の数は%d", NUMBER, instance.sanbai(NUMBER));
    }

    private int nibai(int suchi) {
        return suchi * 2;
    }

    private int sanbai(int suchi) {
        return suchi * 3;
    }
}
