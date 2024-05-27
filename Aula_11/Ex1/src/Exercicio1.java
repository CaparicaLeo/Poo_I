import java.util.*;
public class Exercicio1 {
    public static void main(String args[]) {
        verificar("Hoje tem aula de POOI");
        verificar("verdade");
        verificar("aeiou");

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEscreva uma palavra: ");
        String palavraUm = scan.nextLine();
    
        System.out.print("Escreva outra palavra: ");
        String palavraDois = scan.nextLine();

        igual(palavraUm, palavraDois);

        System.out.print("\nEscreva uma palavra: ");
        String palavraTres = scan.nextLine();

        verificaPalavra(palavraTres);

        System.out.print("\nEscreva uma palavra: ");
        String palavraQuatro = scan.nextLine();
        System.out.println("UPPERCASE: "+ maiuscula(palavraQuatro));
        scan.close();
    }

   
    public static void verificar(String frase) {
        int tam = frase.length();
        int qtde = 0;
        System.out.println("Total caracteres string: " + frase + " = " + tam);
        for (int i = 0; i < tam; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A'
            || frase.charAt(i) == 'e' || frase.charAt(i) == 'E'
            || frase.charAt(i) == 'i' || frase.charAt(i) == 'I'
            || frase.charAt(i) == 'o' || frase.charAt(i) == 'O'
            || frase.charAt(i) == 'u' || frase.charAt(i) == 'U')
            qtde++;
        }
        System.out.println("Quantidade de vogais = " + qtde);
    }
    
    public static void verificaPalavra(String palavra){
        if(palavra.length() < 8){
            System.out.println("ERRO!!! Palavra digitada precisa ter no minimo 8 caracteres!!!");
        }
        else{
            String primeiro,ultimo;
            primeiro = palavra.substring(0, 2);
            ultimo = palavra.substring(palavra.length()-2);
            String novaPalavra;
            novaPalavra = primeiro + ultimo;

            System.out.println("Nova palavra: " + novaPalavra);
        }
    }

    public static String maiuscula(String palavra){
        String novaString;
        novaString = palavra.toUpperCase();
        return novaString;
    }
    public static void igual(String palavraUm, String palavraDois){
        if(palavraUm.equals(palavraDois) && palavraDois.equals(palavraUm)){
            System.out.println("As palavras " + palavraUm + " e " + palavraDois
            + " sao iguais!!!");
        }
        else{
            if(palavraUm.equalsIgnoreCase(palavraDois) && palavraDois.equalsIgnoreCase(palavraUm)){
                System.out.println("As palavras " + palavraUm + " e " + palavraDois
                + " sao iguais!!!");
            }
            else{
                System.out.println("As palavras " + palavraUm + " e " + palavraDois
            + " nao sao iguais!!!");
            }
        }
    }

}
   