import java.util.Random;

public class K017C1344_Kakunin12Q2 {
    private static final int LENGTH = 10;

    private int[] bunpu = new int[LENGTH];

    public static void main(String[] args) {
        K017C1344_Kakunin12Q2 instance1 = new K017C1344_Kakunin12Q2();
        K017C1344_Kakunin12Q2 instance2 = new K017C1344_Kakunin12Q2();

        instance1.ransu();
        instance2.ransu();

        for (int i = 0; i < LENGTH; i++ ) {
            System.out.println("[" + i + "]が出た回数 : " + (instance1.get(i) + instance2.get(i)));
        }
    }

    private void ransu() {
        Random random = new java.util.Random();
        for (int i = 0; i < 10; i++ ) {
            int ransu = random.nextInt(LENGTH);
            bunpu[ransu]++;
        }
    }

    private int get(int idx) {
        return bunpu[idx];
    }
}


