public class K017C1344_Kakunin08Q2 {
    public static void main(String[] args) {
        K017C1344_Kakunin08Q2 instance1 = new K017C1344_Kakunin08Q2();
        K017C1344_Kakunin08Q2 instance2 = new K017C1344_Kakunin08Q2();
        K017C1344_Kakunin08Q2 instance3 = new K017C1344_Kakunin08Q2();

        instance1.asaNoAisatsu();
        instance2.hiruNoAisatsu();
        instance3.yoruNoAisatsu();
    }

    void better() {
        K017C1344_Kakunin08Q2 instance = new K017C1344_Kakunin08Q2();
        instance.asaNoAisatsu();
        instance.hiruNoAisatsu();
        instance.yoruNoAisatsu();
    }

    private void asaNoAisatsu() {
        System.out.println("おはようございます！");
    }

    private void hiruNoAisatsu() {
        System.out.println("こんにちは！");
    }

    private void yoruNoAisatsu() {
        System.out.println("こんばんは！");
    }
}

//おはようございます！
//こんにちは！
//こんばんは！
