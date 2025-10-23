import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int r1,r2,c1,c2;
            System.out.println("Enter rows and columns of first matrix");
            r1=sc.nextInt();
            c1=sc.nextInt();
            System.out.println("Enter rows and columns of second matrix");
            r2=sc.nextInt();
            c2=sc.nextInt();
            if(c1!=r2)
            {
                System.out.println("Matrix multiplication not possible");
                return;
            }
            int mat1[][]=new int[r1][c1];
            int mat2[][]=new int[r2][c2];
            int res[][]=new int[r1][c2];
            System.out.println("Enter the first matrix");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the second matrix");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    mat2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        res[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(res[i][j]+"  ");
                }
                System.out.println();
            }

        }
    }
}