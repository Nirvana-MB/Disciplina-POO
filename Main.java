import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // limite da quantidade de dados e funcionarios
    Funcionario[] listaFuncionarios = new Funcionario[10];
    // quantidade de funcionarios no sistema
    int contadorFuncionarios = 0;

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

      switch (opcao) {
        case 1:
          // cadastro dos funcionarios
          if (contadorFuncionarios < listaFuncionarios.length) {
              System.out.print("Digite o nome: ");
              String nome = scanner.nextLine();
              System.out.print("Digite o cargo: ");
              String cargo = scanner.nextLine();
              System.out.print("Digite o salário: ");
              double salario = scanner.nextDouble();
              System.out.print("Digite a matrícula: ");
              int matricula = scanner.nextInt();
              scanner.nextLine(); // Limpa o buffer

              // armazena os dados e cadastra os funcionarios
              listaFuncionarios[contadorFuncionarios] = new Funcionario(nome, cargo, salario, matricula);
              contadorFuncionarios++; // incrementa o total de cadastrados ( +1 no total pro limite )
              System.out.println("Funcionário cadastrado com sucesso");
          } else {
              System.out.println("Erro: O sistema está no limite de cadastro");
          }
          break;

        case 2:
         // exibe os dados e os funcionarios cadastrados
          if (contadorFuncionarios == 0) {
              System.out.println("Nenhum funcionário cadastrado");
          } else {
              System.out.println("- Lista de Funcionários");
              for (int i = 0; i < contadorFuncionarios; i++) {
                  listaFuncionarios[i].exibirDados();
              }
          }
          break;

        case 3:
          // solicita a matricula e busca os funcionarios cadastrados
          System.out.print("Digite a matrícula para buscar: ");
          int buscarMatricula = scanner.nextInt();
          scanner.nextLine();
          
          boolean achouFuncionario = false;

          for (int i = 0; i < contadorFuncionarios; i++) {
              if (listaFuncionarios[i].getMatricula() == buscarMatricula) {
                  listaFuncionarios[i].exibirDados();
                  achouFuncionario = true;
                  break; // Para o loop se achou
              }
          }

          if (achouFuncionario == false) {
              System.out.println("Funcionário não encontrado");
          }
          break;

        case 4:
          // pede a matricula e busca o funcionário para aplicar o aumento
          System.out.print("Digite a matrícula do funcionário: ");
          int matAumento = scanner.nextInt();
          
          boolean achouParaAumento = false;

          for (int i = 0; i < contadorFuncionarios; i++) {
              if (listaFuncionarios[i].getMatricula() == matAumento) {
                  System.out.print("Digite o percentual de aumento: ");
                  double percentual = scanner.nextDouble();
                  scanner.nextLine();

                  listaFuncionarios[i].aplicarAumento(percentual);
                  System.out.println("Aumento aplicado");
                  achouParaAumento = true;
                  break;
              }
          }

          if (achouParaAumento == false) {
              System.out.println("Funcionário não encontrado para aplicar aumento");
          }
          break;

        case 5:
          // exibe a folha salarial dos funcionarios cadastrados
          if (contadorFuncionarios == 0) {
              System.out.println("Folha salarial vazia. Sem funcionários no sistema");
          } else {
              double totalFolha = 0;
              System.out.println("- Folha Salarial");
              for (int i = 0; i < contadorFuncionarios; i++) {
                  System.out.println(listaFuncionarios[i].getNome() + " - R$ " + listaFuncionarios[i].getSalario());
                  totalFolha += listaFuncionarios[i].getSalario();
              }
              System.out.println("Valor total da folha: R$ " + totalFolha);
          }
          break;

        case 6:
          // fecha o sistema de cadastro dos funcionarios
          System.out.println("Desligando sistema de consulta de funcionários..");
          break;
          
        default:
          System.out.println("Opção inválida");
          break;
      }
    } while (opcao != 6);

    scanner.close();
  }
}
