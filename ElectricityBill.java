
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

class EB {

    int consumer_no;
    String name;
    double prev_reading, curr_reading;
    String conn_type;

    EB(int con_num, String cname, double prev, double curr, String t) {
        consumer_no = con_num;
        name = cname;
        prev_reading = prev;
        curr_reading = curr;
        conn_type = t;
    }

    void calculateBill() {
        double amount = 0;
        double units = curr_reading - prev_reading;
        if (conn_type.equalsIgnoreCase("domestic")) {

            if (units <= 100) {
                amount = units * 1;
            } else if (units <= 200) {
                amount = (units - 100) * 2.5 + 100 * 1;
            } else if (units <= 500) {
                amount = (units - 200) * 4 + 100 * 2.5 + 100 * 1;
            } else {
                amount = (units - 500) * 6 + 300 * 4 + 100 * 2.5 * 100 * 1;
            }
        } else {
            if (units <= 100) {
                amount = units * 2;
            } else if (units <= 200) {
                amount = (units - 100) * 4.5 + 100 * 2;
            } else if (units <= 500) {
                amount = (units - 200) * 6 + 100 * 4.5 + 100 * 2;
            } else {
                amount = (units - 500) * 8 + 300 * 6 + 100 * 4.5 * 100 * 2;
            }
        }
        System.out.println("--------------ELECTRICITY BILL------------------");
        System.out.println("Consumer No : " + consumer_no);
        System.out.println("Consumer Name : " + consumer_no);
        System.out.println("Units consumed : " + units);
        System.out.println("Connection Type : " + conn_type);
        System.out.println("Total Amount : " + amount);
    }
}

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Consumer Number : ");
        int c_no=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Consumer Name : ");
        String c_name=sc.nextLine();
        System.out.print("Enter previous reading : ");
        Double pred=sc.nextDouble();
        System.out.print("Enter current reading : ");
        Double cred=sc.nextDouble();
        sc.nextLine();
        System.out.print("Connection Type : ");
        String ctype=sc.nextLine();
        EB consumer1=new EB(c_no,c_name,pred,cred,ctype);
        consumer1.calculateBill();
    }
}
