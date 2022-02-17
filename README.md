
![programacao-java](https://user-images.githubusercontent.com/62728757/154475418-a971c6b3-5802-4302-8485-2f40e8022e52.jpg)



# Projeto iniciante de aprendizado Java OO

Mini projeto utilizando conhecimentos básicos como encapsulamento, interface e relacionamentos.
Se trata de um aplicativo de leitura de livros.

## :hammer: Funcionalidades do projeto

- `Abrir o livro`: Para iniciar a leitura, deve-se chamar o método abrir();
- `Avançar página`: Ao chamar o método avancarPag(), o livro vai para a página seguinte;
- `Voltar página`: Ao chamar o método voltarPag(), o livro volta para a página anterior;
- `Folhear o livro`: Para folhear deve-se chamar o método folhear() passando como parâmetro o número de páginas que deseja;
- `Fechar o livro`: Ao chamar o método fechar() o livro será fechado.

## :scroll: Regras

- Só é possível avançar, voltar e folhear páginas se o livro estiver aberto;
- Só é possível folhear para determinada página, se ela for menor que o total de páginas do livro.

## :checkered_flag: Testando as funcionalidades e regras

Para verificar o status do Livro e comparar o antes e depois dos métodos chamados, basta chamar detalhes().
Será exibido o nome do livro, o autor, o total de páginas, a página atual e a informação se o livro está ou não aberto e o leitor.

## :pencil2: Observações
- Projeto criado graças as aulas de POO do canal curso em vídeo.
