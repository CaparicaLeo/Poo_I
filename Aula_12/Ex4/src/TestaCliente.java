public class TestaCliente{
    public static void main(String[] args){
        Cliente c1 = new Cliente("Leo",7800, 10000);
        ClienteEspecial c2 = new ClienteEspecial("Rafael", 10000, 50000);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}