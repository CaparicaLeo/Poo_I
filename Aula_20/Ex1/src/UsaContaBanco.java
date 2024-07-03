import  java.util.ArrayList;
import java.util.Random;
public class UsaContaBanco {
    public static void main(String[] args){
        Random random = new Random(); //Aleatorio para quantidade de dinheiro na conta
        ArrayList<ContaBanco> Clientes = new ArrayList<>(); //ArrayList dos Clientes
        ContaBanco[] contas = new ContaBanco[4]; //Vetor para facilitar a instancia dos Clientes
        for(int i=0; i< contas.length; i++){ //For para preencher as info dos clientes
            double valor = random.nextDouble(700) + 1;
            contas[i] = new ContaBanco(i+1,valor);
        }
        for(ContaBanco conta : contas){//Inserindo dentro da ArrayList
            Clientes.add(conta);
        }
        System.out.println("Há " + Clientes.size() + " Clientes");
        for(ContaBanco conta : Clientes){
            System.out.println(conta.toString());
            conta.deposito(50.50);
        }
        for(ContaBanco conta : Clientes){
            System.out.println(conta.toString());
        }
        Clientes.removeFirst();
        System.out.println("Removendo o primeiro cliente da lista...\n" + "Há " + Clientes.size() + " Clientes" );
        System.out.println("Primeiro Cliente da Lista: " + Clientes.getFirst());
        System.out.println("Ultimo Cliente da Lista: "+ Clientes.getLast());



    }

}
