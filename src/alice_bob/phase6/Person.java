package alice_bob.phase6;

abstract class Person implements HaveToDo {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void printProfile();

    public abstract void printWorks();
}
