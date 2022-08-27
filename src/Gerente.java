public class Gerente extends Funcionario implements Autenticavel{

    private String area;
    private double bonus;
    
    public Gerente(int codigo, String nome) {
        super(codigo, nome);
        
    }

    public Gerente(int codigo, String nome, String area, double bonus) {
        super(codigo, nome);
        this.area = area;
        this.bonus = bonus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario() {
        return this.getSalario() + bonus;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Gerente Logando...");
    }
    
}
