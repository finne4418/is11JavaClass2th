public class K017C1344_Kakunin12Q1 {
    public static void main(String[] args) {
        HensuCheck instance1 = new HensuCheck();
        HensuCheck instance2 = new HensuCheck();

        for (int i = 0; i < 50; i++ ) {
            instance1.plus();
            instance2.minus();
        }

        System.out.println("プラス側のクラス変数 : " + instance1.getClassHensu());
        System.out.println("プラス側のインスタンス変数 : " + instance1.getInstanceHensu());
        System.out.println("マイナス側のクラス変数 : " + instance2.getClassHensu());
        System.out.println("マイナス側のインスタンス変数 : " + instance2.getInstanceHensu());
    }
}

class HensuCheck {
    private static int classHensu = 0;
    private int instanceHensu = 0;

    void plus() {
        classHensu++;
        instanceHensu++;
    }

    void minus() {
        classHensu--;
        instanceHensu--;
    }

    int getClassHensu() {
        return classHensu;
    }

    int getInstanceHensu() {
        return instanceHensu;
    }
}
