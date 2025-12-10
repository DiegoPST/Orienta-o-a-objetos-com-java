public class CarrinhoDeCompras {
    private List<Pizza> pizzas = new ArrayList<>();
    
    public void adicionar(Pizza pizza) {
        if (pizza.getIngredientes().size() == 0) {
            throw new IllegalArgumentException("Não pode adicionar pizza sem ingredientes!");
        }
        pizzas.add(pizza);
    }
    
    public double getTotal() {
        double total = 0.0;
        for (Pizza p : pizzas) {
            total = total + p.getPreco();
        }
        return total;
    }
}
