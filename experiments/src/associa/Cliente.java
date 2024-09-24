package associa;

public class Cliente {
	private String nome;
  private long CPF;
  private ContaCorrente contaCorrente;

  public Cliente(String nomeInicial, long CPFInicial){
      nome = nomeInicial;
      CPF = CPFInicial;
      contaCorrente = new ContaCorrente(123456);
  }

  public String getNome(){
      return nome;
  }

  public long getCPF(){
      return CPF;
  }

  public ContaCorrente getContaCorrente(){
      return contaCorrente;
  }

}
