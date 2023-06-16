package io.itpl;
import java.util.Scanner;

class diagonalDifference
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        if(r != c)
        {
            System.out.println("Sorry,Matrix should be square.");
            return;
        }

        int[][] array = new int[r][c];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.printf("Enter element [%d][%d]: \n",i,j);
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is ");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int left_to_right_diagonal_sum = 0;
        for(int i=0; i<r; i++)
        {
            left_to_right_diagonal_sum += array[i][i];
        }
        System.out.println("Left To Right Diagonal Sum: " + left_to_right_diagonal_sum);

        int right_to_left_diagonal_sum = 0; int i; int j;
        for(i=0, j=c-1; i<r; i++, j--)
        {
            right_to_left_diagonal_sum += array[i][j];
        }
        System.out.println("Right To Left Diagonal Sum: " + right_to_left_diagonal_sum);

        int absolute_diff = Math.abs(left_to_right_diagonal_sum - right_to_left_diagonal_sum);
        System.out.println("The Absolute Difference Of The Given Matrix: " + absolute_diff);
    }
}