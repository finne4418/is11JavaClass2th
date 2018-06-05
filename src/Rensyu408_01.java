public class Rensyu408_01 {
    public static void main(String[] args) {
        Souwa instance;
        int result;

        instance = new Souwa();
        result = instance.calc(10);
        instance.display(result);
    }
}

class Souwa extends Hyouji {
    public int calc(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++ ) {
            result = result + i;
        }
        return result;
    }
}

class Hyouji {
    public void display(int value) {
        System.out.println("答え " + value);
    }
}
