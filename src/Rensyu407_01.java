public class Rensyu407_01 {
    public static void main(String[] args) {
        Tashizan inst;

        inst = new Tashizan();
        inst.plus(1, 2);
        inst.plus(10, 20, 30);
        inst.plus(10.12, 0.345);
    }
}

class Tashizan {
    public void plus(int... nums) {
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        System.out.println(result);
    }

    public void plus(double... nums) {
        double result = 0.0;
        for (double d : nums) {
            result += d;
        }
        System.out.println(result);
    }
}
