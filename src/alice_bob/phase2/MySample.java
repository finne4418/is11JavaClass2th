package alice_bob.phase2;

public class MySample {
    public static void main(String[] args) {
        Person alice = new Student("Alice", 16, "日本工学院専門学校");
        alice.printProfile();

        Person bob = new BusinessMan("Bob", 30, "株式会社ほげほげ");
        bob.printProfile();
    }
}
