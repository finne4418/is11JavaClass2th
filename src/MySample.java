public class MySample {
    public static void main(String[] args) {
        Person alice = new Person();
        Person bob = new Person();

        alice.setProfile("Alice", 16);
        bob.setProfile("Bob", 46);

        alice.printProfile();
        bob.printProfile();
    }
}

class Person {
    private String name;
    private int age;

    void setProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printProfile() {
        System.out.println(name + "さんは" + age + "歳です。");
    }
}