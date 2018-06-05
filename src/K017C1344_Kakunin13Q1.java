public class K017C1344_Kakunin13Q1 {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer();
        player.play("title");
        player.play("title", 2);
    }
}

class GamePlayer {
    void play(String name) {
        System.out.println(name + "で遊びました");
    }

    void play(String name, int time) {
        System.out.println(name + "を" + time + "時間鑑賞しました");
    }
}
