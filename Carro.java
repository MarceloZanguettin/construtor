public class Carro {
    private String motor;
    private String modelo;
    private int rodas;
    private double preco;
    private String tracao;

    public Carro(){

    }
    
    public Carro(String motor, String modelo, int rodas, double preco){

        this.motor=motor;
        this.modelo=modelo;
        this.rodas=rodas;
        this.preco=preco;

    }

    public Carro(String motor, String modelo, String tracao){

        this.motor=motor;
        this.modelo=modelo;
        this.tracao=tracao;

    }
    public void dadosVeiculo(){
        System.out.println(this.motor);

    }

}
