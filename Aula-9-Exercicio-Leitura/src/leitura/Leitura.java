package leitura;

public class Leitura {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Carolina", 30, "F");
		Pessoa p2 = new Pessoa("Paula", 32, "F");
//		p1.infoPessoa();
//		p2.infoPessoa();
//		p1.fazerAniver();
//		p1.infoPessoa();
		
		Livro l[] = new Livro[4];
		l[0] = new Livro("Harry Potter e o Priosoneiro de Azkaban", "J. K. Rowlling",
				436, p1);		
		l[1] = new Livro("Percy Jackson e o ladrão de raios", "Rick Riordan", 321, p2);
		l[2] = new Livro("Trono de Vidro", "Sarah J. Maas", 527, p1);
		l[3] = new Livro("Crepúsculo", "Stephenie Meyer", 429, p2);		
		
		l[2].abrir();
		l[2].avancarPag();
		l[2].detalhes();
		l[2].voltarPag();
		l[2].detalhes();
		l[2].fechar();
		
		l[1].abrir();
		l[1].detalhes();
		l[1].folhear(100);
		l[1].detalhes();
		l[1].folhear(400);
		l[1].detalhes();
		

	}

}
