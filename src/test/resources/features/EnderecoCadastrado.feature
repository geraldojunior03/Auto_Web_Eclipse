# language: pt
# encoding UTF-8

Funcionalidade: Endereço Cadastrado

@dadospessoais @cadastrarend
Cenário: Cadastrar um novo Endereço
Dado que eu entre no site da natura e vou em endereços cadastrados logo após ter feito o login
Quando eu clicar em endereços cadastrados e abrir uma tela, e por fim, eu definir meu endereço pelo CEP, definindo também o número junto com o nome de quem vai receber a entrega
Então devo validar se aquele endereço foi salva logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"
