package figure;

public abstract class Figure {
    private int apexes;

    public int getApexes() {
        return apexes;
    }

    public void setApexes(int apexes) {
        this.apexes = apexes;
    }

    public abstract void areaMethod(int su1, int su2);

    public void showApexes() {
        System.out.println("角の数は" + apexes + "個です。");
    }
}