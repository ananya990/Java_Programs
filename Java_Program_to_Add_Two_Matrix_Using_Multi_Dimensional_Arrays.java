public class AddMatrices 
{
    public static void main(String[] args) 
  {
        int rows = 2, columns = 3;
    
        int[][] firstMatrix = { {12, 49, -54}, {10, -12, 27} };
        int[][] secondMatrix = { {78, 34, 10}, {11, 67, -12} };

        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of two matrices is : ");
        for(int[] row : sum) 
        {
            for (int column : row) 
            {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
