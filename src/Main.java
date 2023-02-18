public class Main {
    public static void main(String[] args) {

        Soham();
        mayur();
        Car obj = new Car(2018,"black");

        obj.showDetails();
        obj.blowHorn();
        obj.run();

        Computer comObj = new Computer(4,1024,"Dell","Black");


    }

    public static void Soham(){
        System.out.println("This is soham's method!");
    }
    public static void mayur(){
        System.out.println("This is Mayur's method!");
    }


}