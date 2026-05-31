import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Funcionario[] listaFuncionarios = new Funcionario[10]; // Limite de funcionários
    int contadorFuncionarios = 0; // Começa com 0 funcionários cadastrados por padrão

    int opcao;

    do {
            System.out.println("- Sistema de consulta para funcionários");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Buscar funcionário");
            System.out.println("4. Aplicar aumento salarial");
            System.out.println("5. Mostrar folha salarial");
            System.out.println("6. Sair");
            System.out.print("Digite um número: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
}
