public class Main {
    public static void main(String[] args) throws Exception {
    
        Cachorro c1 = new Cachorro("c1: bob", "labrador", 4); //criando um objeto cachorro
        Cachorro c2 = new Cachorro("c2: charlie", "pitbull", 7); 
        Cachorro c3 = new Cachorro("c3: nick", "pincher", 2); 

        Cachorro c4 = new Cachorro("c4: nick", "pincher"); 
        Cachorro c5 = new Cachorro(); 
        c5.nome = "joão";
        c5.idade = 7;
        c5.raca = "labrador";

        
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();
        c5.imprimir();
    }
}
