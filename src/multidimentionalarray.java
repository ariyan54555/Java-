import java.util.Scanner;
public class az_mda {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row=in.nextInt();
        System.out.print("Enter the coloumn : ");
        int col=in.nextInt();
        int [][]matrix;
        matrix = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

}
