/*
 Matriz 1

0	1	2	3	4
0	1	2	3	4
0	1	2	3	4
 */
package matriz1;
import java.util.Arrays;
public class Matriz1 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [3][5];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = j;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
