public class Rensyu409_01 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("親のメソッドを呼び出します。");
        parent.morning();
        parent.evening();

        System.out.println("子のメソッドを呼び出します。");
        child.morning();
        child.evening();
    }
}

class Parent {
    void morning() {
        System.out.println("おはようございます。");
    }

    void evening() {
        System.out.println("こんばんは。");
    }
}

class Child extends Parent {
    void morning() {
        System.out.println("おはよう！");
    }
}
