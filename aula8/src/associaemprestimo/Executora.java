package associaemprestimo;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class Executora {

	public static void main(String[] args) {
		Capitulo cap1 = new Capitulo();
		Capitulo cap2 = new Capitulo();
	
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		Estante est1 = new Estante();
		Estudante estudante = new Estudante();
		
		Emprestimo empre1 = new Emprestimo();
		
		
		cap1.setNumCapitulo(1);
		cap1.setTituloCapitulo("Introduação");
		cap2.setNumCapitulo(2);
		cap2.setTituloCapitulo("Abstração de Objetos");
		
		List<Capitulo> capList = new ArrayList<Capitulo>();
		capList.add(cap1);
		capList.add(cap2);
		
		livro1.setiSBNLivro(23422);
		livro1.setCapitulos(capList);
		livro2.setiSBNLivro(3243);
		livro2.setCapitulos(capList);
		livro1.setTituloLivro("Transformação de Objetos Reais em Código Fonte");
		livro2.setTituloLivro("Transformação de Objetos Reais em Código Fonte");
		
		List<Livro> livroList = new ArrayList<Livro>();
		livroList.add(livro1);
		livroList.add(livro2);
		
		est1.setNumEstante(1);
		est1.setLivros(livroList);
		
		estudante.setMatrEstudante(2356);
		estudante.setNomeEstudante("Asdrubal do Carmo");
		
		empre1.setEstudantes(estudante);
		empre1.setLivros(livro1);
		empre1.setDataDevolucao(LocalDate.of(2024,10,20));
		empre1.setDataEmprestimo(LocalDate.now());
		
		System.out.println("Emprestimo " + empre1);

	}

}
