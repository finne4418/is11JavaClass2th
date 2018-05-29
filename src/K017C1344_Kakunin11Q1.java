public class K017C1344_Kakunin11Q1 {
    public static void main(String[] args) {
        KeisanNormal instance = new KeisanNormal();

        System.out.println("Normalの加算結果 : " + instance.tashisan(5, 4));
        System.out.println("Staticの加算結果 : " + KeisanStatic.tashisan(5, 4));
        System.out.println("Normalの減算結果 : " + instance.hikisan(5, 4));
        System.out.println("Staticの減算結果 : " + KeisanStatic.hikisan(5, 4));
    }
}

class KeisanStatic {
    static int tashisan(int su1, int su2) {
        return su1 + su2;
    }

    static int hikisan(int su1, int su2) {
        return su1 - su2;
    }
}

class KeisanNormal {
    int tashisan(int su1, int su2) {
        return su1 + su2;
    }

    int hikisan(int su1, int su2) {
        return su1 - su2;
    }
}
