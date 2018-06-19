package alice_bob.phase6;

public class MySample {
    public static void main(String[] args) {
        HaveToDo alice = new Student("Alice", 16, "日本工学院専門学校");
        alice.printWorks();

        HaveToDo bob = new BusinessMan("Bob", 30, "株式会社ほげほげ");
        bob.printWorks();
    }
}
