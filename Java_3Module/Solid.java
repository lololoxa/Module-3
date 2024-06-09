package Java_3Module;

public class Solid {
===============================SOLID ======================================
/*Принципы SOLID — это набор из пяти основных принципов ООП и проектирования, которые помогают
создавать более понятный, гибкий и поддерживаемый код

1. Single Responsibility Principle(Принцип единственной ответственности)
Класс должен иметь только одну причину для изменения, то есть он должен выполнять только одну задачу*/

    public class User {
        private String name;
        private String email;

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public class EmailService {
        public void sendEmail(User user, String message) {
        }

/* 2.Open/Closed Principle (Принцип открытости/закрытости)
Классы должны быть открыты для расширения, но закрыты для модификации*/

        public interface DiscountCalculator {
            double calculateDiscount();
        }

        public class StandardDiscountCalculator implements DiscountCalculator {
            @Override
            public double calculateDiscount() {
                return 0.1;
            }
        }

        public class PremiumDiscountCalculator implements DiscountCalculator {
            @Override
            public double calculateDiscount() {
                return 0.2;
            }
        }

/*3. Liskov Substitution Principle(Принцип подстановки Барбары Лисков)
Объекты в программе должны быть заменяемы экземплярами их подтипов без изменения правильности выполнения программы*/

        public interface Flyable {
            void fly();
        }

        public class Sparrow implements Flyable {
            @Override
            public void fly() { //Логика полета
            }

        }
    }

    public class Ostrich { // Страус не реализует интерфейс Flyable
    }
}


/*4. Interface Segregation Principle(Принцип разделения интерфейса)
Клиенты не должны зависеть от интерфейсов, которые они не используют
Лучше иметь несколько специализированных интерфейсов, чем один общий*/

        public interface Workable {
            void work();
        }

        public interface Eatable {
            void eat();
        }

        public class HumanWorker implements Workable, Eatable {
            @Override
            public void work() { //Логика работы

            }

            @Override
            public void eat() { //Логика еды

            }


/*5. Dependency Inversion Principle(Принцип инверсии зависимостей)
Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
Оба должны зависеть от абстракций. Абстракции не должны зависеть от деталей. Детали должны зависеть от
абстракций.*/

                public interface Switchable {
                    void turnOn();

                    void turnOff();
                }
                public class LightBulb implements Switchable {
                    @Override
                    public void turnOn() { //Логика включения лампочки

                    }

                    @Override
                    public void turnOff() { //Логика выключения лампочки

                    }
                }
                public class Switch {
                    private Switchable device;

                    public Switch(Switchable device) {
                        this.device = device;
                    }

                    public void operate() {
                        device.turnOn();
                    }
                }
            }
        }


