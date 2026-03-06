public class FloydTriangle {
    public static void main(String[] args) {

        int rows = 5;     // number of rows
        int num = 1;      // starting number

        for (int i = 1; i <= rows; i++) {     // outer loop for rows
            for (int j = 1; j <= i; j++) {    // inner loop for numbers in row
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // move to next line
        }
    }
}
