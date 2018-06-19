package alice_bob.phase4;

class Student extends Person implements HaveToDo {
    private String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    void printProfile() {
        System.out.println(name + "さんは学生です。\n" + school + "に通っています。");
    }

    public void printWorks() {
        System.out.println("学生なので勉強します！！");
    }
}
