import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task1");

        //task1
        int clientOS1 = 1;
        if (clientOS1==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS1==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите версию из доступных выше");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task1.2");

        //task1.2
        int clientOS = 0;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task2");


        //task2
        int clientDeviceYear = 2015;
        boolean modelPnoneAndOS = clientDeviceYear<2015 && clientOS == 0;
        if (modelPnoneAndOS){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear<2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите приложение, перейдя по ссылке");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task3");


         //task3"
        int year = 2021;
        boolean leapYear = ((year%4 ==0) && (year%100 != 0)||(year%400==0));
        if (leapYear){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//task4");

        //task4
        int deliveryDistance = 95;
        int deliveryDistance1Day = 20;
        int deliveryDistance2Days = 60-20;
        int deliveryDistance3Days = 100-60;




         //task5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима,январь");
                break;
            case 2:
                System.out.println("Зима,февраль");
                break;
            case 3:
                System.out.println("Весна,март");
                break;
            case 4:
                System.out.println("Весна,апрель");
                break;
            case 5:
                System.out.println("Весна,май");
                break;
            case 6:
                System.out.println("Лето,июнь");
                break;
            case 7:
                System.out.println("Лето,июль");
                break;
            case 8:
                System.out.println("Лето,август");
                break;
            case 9:
                System.out.println("Осень,сентябрь");
                break;
            case 10:
                System.out.println("Осень,октябрь");
                break;
            case 11:
                System.out.println("Осень,ноябрь");
                break;
            case 12:
                System.out.println("Зима,декабрь");
                break;
            default:
                System.out.println("Невозможно определить");

        }























    }
}