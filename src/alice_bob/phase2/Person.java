package alice_bob.phase2;

class Person {
    String name;
    @SuppressWarnings("WeakerAccess")
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printProfile() {
        System.out.println(name + "さんは人間です。");
    }
}
