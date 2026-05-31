public class Funcionario {
// 
    private String nome;
    private String cargo;
    private double salario;
    private int matricula;

//
    public Funcionario(String nome, String cargo, double salario, int matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
    }

// 
    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        }
    }

// 
    public void exibirDados() {
        System.out.println("- Matrícula: " + matricula + " | Nome: " + nome + " | Cargo: " + cargo + " | Salário: R$ " + salario);
    }

// 
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
