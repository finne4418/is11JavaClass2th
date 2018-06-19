public class k017c1344_Kakunin15Q1 {
    public static void main(String[] args) {
        Suzume suzume = new Suzume();
        Penguin penguin = new Penguin();

        System.out.println("スズメは");
        suzume.idou();
        suzume.eat();

        System.out.println("ペンギンは");
        penguin.idou();
        penguin.eat();
    }
}

class Bird {
    void idou() {
        System.out.println("飛んで移動します。");
    }

    void eat() {
        System.out.println("エサを食べます。");
    }
}

class Suzume extends Bird {
    void eat() {
        System.out.println("昆虫などを食べます。");
    }
}

class Penguin extends Bird {
    void idou() {
        System.out.println("泳いで移動します。");
    }

    void eat() {
        System.out.println("魚を食べます。");
    }
}
