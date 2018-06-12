public class K017C1344_Kakunin14Q1 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        PatrolCar patrolCar = new PatrolCar();

        bus.put(10);
        bus.drive(200);
        bus.drop(10);

        patrolCar.siren();
        patrolCar.drive(100);
    }
}

class Car {
    void drive(int num) {
        System.out.println(num + "km走りました");
    }
}

class Bus extends Car {
    void put(int num) {
        System.out.println("乗客を" + num + "人乗せました");
    }

    void drop(int num) {
        System.out.println("乗客を" + num + "人降ろしました");
    }
}

class PatrolCar extends Car {
    void siren() {
        System.out.println("サイレンを鳴らしました");
    }
}
