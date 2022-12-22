#language: pt
#encoding UTF-8

Funcionalidade: Busca

@tituloDisponivel @buscarProdutos
Cenário: Pesquisar título de produto disponível
Dado o acesso ao site natura.com.br
Quando escrever "Kaiak Aero Desodorante Colônia Masculino" na barra de busca e pressionar o botão enter no teclado
Então o produto pesquisado deve aparecer na lista de produtos

@palavraChaveDisponivel @buscarProdutos
Cenário: Pesquisar palavra-chave de produto disponível
Dado o acesso ao site natura.com.br
Quando escrever "Aero" na barra de busca e pressionar o botão enter no teclado
Então os produtos com esta palavra-chave devem aparecer na lista de produtos

@historicoBusca @buscarProdutos
Cenário: Pesquisar pelo histórico de busca
Dado o acesso ao site natura.com.br e que já exista um termo pesquisado
Quando clicar na barra de busca e clicar em um termo já pesquisado
Então o sistema deve levar para a página de busca deste termo

@produtoInexistente @buscarProdutos
Cenário: Pesquisar produto inexistente
Dado o acesso ao site natura.com.br
Quando escrever "Boné" na barra de busca e pressionar o botão enter no teclado
Então o sistema deve redirecionar para uma página com erro de busca

#####################

@limparHistorico @menuDeBusca
Cenário: Limpar histórico de busca
Dado o acesso ao site natura.com.br e que já exista um termo pesquisado
Quando clicar na barra de busca e clicar em Limpar
Então o sistema apagar toda a lista do histórico

@maisResultados @menuDeBusca
Cenário: Clicar em Ver mais Resultados
Dado o acesso ao site natura.com.br
Quando buscar o termo Perfume e clicar em Ver mais resultados
Então o sistema deve exibir uma página apenas com perfumes

@sugestaoBusca @menuDeBusca
Cenário: Abrir produto por Sugestão de Busca
Dado o acesso ao site natura.com.br
Quando buscar o termo Essencial e clicar no produto Essencial Elixir na seção Produtos do menu de busca
Então o sistema redirecionar para a página do produto

@produtosExibidos @menuDeBusca
Cenário: Abrir produto por Produtos exibidos
Dado o acesso ao site natura.com.br
Quando buscar o termo Kaiak e clicar no produto Kaiak Aero nas sugestões de busca do Menu de busca
Então o sistema redirecionar para a página deste produto

