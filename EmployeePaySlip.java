import java.util.Scanner;
class Employee{
    String name,address,mail;
    int id;
    long mobile;
    Employee(String name,String address,String mail,int id,long mobile)
    {
        this.name=name;
        this.address=address;
        this.mail=mail;
        this.id=id;
        this.mobile=mobile;
    }
    void display()
    {
        System.out.println("Name : "+name+"\nID : "+id+"\nAddress : "+address+" Mail : "+mail);
    }
}

class Programmer extends Employee{
    double bp;
    Programmer(String name,String address,String mail,int id,long mobile,double bp)
    {
        super(name,address,mail,id,mobile);
        this.bp=bp;
    }
    void calculateAndDisplayPaySlip() {
        double da = 0.97 * bp;
        double hra = 0.10 * bp;
        double pf = 0.12 * bp;
        double club = 0.001 * bp;
        double gross = da + hra + bp;
        double net = gross - (club + pf);
        System.out.println("-----PROGRAMMER PAY SLIP-------");
        display();
        System.out.println("Net Salary : "+net);
    }
}
class Professor extends Employee{
    double bp;
    Professor(String name,String address,String mail,int id,long mobile,double bp)
    {
        super(name,address,mail,id,mobile);
        this.bp=bp;
    }
    void calculateAndDisplayPayslip()
    {
        double da=0.97*bp;
        double hra=0.10*bp;
        double pf=0.12*bp;
        double club=0.001*bp;
        double gross=da+hra+bp;
        double net=gross-(pf+club);
        System.out.println("-------PROFESSOR PAY SLIP-------");
        display();
        System.out.println("Net salary : "+net);
    }
}

class EmployeePaySlip
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Programmer details : Name, Address, Mail, Id, Mobile, Basic Pay");
        Programmer p1=new Programmer(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLong(),sc.nextDouble());
        sc.nextLine();
        System.out.println("Enter Professor details : Name, Address, Mail, Id, Mobile, Basic Pay");
        Professor p2=new Professor(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLong(),sc.nextDouble());
        p1.calculateAndDisplayPaySlip();
        p2.calculateAndDisplayPayslip();
    }
}