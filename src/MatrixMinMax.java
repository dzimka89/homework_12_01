import java.util.Arrays;
import java.util.Random;

/**
 * Created by Dmitriy on 11.01.2016.
 */
public class MatrixMinMax {
    public static void main(String[] args) {
        Random random = new Random(100);
        int matrix[][] = new int[3][3];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(50);
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        int min = matrix[0][0];
        int min_i = 0;
        int min_j = 0;
        int max = matrix[0][0];
        int max_i = 0;
        int max_j = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    min_i = i;
                    min_j = j;
                } else if( matrix[i][j] > max){
                    max = matrix[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        matrix[min_i][min_j] = max;
        matrix[max_i][max_j] = min;

        System.out.println("Counted matrix:");

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
