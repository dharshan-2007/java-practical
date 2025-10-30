import java.util.Scanner;
import java.io.*;

public class FileInformation
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the File Name : ");
            String filename=sc.nextLine();
            File f=new File(filename);
            if(f.exists())
            {
                System.out.println("File Exists");
                System.out.println("Readable : "+f.canRead());
                System.out.println("Writable : "+f.canWrite());
                System.out.println("File type : "+(f.isDirectory()?"Directory":"File"));
                System.out.println("Size : "+f.length());
            }
            else
            {
                System.out.println("File doesnt exist");
            }
        }
    }
}