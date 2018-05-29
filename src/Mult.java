public class Mult {
    private int baisu;
    private static int c_kaisu = 0;
    private int i_kaisu = 0;

    Mult(int kazu) {
        baisu = kazu;
        System.out.println(baisu + "倍するインスタンスが作成されました");
    }

    public int keisan(int atai) {
        int kotae;

        kotae = atai * baisu;
        c_kaisu++;
        i_kaisu++;
        return kotae;
    }

    public void hyouji() {
        System.out.println(baisu + "倍するインスタンスの");
        System.out.println("インスタンス変数は" + i_kaisu);
        System.out.println(baisu + "倍するインスタンスの");
        System.out.println("クラス変数は" + c_kaisu);
    }
}
