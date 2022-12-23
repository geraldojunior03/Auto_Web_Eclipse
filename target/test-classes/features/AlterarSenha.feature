# language: pt
# encoding UTF-8

Funcionalidade: Alterar Senha

@alterarsenha @senhaValida
Cenário: Definir uma senha válida
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha válida
Então devo validar se aquela senha foi salva logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"

@alterarsenha @senhaInvalida
Cenário: Definir uma senha válida
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha inválida
Então devo validar se apareceu uma menssagem de erro

@alterarsenha @senhaEmBranco
Cenário: Definir uma senha válida
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em alterar senha e abrir uma tela, e por fim, eu definir uma senha em branco
Então devo validar se apareceu uma menssagem de campo obrigatório

@alterarsenha @senhaIgual
Cenário: Definir uma senha válida
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em alterar senha e abrir uma tela, e por fim, eu definir a mesma senha válida
Então devo validar se aquela senha foi salva logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"
