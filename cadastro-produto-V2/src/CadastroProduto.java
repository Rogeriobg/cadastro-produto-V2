import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o código do produto:");
        int codigoProduto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Por favor, digite a categoria do produto:");
        String categoriaProduto = scanner.nextLine();

        System.out.println("Por favor, digite a quantidade em estoque:");
        int quantidadeProduto = scanner.nextInt();

        System.out.println("Por favor, digite o preço unitário:");
        double precoUnitario = scanner.nextDouble();

        double valorTotalEstoque = quantidadeProduto * precoUnitario;

        System.out.println("\nProduto cadastrado com sucesso!");
        System.out.println("Código: " + codigoProduto);
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Categoria: " + categoriaProduto);
        System.out.println("Quantidade em Estoque: " + quantidadeProduto);
        System.out.printf("Preço Unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor Total em Estoque: R$ %.2f%n", valorTotalEstoque);

        scanner.close();
    }
}