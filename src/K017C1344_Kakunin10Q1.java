public class K017C1344_Kakunin10Q1 {
    public static void main(String[] args) {
        final int NUMBER = 12345;

        K017C1344_Kakunin10Q1 instance = new K017C1344_Kakunin10Q1();
        System.out.printf("指定した数値[%d]の倍数は%d", NUMBER, instance.nibai(NUMBER));
    }

    private int nibai(int suchi) {
        return suchi * 2;
    }
}
