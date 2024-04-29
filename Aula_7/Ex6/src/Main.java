import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Selecione quantos elementos do primeiro vetor: ");
        x = scan.nextInt(); 
        int a1[]= new int[x];

        System.out.print("Selecione quantos elementos do segundo vetor: ");
        y = scan.nextInt();
        int a2[]= new int[y];

        System.out.println("PRIMEIRO VETOR");
        for (int i = 0; i < a1.length; i++) {
            System.out.print("Selecione o Elemento " + i + " : ");
            a1[i] = scan.nextInt();
        }
        System.out.println("");
        System.out.println("SEGUNDO VETOR");
        for (int i = 0; i < a2.length; i++) {
            System.out.print("Selecione o Elemento " + i + " : ");
            a2[i] = scan.nextInt();
        }

        System.out.println("Soma dos elementos do vetor 1: "+ soma(a1));
        System.out.println("Soma dos elementos do vetor 2: "+ soma(a2));
    }
    public static int soma(int...args) {
        int sum=0;
        for(int i: args){
            sum+=i;
        }
        return sum;
    }
}
