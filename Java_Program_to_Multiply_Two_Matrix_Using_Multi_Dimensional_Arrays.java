public class MultiplyMatrices 
{
    public static void main(String[] args) 
    {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {9, 0, -1}, {0, 0, -6} };
        int[][] secondMatrix = { {7, 3}, {7, 0}, {1, -2} };

        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
      
        System.out.println("Multiplication of two matrices is : ");
        for(int[] row : product) 
        {
            for (int column : row) 
            {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
