import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();
        tasc6();
        tasc7();


    }


    public static void tasc1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        int newAge = 20;
        if (newAge > 18) {
            System.out.println("Если возраст человека равен " + newAge + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + newAge + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void tasc2() {
        System.out.println("Задача 2");

        int temperature = 2;
        int coldTemperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку!");
        }

        if (coldTemperature < 5) {
        }
        System.out.println("На улице " + coldTemperature + " градусов, можно идти без шапки!");
    }

    public static void tasc3() {
        System.out.println("Задача 3");
        int speed = 15;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int speedFast = 110;
        if (speedFast > 60) {
            System.out.println("Если скорость " + speedFast + ", то придется заплатить штраф");
        }
    }

    public static void tasc4() {
        System.out.println("Задача 4");
        int age = 1;
        if (age < 2) ;
        System.out.println("Если человеку меньше " + age + " года, то ему пора спать.");

        int ageLittle = 5;
        if (ageLittle < 1 || ageLittle > 7) ;
        System.out.println("Если человеку " + ageLittle + " лет, то ему нужно ходить в детский сад.");

        int ageSchool = 12;
        if (ageSchool < 6 || ageSchool > 18) ;
        System.out.println("Если человеку " + ageSchool + " лет, то ему нужно ходить в школу.");

        int ageStudent = 20;
        if (ageStudent < 18 || ageStudent > 24) ;
        System.out.println("Если человеку " + ageStudent + " лет, то его место в университете.");

        int ageWork = 26;
        if (ageWork < 24) ;
        System.out.println("Если человеку " + ageWork + " лет, то о ему пора ходить на работу.");

        int ageElderly = 65;
        if (ageElderly < 60) ;
        System.out.println("Если человеку " + ageElderly + " лет, то он может отдохнуть!!!");
    }

    public static void tasc5() {
        System.out.println("Задача 5");

        System.out.print("Введите ваш возраст: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        System.out.println("Вы с родителями?");
        boolean parents = in.nextBoolean();

        if (age < 5) {
            System.out.println("Если ребенку " + age + " года, то он не может кататься на аттракционе.");
        } else if ((age >= 5 && age <= 14) && parents) {
            System.out.println("Если ребенку " + age + " лет, то он может кататься только в сопровождении взрослого!");
        } else if ((age >= 5 && age <= 14) && !parents) {
            System.out.println("Если ребенку " + age + " лет Если взрослого нет, то кататься нельзя!");
        } else if (age > 14) {
            System.out.println("Если ребенок старше " + age + " лет, то он может кататься свободно один! ");

        }
    }

    public static void tasc6() {
        System.out.println("Задача 6");
        int trainCapacity = 102;
        int sitPlace = 60;
        int remainingSeats = trainCapacity - sitPlace;
        int placeBusy = 60;
        int freePlace = 42;

        if (placeBusy < sitPlace && freePlace < remainingSeats ) {
            System.out.println("В вагоне есть " + (sitPlace - placeBusy) + " сидячих мест, и " + (remainingSeats - freePlace) + " стоячих мест");
        }else if (sitPlace == 60 && remainingSeats <= 42) {
            System.out.println("В вагоне есть " + (remainingSeats - freePlace) + " стоячих мест");
        }else if (sitPlace >= 60 && remainingSeats >= 42) {
            System.out.println("В вагоне есть " + (sitPlace - placeBusy) + " сидячих мест");
        }else {
            System.out.println("Вагон забит полностью");
        }

    }
    public static void tasc7() {
        System.out.println("Задача 7");
        int one = 7;
        int two = 2;
        int three = 17;
        if (one > two) {
            if (one > three) {
                System.out.println("Самое большое число: " +two);
            }else if (three > one) {
                System.out.println("Самое большое число: " + three);
            }
        }

    }
}





