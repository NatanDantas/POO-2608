public class App {
    public static void main(String[] args) throws Exception {
        /*Inicia e seta o salario do funcionario 1 */
        var funcionario1 = new Engenheiro(140801, "José");
        funcionario1.setSalario(5000);
        
        /*Inicia e seta o salario do funcionario 2 */
        var funcionario2 = new Gerente(140802, "Natan");
        funcionario2.setSalario(6000);
        funcionario2.setBonus(2000);
        
        /*Inicia e seta o salario do funcionario 3 */
        var funcionario3 = new Presidente(140802, "Neithan");
        funcionario3.setSalario(10000);
        funcionario3.setValorDaCotaDeAcoes(5000000);

        /*Inicia, cria a folha de pagamento, e calcula o total de salarios da empresa */
        var folha = new FolhaDePagamento();
        folha.registrar(funcionario1);
        folha.registrar(funcionario2);
        folha.registrar(funcionario3);
        System.out.println("TOTAL =" + folha.getSalarioTotal());

        //folha.logar(funcionario1);
        folha.logar(funcionario2);
        folha.logar(funcionario3);
        folha.logar(new Auditor());
    }
}
