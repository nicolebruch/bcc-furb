public class Produto {

    /*
     * Atributos sendo:
     * 
     * • codigo (int) - código único do produto
     * • nome (String) - nome do produto
     * • quantidade (int) - quantidade em estoque
     * • preco (double) - preço unitário
     * • categoria (String) - categoria do produto
     */
    int codigoProduto;
    String nomeProduto;
    int quantidadeEstoque;
    double precoUnitario;
    String categoriaProduto;

    /*
     * Métodos:
     * • Construtor com todos os parâmetros
     */
    public Produto(int codigoProduto, String nomeProduto, int quantidadeEstoque, double precoUnitario, String categoriaProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnitario = precoUnitario;
        this.categoriaProduto = categoriaProduto;
    }

    /*
     * Métodos getters para acesso aos atributos
     */
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    /*
     * • adicionarEstoque(int quantidade) - adiciona produtos ao estoque
     */
    public int adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        return this.quantidadeEstoque;
    }

    /*
     * • removerEstoque(int quantidade) - remove produtos do estoque
     * (retorna boolean indicando sucesso)
     */
    public boolean removerEstoque(int quantidade) {
        if (this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    /*
     * • calcularValorTotal() - retorna o valor total do produto em estoque
     * (quantidade × preço)
     */
    public double calcularValorTotal() {
        return this.quantidadeEstoque * this.precoUnitario;
    }

    /*
     * • toString() - retorna uma representação em String dos dados do produto
     */
    @Override
    public String toString() {
        return "Produto [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto +
               ", quantidadeEstoque=" + quantidadeEstoque + ", precoUnitario=" + precoUnitario +
               ", categoriaProduto=" + categoriaProduto + ", valorTotal=" + calcularValorTotal() + "]";
    }
}
