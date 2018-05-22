public class K017C1344_Kakunin09Q2 {
    public static void main(String[] args) {
        Gohan2 gohan1 = new Gohan2();
        Gohan2 gohan2 = new Gohan2();
        Gohan2 gohan3 = new Gohan2();

        gohan1.asaGohan();
        gohan2.hiruGohan();
        gohan3.yoruGohan();
    }

    void better() {
        Gohan2 gohan = new Gohan2();
        gohan.asaGohan();
        gohan.hiruGohan();
        gohan.yoruGohan();
    }
}

class Gohan2 {
    void asaGohan() {
        System.out.println("目玉焼きとみそ汁です。");
    }

    void hiruGohan() {
        System.out.println("とんかつ定食です。");
    }

    void yoruGohan() {
        System.out.println("焼肉食べ放題です。");
    }
}

//目玉焼きとみそ汁です。
//とんかつ定食です。
//焼肉食べ放題です。
