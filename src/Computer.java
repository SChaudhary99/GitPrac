public class Computer {
    int ram;
    int storage;
    String brand;
    String color;
    public Computer(int ram,int storage,String brand,String color){
        this.ram=ram;
        this.storage=storage;
        this.brand=brand;
        this.color=color;
    }

    public void boot(){
        System.out.print("Welcome to the Computer");
    }
    public void shutDown(){
        System.out.println("Shutting Down");
    }

}
