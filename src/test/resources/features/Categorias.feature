#language: pt
#encoding UTF-8

Funcionalidade: Categorias

@entrarNatal @barraDeCategorias
Cenário: Entrar na categoria Natal
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Natal"
Então o sistema deve redirecionar para a página de promoções do natal

@entrarPresentes @barraDeCategorias
Cenário: Entrar na categoria Presentes
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Presentes"
Então o sistema deve redirecionar para a página com kits de presentes

@entrarPerfumaria @barraDeCategorias
Cenário: Entrar na categoria Perfumaria
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Perfumaria"
Então o sistema deve redirecionar para a lista de produtos de perfumaria

@entrarCorpoeBanho @barraDeCategorias
Cenário: Entrar na categoria Corpo e Banho
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Corpo e Banho"
Então o sistema deve redirecionar para a lista de produtos para corpo e banho

@entrarCabelos @barraDeCategorias
Cenário: Entrar na categoria Cabelos
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Cabelos"
Então o sistema deve redirecionar para a lista de produtos para cabelos

@entrarRosto @barraDeCategorias
Cenário: Entrar na categoria Rosto
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Rosto"
Então o sistema deve redirecionar para a lista de produtos para rosto

@entrarMaquiagem @barraDeCategorias
Cenário: Entrar na categoria Maquiagem
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Maquiagem"
Então o sistema deve redirecionar para a lista de produtos de maquiagem

@entrarInfantil @barraDeCategorias
Cenário: Entrar na categoria Infantil
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Infantil"
Então o sistema deve redirecionar para a lista de produtos para crianças

@entrarPromocoes @barraDeCategorias
Cenário: Entrar na categoria Promoções
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Promoções"
Então o sistema deve redirecionar para a página com todas as promoções

@entrarMarcas @barraDeCategorias
Cenário: Entrar na categoria Marcas
Dado o acesso ao site natura.com.br
Quando clicar na categoria "Marcas"
Então o sistema deve redirecionar para a página com as opções de marcas

@todosOsProdutos @barraDeCategorias
Cenário: Clicar em Ver Todos os Produtos
Dado o acesso ao site natura.com.br
Quando o cursor estiver por cima da categoria Rosto e clicar em Ver todos os produtos
Então o sistema deve redirecionar para a lista de produtos da categoria Rosto

@perfumariaMasculina @barraSubcategorias
Cenário: Selecionar Perfumaria masculina
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Perfumaria" e clicar em "Masculina"
Então o sistema deve redirecionar para a página de perfumes masculinos

@saboneteCorpoeBanho @barraSubcategorias
Cenário: Selecionar Sabonete em Corpo e Banho
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Corpo e Banho" e clicar em "Sabonete"
Então o sistema deve redirecionar para a página de sabonetes

@shampooCabelos @barraSubcategorias
Cenário: Selecionar Shampoo em Cabelos
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Cabelos" e clicar em "Shampoo"
Então o sistema deve redirecionar para a página de shampoos

@hidratacaoRosto @barraSubcategorias
Cenário: Selecionar Hidratação em Rosto
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Rosto" e clicar em "Hidratação"
Então o sistema deve redirecionar para a página de hidratantes de rosto

@bocaMaquiagem @barraSubcategorias
Cenário: Selecionar Boca em Maquiagem
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Maquiagem" e clicar em "Boca"
Então o sistema deve redirecionar para a página de maquiagens para a boca

@presentesInfatil @barraSubcategorias
Cenário: Selecionar Presentes em Infantil
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Infantil" e clicar em "Presentes"
Então o sistema deve redirecionar para a página de presentes para crianças

@descontoPromocoes @barraSubcategorias
Cenário: Selecionar 50% em Promoções
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Promoções" e clicar em "Até 50% OFF"
Então o sistema deve redirecionar para a página de promoções até cinquenta%

@veganosMarcas @barraSubcategorias
Cenário: Selecionar Veganos em Marcas
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Marcas" e clicar em "Veganos"
Então o sistema deve redirecionar para a página marcas veganas.

@presenteFaixaDePreco @barraSubcategorias
Cenário: Selecionar presente por faixa de preço
Dado o acesso ao site natura.com.br
Quando abrir as subcategorias da categoria "Presentes" e clicar em "Agradecer (até R$ 50)"
Então o sistema deve redirecionar para a lista de presentes com a faixa de preço até cinquenta reais