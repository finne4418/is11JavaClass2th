package alice_bob.phase1;

public class MySample {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 16, "日本工学院専門学校");
        alice.printProfile();

        BusinessMan bob = new BusinessMan("Bob", 30, "株式会社ほげほげ");
        bob.printProfile();
    }
}
