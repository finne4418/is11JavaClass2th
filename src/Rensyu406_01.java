public class Rensyu406_01 {
    public static void main(String[] args) {
        int kekka1, kekka2;
        Mult m1, m2;

        m1 = new Mult(10);
        m2 = new Mult(100);

        kekka1 = m1.keisan(5);
        System.out.println("10倍した答えは" + kekka1);
        m1.hyouji();

        kekka2 = m2.keisan(5);
        System.out.println("100倍した答えは" + kekka2);
        m2.hyouji();
    }
}
