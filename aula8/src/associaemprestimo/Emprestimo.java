package associaemprestimo;
import java.time.LocalDate;
import java.util.Date;

public class Emprestimo {
	private LocalDate dataEmprestimo; //= new Date();
	private LocalDate dataDevolucao; //= new Date();
	private Livro livros;
	private Estudante estudantes;
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Livro getLivros() {
		return livros;
	}
	
	public void setLivros(Livro livros) {
		this.livros = livros;
	}
	
	public Estudante getEstudantes() {
		return estudantes;
	}
	
	public void setEstudantes(Estudante estudantes) {
		this.estudantes = estudantes;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	@Override
	public String toString() {
		return "Emprestimo [dataEmprestimo= " + dataEmprestimo + ", dataDevolucao= " + dataDevolucao + ", livros=" + livros
		    + ", estudantes = " + estudantes + "]";
	}
	
	
	

}
