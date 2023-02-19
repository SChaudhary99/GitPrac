public class Main {
    public static void main(String[] args) {

       // Soham();
       // mayur();
        Car obj = new Car(2018,"black");

        obj.showDetails();
        obj.blowHorn();
        obj.run();

        Computer comObj = new Computer(4,1024,"Dell","Black");

        Student student1 = new Student("Mayur","4372618006",80,85,90);
        Student student2 = new Student("Soham","9510008006",94,52,88);
        Student student3 = new Student("Lux","1234567890",98,96,60);
        student1.result();
        student2.result();
        student3.result();


    }

}