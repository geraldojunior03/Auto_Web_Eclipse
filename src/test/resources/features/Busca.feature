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