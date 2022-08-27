public class FolhaDePagamento {
    private double salarioTotal = 0;

    public void registrar(Funcionario funcionario){
        salarioTotal += funcionario.calculaSalario();
    }
    
    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void logar(Autenticavel autenticavel) {
        autenticavel.fazerLogin();
    }
}
