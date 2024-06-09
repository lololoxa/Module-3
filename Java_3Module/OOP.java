package Java_3Module;

public class OOP {
/*        ===================================== OOP ======================================
    ООП (объектно-ориентированое програмирование) - параддигма програмирования,
основанная на представлении программы в виде объектов.

    Инкапсуляция - cокрытие деталей реализации и объединение данных и методов,
работающих с ними, в единую структуру (объект).
Очевидные примеры инкапсуляции :

    • это модификаторы доступа (private, defolt, protected, public)
    • это класс, внутри которого описываем детали, используем далее везде
    • на более высоком уровне, чем класс - это доступ на уровне пакета
    • это также геттеры-сеттеры.*/

    public class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /*Наследование - cпособность объекта или класса базироваться на другом объекте или классе;
это основной способ для реализации повторного использования кода.*/

    public class Animal {
        protected String name;

        public void eat() {
            System.out.println("Animal is eating.");
        }
    }

    public class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking.");
        }
    }

    /*Полиморфизм: Идея, согласно которой объекты разных классов могут быть обработаны
через интерфейсы одного и того же базового класса; это также позволяет объектам
иметь разные реализации одного и того же метода.*/

    public class Shape {
        public void draw() {
            System.out.println("Drawing a shape.");
        }
    }

    public class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    public class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square.");
        }
    }

    /*Абстракция - cпособность концентрироваться на важных характеристиках объекта, а не на его конкретных деталях */

    public abstract class Vehicle {
        protected String brand;

        public abstract void start();

        public void stop() {
            System.out.println("Vehicle stopped.");
        }
    }

    public class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car started.");
        }
    }

}