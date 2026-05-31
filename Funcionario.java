public class Funcionario {
    // Atributos privados
    private String nome;
    private String cargo;
    private double salario;
    private int matricula;

    // Construtor
    public Funcionario(String nome, String cargo, double salario, int matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
    }

    // Método para aplicar o aumento salarial baseado no percentual
    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        }
    }

    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("- Matrícula: " + matricula + " | Nome: " + nome + " | Cargo: " + cargo + " | Salário: R$ " + salario);
    }

    // Getters para a classe Main conseguir consultar as informações do objeto
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }
}
