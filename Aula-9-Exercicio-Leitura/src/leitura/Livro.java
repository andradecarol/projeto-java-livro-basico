package leitura;

public class Livro implements Publicacao{
	
	private String titulo, autor;	
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public void detalhes() {
		System.out.println("_________________________________");
		System.out.println("Nome do livro: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Livro aberto? " + this.isAberto());
		System.out.println("Leitor: " + this.getLeitor().getNome());
		System.out.println("_________________________________");
	}
	
	

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {		
		this.setTitulo(titulo); 
		this.setAutor(autor); 
		this.setTotPaginas(totPaginas);
		this.setLeitor(leitor); 
		this.setAberto(false);
		this.setPagAtual(0);
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		System.out.println("_________________________________");
		this.setAberto(true);	
		System.out.println("Livro foi aberto!");
		System.out.println("_________________________________");
	}

	@Override
	public void fechar() {
		System.out.println("_________________________________");
		this.setAberto(false);
		System.out.println("Livro foi fechado.");
		System.out.println("_________________________________");
	}

	@Override
	public void folhear(int p) {
		System.out.println("_________________________________");
		if(this.isAberto()) {
			if(p > this.getTotPaginas()) {
				this.setPagAtual(this.getPagAtual());
				System.out.println("Esse livro só tem " + this.getTotPaginas() + " páginas");
			}else
			this.setPagAtual(p);
		} else {
			System.out.println("Atenção! O livro está fechado!");
		}
		System.out.println("_________________________________");
	}

	@Override
	public void avancarPag() {
		System.out.println("_________________________________");
		if(this.isAberto()) {
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.println("Você avançou e está na página " + this.getPagAtual());
		} else {
			System.out.println("Atenção! O livro está fechado!");
		}
		System.out.println("_________________________________");
		
	}

	@Override
	public void voltarPag() {
		System.out.println("_________________________________");
		if(this.isAberto()) {
			this.setPagAtual(this.getPagAtual() - 1);
			System.out.println("Você voltou e está na página " + this.getPagAtual());
		} else {
			System.out.println("Atenção! O livro está fechado!");
		}
		System.out.println("_________________________________");
		
	}
	
	

}
