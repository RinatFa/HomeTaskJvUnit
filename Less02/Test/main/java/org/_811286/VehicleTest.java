package main.java.org._811286;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("ГАЗ", "Волга", 2004);
        motorcycle = new Motorcycle("ИЖ", "Планета-5", 2008);
    }

    @Test
    void carObjectIsAlsoInstanceOfVehicle() {
        assertThat(car instanceof Vehicle).isEqualTo(true);
        System.out.println("\nВариант 1 выполнен");
        assertThat(car).isInstanceOf(Vehicle.class);
        System.out.println("Вариант 2 выполнен");
        System.out.println("Проверено, что экземпляр объекта Car " +
                "также является экземпляром транспортного средства");
    }

    @Test
    void carIsCreatedWith4Wheelsled() {
        assertThat(car.getNumWheels()).isEqualTo(4);
        System.out.println("\nПроверено, что объект Car создается с 4-мя колесами");
    }

    @Test
    void motorcycleIsCreatedWith2Wheelsled() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
        System.out.println("\nПроверено, что объект Motorcycle создается с 2-мя колесами");
    }

    @Test
    void carReachesSpeed60InTestDrivingMode() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        System.out.println("\nПроверено, что объект Car развивает " +
                "скорость 60 км/ч в режиме тестового вождения");
    }

    @Test
    void motorcycleReachesSpeed75InTestDrivingMode() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        System.out.println("\nПроверено, что объект Motorcycle развивает " +
                "скорость 75 км/ч в режиме тестового вождения");
    }

    @Test
    void carStopsInParkingMode() {
        car.testDrive();
        System.out.print("\nПарковка автомобиля: " + car.getSpeed() + " км/ч -> ");
        car.park();
        System.out.println(car.getSpeed() + " км/ч");
        assertThat(car.getSpeed()).isEqualTo(0);
        System.out.println("Проверено, что в режиме парковки машина останавливается");
    }

    @Test
    void motorcycleStopsInParkingMode() {
        motorcycle.testDrive();
        System.out.print("\nПарковка мотоцикла: " + motorcycle.getSpeed() + " км/ч -> ");
        motorcycle.park();
        System.out.println(motorcycle.getSpeed() + " км/ч");
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
        System.out.println("Проверено, что в режиме парковки мотоцикл останавливается");
    }
}
