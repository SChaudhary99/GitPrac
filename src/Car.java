import java.util.Scanner;

public class Car {
    int model;
    String brand;
    String color;
    String horn;

    public Car(int model, String color){
        Scanner sc = new Scanner(System.in);


        this.model = model;

        System.out.printf("Enter car brand: ");
        this.brand = sc.next();


        this.color = color;

        System.out.printf("Enter car horn: ");
        this.horn = sc.next();
    }

    void run(){
        System.out.println("Car is running");
    }
    void blowHorn(){
        System.out.println(this.horn);
    }
    void showDetails(){
        System.out.println("model = " + this.model);
        System.out.println("brand = " + this.brand);
        System.out.println("color = " + this.color);
    }

}
