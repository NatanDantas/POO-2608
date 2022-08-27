public final class Presidente extends Funcionario implements Autenticavel {
    public Presidente(int codigo, String nome) {
        super(codigo, nome);
    }

    private double valorDaCotaDeAcoes;

    public double getValorDaCotaDeAcoes() {
        return valorDaCotaDeAcoes;
    }

    public void setValorDaCotaDeAcoes(double valorDaCotaDeAcoes) {
        this.valorDaCotaDeAcoes = valorDaCotaDeAcoes;
    }

    @Override
    public double calculaSalario() {
        return this.getSalario() + valorDaCotaDeAcoes;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Presidente Logando...");
    }

    
    
}
