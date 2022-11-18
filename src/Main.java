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






    }
}