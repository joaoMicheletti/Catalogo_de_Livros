import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()){
			for(Livro l: livroList){
				if(l.getAutor().equalsIgnoreCase(autor)){
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()){
			for( Livro l : livroList){
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	public Livro pesquisarProTitulo(String titulo){
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()){
			for(Livro l : livroList){
				if(l.getTitulo().equalsIgnoreCase(titulo)){
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();

		catalogoLivros.adicionarLivro("joao", "Micheletti", 1998);
		catalogoLivros.adicionarLivro("bianca", "Cobra", 1993);
		catalogoLivros.adicionarLivro("valenttina", "Andrade", 2017);
		catalogoLivros.adicionarLivro("manoela", "Nenem", 2020);
		catalogoLivros.adicionarLivro("kali", "cat", 2021);
		catalogoLivros.adicionarLivro("debian", "linux", 2023);

		System.out.println(catalogoLivros.pesquisarPorAutor("Micheletti")); //pesquisando por autor;
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1993, 2017)); //pesquisando pelo intervalode tempo;
		System.out.println(catalogoLivros.pesquisarProTitulo("debian")); //pesquisando pelo titulo;



	}
}
