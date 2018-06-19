package alice_bob.phase4;

class BusinessMan extends Person implements HaveToDo {
    private String company;

    BusinessMan(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    void printProfile() {
        System.out.println(name + "さんはビジネスマンです。\n" + company + "で働いています。");
    }

    public void printWorks() {
        System.out.println("ビジネスマンなので仕事をします！！");
    }
}
