package alice_bob.phase1;

class Student extends Person {
    private String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    void printProfile() {
        System.out.println(name + "さんは学生です。\n" + school + "に通っています。");
    }
}
