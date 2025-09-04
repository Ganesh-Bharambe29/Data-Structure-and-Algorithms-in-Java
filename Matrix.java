public class Matrix {
        public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Get the dimensions of the matrices
        int rows = matrixA.length;
        int cols = matrixA[0].length;

        // Initialize the resultant matrix
        int[][] resultMatrix = new int[rows][cols];

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                // Set diagonal elements to 0
                if (i == j) {
                    resultMatrix[i][j] = 0;
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


