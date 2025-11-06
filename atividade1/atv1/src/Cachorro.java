public class Cachorro {
    
    //atributos
    public String nome;
    public String raca;
    public int idade;

    
    /*Construtor 
        - definição:  método especial que incializa objetos desta classe.
        - caracteristicas: 
            - sempre tem o mesmo nome da classe
            - não tem retorno 
            - pode-se ter mais de um construtor na mesma classe
        */
        public Cachorro(String n, String raca, int idade) {
            this.nome = n;
            this.raca = raca;
            this.idade = idade;
        }
    
        public Cachorro(String n, String raca) {
            this.nome = n;
            this.raca = raca;
        } 
    
        public Cachorro() {
    
        }



    /*metodo latir que não retorna nada:
        public void latir(){...}
            public -> indica que esse método é visível para todos
            void -> indica que o método tem um retorno vazio
            latir -> nome que escolhemos para o métodos
            () -> dentro do parenteses vazio, mostra que o método não espera receber nenhum valor 
    */

    public void latir(){
        System.out.println("Au au");
    }

    //método latir que retorna uma string 
    public String latir2(){

        String str = "Au au de latir2";
        return str;
    }

    public void imprimir(){

        
        System.out.println("nome: "+nome +"  raça: "+ raca +" idade: " + idade);
    }
    


}