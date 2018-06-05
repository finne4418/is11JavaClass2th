public class MySample {
    public static void main(String[] args) {
        Student alice = new Student("Alice Green", 16, "日本工学院専門学校");
        Student bob = new Student("Boby White", 46, "日本工学院専門学校");

        alice.printProfile();
        bob.printProfile();
    }
}

class Student extends Person {
    private String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    void printProfile() {
        System.out.println(name + "さんは" + age + "歳です。\n" + school + "に通っています。");
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @SuppressWarnings("unused")
    void printProfile() {
        System.out.println(name + "さんは" + age + "歳です。");
    }
}


//2018.05.29
//public class MySample {
//    public static void main(String[] args) {
//        Person alice = new Person("Alice Green", 16);
//        Person bob = new Person("Boby White", 46);
//
//        alice.printProfile();
//        bob.printProfile();
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void printProfile() {
//        System.out.println(name + "さんは" + age + "歳です。");
//    }
//}



//2018.05.22
//public class MySample {
//    public static void main(String[] args) {
//        Person alice = new Person();
//        Person bob = new Person();
//
//        alice.setProfile("Alice", 16);
//        bob.setProfile("Bob", 46);
//
//        alice.printProfile();
//        bob.printProfile();
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    void setProfile(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void printProfile() {
//        System.out.println(name + "さんは" + age + "歳です。");
//    }
//}