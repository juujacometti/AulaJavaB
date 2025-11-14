public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 5000, 5);

        // Alteração dos valores inciais por meio do set
        produto.setNome("Computador");
        produto.setPreco(4500);
        produto.setQuantidade(5);

        // Retorna os valores por meio do get, pois as variáveis são privadas
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());
    }
}