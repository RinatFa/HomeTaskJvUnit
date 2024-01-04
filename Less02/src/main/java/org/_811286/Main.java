package main.java.org._811286;

public class Main {
    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):
             Vehicle, Car, Motorcycle
         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))
         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
              (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения
              (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения
              транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения
              транспорта) мотоцикл останавливается (speed = 0)
    */
    public static void main(String[] args) {
        Car car = new Car("ГАЗ", "Волга", 2004);
        Motorcycle motorcycle = new Motorcycle("ИЖ", "Планета-5", 2008);
        System.out.println();
        if (car instanceof Vehicle) {
            System.out.println("Автомобиль является экземпляром транспортного средства");
        }
        System.out.println("Количество колес у автомобиля: " + car.getNumWheels());
        System.out.println("Количество колес у мотоцикла: " + motorcycle.getNumWheels());
        car.testDrive();
        System.out.println("Скорость автомобиля в режиме тестового вождения: " +
                car.getSpeed() + " км/ч");
        motorcycle.testDrive();
        System.out.println("Скорость мотоцикла в режиме тестового вождения: " +
                motorcycle.getSpeed() + " км/ч");
        car.testDrive();
        System.out.print("Парковка автомобиля: " + car.getSpeed() + " км/ч -> ");
        car.park();
        System.out.println(car.getSpeed() + " км/ч");
        motorcycle.testDrive();
        System.out.print("Парковка мотоцикла: " + motorcycle.getSpeed() + " км/ч -> ");
        motorcycle.park();
        System.out.println(motorcycle.getSpeed() + " км/ч");
    }
}
