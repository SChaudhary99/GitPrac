public class Student {
    String name;
    String phoneNum;
    int math;
    int science;
    int chem;

    public Student(String name,String phoneNum, int math, int science, int chem){
        this.name=name;
        this.phoneNum=phoneNum;
        this.math=math;
        this.science=science;
        this.chem=chem;
    }

    public int totalMarks(){
        return this.math+this.science+this.chem;
    }
    public void result(){
        System.out.println(this.name+" whose phone number is "+this.phoneNum+" is got "+this.totalMarks()+" Total Marks.");
    }
}
