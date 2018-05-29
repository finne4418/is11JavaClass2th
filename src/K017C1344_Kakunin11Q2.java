public class K017C1344_Kakunin11Q2 {
    public static void main(String[] args) {
        int su1 = Integer.parseInt(args[0]);
        int su2 = Integer.parseInt(args[1]);

        KeisanNormal instance = new KeisanNormal();

        System.out.println("Normalの加算結果 : " + instance.tashisan(su1, su2));
        System.out.println("Staticの加算結果 : " + KeisanStatic.tashisan(su1, su2));
        System.out.println("Normalの減算結果 : " + instance.hikisan(su1, su2));
        System.out.println("Staticの減算結果 : " + KeisanStatic.hikisan(su1, su2));
    }
}
//
//class KeisanStatic {
//    static int tashisan(int su1, int su2) {
//        return su1 + su2;
//    }
//
//    static int hikisan(int su1, int su2) {
//        return su1 - su2;
//    }
//}
//
//class KeisanNormal {
//    int tashisan(int su1, int su2) {
//        return su1 + su2;
//    }
//
//    int hikisan(int su1, int su2) {
//        return su1 - su2;
//    }
//}
