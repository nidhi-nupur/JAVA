public class DSAStaircaseSearch {
    // Function to find the key by linear search on the matrix.
    public static boolean linearSearchFunc(int matrix[][], int key) { // The time complexity of this linear search is O(n*m), where n is the number of rows and m is the number of columns, which is less efficient compared to the staircase search algorithm for sorted matrices.
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) { // When the matrix doesn't exist.
            System.out.println("There is no such matrix.");
            return false;
        }

        // The linearSearch function iterates over each row and column of the matrix.
        // It compares each element with the key.
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == key) { // key found.
                    System.out.println("Key " + key + " found at: (" + row + ", " + column + ")");
                    return true;
                }
            }
        }

        // Key not found.
        System.out.println("Key " + key + " not found in the matrix.");
        return false;
    }


    //  To perform a binary search in a row-wise and column-wise sorted matrix, it apply binary search separately for each row.
    // Function to search for the key in the matrix using binary search for each row.
    // The time complexity of this binary search is O(log(n*m)), where n is the number of rows and m is the number of columns in the matrix. This is because the binary search operates over the entire matrix, which has n*m elements, and the time complexity of binary search is logarithmic with respect to the number of elements in the search space.
    public static boolean binarySearchFunc(int matrix[][], int key) {
        for(int row[] : matrix) { // for (int row[] : matrix) reads as “for each int array[] (named row) in the matrix".
            if(binarySearchRow(row, key)) {
                return true;
            }
        }
        return false;
    }
    // // Function to perform binary search on a sorted array.
    // This func performs a binary search on an individual row.
    public static boolean binarySearchRow(int row[], int key) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(row[mid] == key) {
                return true;
            } else if (row[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }



    //  The time complexity of this algorithm is O(n + m), where n is the number of rows and m is the number of columns in the matrix.
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0; 
        int column = matrix[0].length-1;

        while(row < matrix.length && column >= 0) {
            if(matrix[row][column] == key) {
                System.out.println("The found Key is at (" + row + ", " + column + ")");
                return true;
            } else if(key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }



    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 33;
        // linearSearchFunc(matrix, key);



        // boolean found = binarySearchFunc(matrix, key);
        // if(found) {
        //     System.out.println("key " + key + " found in the matrix.");
        // } else {
        //     System.out.println("key " + key + " not found in the matrix.");
        // }

        staircaseSearch(matrix, key);
    }
}
