import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Selecione numeros inteiros de 0 a 8");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Elemento[%d][%d]: ", i+1,j+1);
                matriz[i][j]= scan.nextInt();
            }
        }
        System.out.println("");;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
