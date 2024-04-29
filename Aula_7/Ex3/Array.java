import java.util.*;

public class Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1[] = new double[5];
        double sum=0, media=0;
        for(int i=0;i<5;i++){
            a1[i]= scanner.nextDouble();
            sum+= a1[i];
        }
        media = sum/5;
        System.out.println("Media dos valores: "+ media);
    }
}