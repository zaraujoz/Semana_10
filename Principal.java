public class Principal {
    public static void main(String[] args) {
        Funcionario f=new Funcionario();

        f.setNome("Matheus Araujo");
        f.setCpf("47699316894");
        f.setDepartamento("Programador Aprendiz");
        f.setSalario(12000);

        System.out.println("O funiconário de nome " + f.getNome());
        System.out.println("Com o CPF " + f.getCpf());
        System.out.println("Exerce a função de " + f.getDepartamento());
        System.out.println("Por isso recebe o salário no valor de R$" + f.getSalario());
        System.out.println("O salário com a comissão fica R$" + f.bonificacao());

    }
}
