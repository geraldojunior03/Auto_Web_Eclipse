#language: pt
#encoding UTF-8

Funcionalidade: Filtros

@aumentarMostrado @organizacaoProdutos
Cenário: Aumentar produtos mostrados por página
Dado o acesso ao site natura.com.br e que esteja dentro da categoria Corpo e Banho > Sabonete
Quando clicar na lista de Mostrar por página e selecionar a opção "36"
Então o sistema deve exibir trinta e seis itens na página

@diminuirMostrados @organizacaoProdutos
Cenário: Diminuir produtos mostrados por página
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Corpo e Banho > Sabonete e que o Mostrar página esteja como "36"
Quando clicar na lista de Mostrar por página e selecionar a opção "12"
Então o sistema deve exibir doze itens na página

@ordenarAZ @organizacaoProdutos
Cenário: Ordenar lista por A-Z
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Promoções
Quando clicar na lista de Ordenar por: e selecionar a opção "A-Z"
Então o sistema deve organizar os produtos em ordem alfabética

@ordenarZA @organizacaoProdutos
Cenário: Ordenar lista por Z-A
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Promoções
Quando clicar na lista de Ordenar por: e selecionar a opção "Z-A"
Então o sistema deve organizar os produtos em ordem alfabética inversa

@ordenarMenorPreco @organizacaoProdutos
Cenário: Ordenar lista por menor preço
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Promoções
Quando clicar na lista de Ordenar por: e selecionar a opção "Menor Preço"
Então o sistema deve organizar os produtos em ordem crescente de preço

@ordenarMaiorPreco @organizacaoProdutos
Cenário: Ordenar lista por maior preço
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Promoções
Quando clicar na lista de Ordenar por: e selecionar a opção "Maior Preço"
Então o sistema deve organizar os produtos em ordem decrescente de preço

@ordernarMaiorDesconto @organizacaoProdutos
Cenário: Ordenar lista por maior desconto
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Promoções
Quando clicar na lista de Ordenar por: e selecionar a opção "Maior Desconto"
Então o sistema deve organizar os produtos em ordem decrescente de desconto

@carregarTodosResultados @organizacaoProdutos
Cenário: Carregar todos os resultados
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Cabelos > Finalizador
Quando clicar Carregar mais resultados até não haver mais produtos
Então o sistema deve esconder o botão Carregar mais resultados da tela

@DiminuirMostradosAposTodosCarregados @organizacaoProdutos
Cenário: Diminuir produtos mostrados após carregar mais resultados
Dado o acesso ao site natura.com.br, que esteja dentro da categoria Cabelos > Finalizadores e que o Mostrar por página: esteja como "24"
Quando clicar Carregar mais resultados até não haver mais produtos e, depois, alterar o Mostrar por página: para "12"
Então o sistema deve voltar a mostrar apenas doze produtos na lista
