public class Cachorro {

    //atributos
    public String nome;
    public String raca;
    public int idade;

   
    /*Construtor 
    -definição:  método especial que inicializa objetos desta classe. 
    -caracteristicas:
        -sempre tem o memso nome da classe
        -não tem retorno
        -pode se ter mais de um construtor na mesma classe
    */
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }


    
    public void latir(){
        System.out.println("Au au");
    }

    public String latir2(){
        return "Au au";
    }

    public void imprimir(){
        System.out.println("nome: "+nome + " raça: "+ raca +" idade: " + idade);
    }

}
