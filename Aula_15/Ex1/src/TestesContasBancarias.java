public class TestesContasBancarias {
    public static void main(String[] args) {
        /* 
        ContaBancaria c1 = new ContaBancaria();
        Não pode se instanciar um objeto de uma classe abstrata.
        */
        ContaSimples contaS = new ContaSimples("Caparica");
        contaS.deposita(3000);
        System.out.println(contaS.toString());
        contaS.retira(3001);
        System.out.println(contaS.toString());

        ContaEspecial contaE = new ContaEspecial("Andre", 100);
        contaE.deposita(3000);
        System.out.println(contaE.toString());
        contaE.retira(3001);
        System.out.println(contaE.toString());
    }
}
