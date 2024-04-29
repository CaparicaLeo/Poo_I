import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Selecione o valor de X: ");
        x = scan.nextInt();
        int[] vetor = new int[6];
        for(int i=0;i<6;i++){
            System.out.print("Selecione o Elemento " + i + " = ");
            vetor[i]=scan.nextInt();
        }
        encontrarMaiorDiferenca(vetor);
        System.out.println("");
        comparaX(vetor,x);
    }
    public static void comparaX(int[] v, int x){
        int upX=0, downX=0, equalX=0;
        for (int i : v) {
            if (x < i) {
                upX++;
            }
            else if(x>i){
                downX++;
            }
            else{
                equalX++;
            }
        }
        System.out.println("Total de numeros maior que X: "+ upX);
        System.out.println("Total de numeros Iguais a X: "+ equalX);
        System.out.println("Total de numeros abaixo de X: "+downX);
    }
    public static void encontrarMaiorDiferenca(int[] vetor) {
        int maiorDiferenca = 0;
        int posicao1 = -1;
        int posicao2 = -1;

        for (int i = 0; i < vetor.length - 1; i++) {
            int diferenca = Math.abs(vetor[i] - vetor[i + 1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                posicao1 = i;
                posicao2 = i + 1;
            }
        }

        if (maiorDiferenca == 0) {
            System.out.println("Não há diferenças consecutivas no array.");
        } else {
            System.out.println("Maior diferença encontrada: " + maiorDiferenca);
            System.out.println("Posições: " + posicao1 + " e " + posicao2);
            System.out.println("Valores: " + vetor[posicao1] + " e " + vetor[posicao2]);
        }
    }
}
