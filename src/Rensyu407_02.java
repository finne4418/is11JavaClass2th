public class Rensyu407_02 {
    public static void main(String[] args) {
        CD music = new MusicCD();
        CD game = new GameCD();
        Player player = new Player();

        player.play(music);
        player.play(game);
    }
}

class Player {
    public void play(CD cd) {
        System.out.println(cd.getTitle() + "を聴いています。");
    }
}

class MusicCD extends CD {
    MusicCD() {
        super("シングルベスト");
    }
}

class GameCD extends CD {
    GameCD() {
        super("トランプゲーム");
    }
}

class CD {
    private String title;

    CD(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}
