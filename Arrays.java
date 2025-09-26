
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         int size = input.nextInt();
//         int[] numbers = new int[size];

//         // input
//         System.out.println("Enter the input: ");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = input.nextInt();
//         }

//         // output
//         System.out.println("Output are: ");
//         for (int i = 0; i < size; i++){
//             System.out.print(numbers[i]+" ");
//        }

//     }
// }


public class Arrays {
    public static void main(String[] args) {
        // First matrix
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Second matrix
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Resultant matrix (rows of A × columns of B)
        int rowsA = matrixA.length;        // 2
        int colsA = matrixA[0].length;     // 3
        int rowsB = matrixB.length;        // 3
        int colsB = matrixB[0].length;     // 2

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] result = new int[rowsA][colsB]; // Result matrix

        // Multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}