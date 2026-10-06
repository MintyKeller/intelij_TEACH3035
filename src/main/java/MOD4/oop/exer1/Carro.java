package MOD4.oop.exer1;

public class Carro {
    /*Crie uma classe chamada Carro com os atributos marca, modelo e
ano.Crie um construtor para a classe Carro que recebe esses atributos
como parâmetros e inicializa os campos. Crie um método
getDescricao que retorna uma string contendo a descrição do carro no formato
"Marca: [marca], Modelo: [modelo], Ano: [ano]".*/

    String marca;
    String modelo;
    int ano;

    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void getDescricao() {
        System.out.println("Marca: ["+ marca +"], Modelo: ["+ modelo +"], Ano: ["+ ano +"]");
    }


}
