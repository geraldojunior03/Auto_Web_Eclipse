# language: pt
# encoding UTF-8

Funcionalidade: Dados pessoais

@dadospessoais @trocarnome
Cenário: Trocar meu nome
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar meu nome
Então devo validar se aquele nome foi realmente alterado logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"

@dadospessoais @trocarsobrenome
Cenário: Trocar meu sobrenome
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar meu sobrenome
Então devo validar se aquele sobrenome foi realmente alterado logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"

@dadospessoais @trocarnomebranco
Cenário: Trocar meu nome para um nome em branco
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar meu nome para caracteres em branco
Então devo validar se apareceu uma menssagem de erro do nome

@dadospessoais @definirdatanascValida
Cenário: Definir/Trocar a data de aniversário
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar minha data de aniversário
Então devo validar se aquela data foi realmente alterada logo após eu ter clicado no botão de "SALVAR ALTERAÇÕES"

@dadospessoais @definirdatanascInvalida
Cenário: Definir/Trocar a data de aniversário inválida
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar minha data de aniversário para uma data inválida
Então devo validar se apareceu uma menssagem de erro de data

@dadospessoais @numeroValido
Cenário: Definir/Trocar número de WhatsAPP válido
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar meu número de whatsapp
Então devo validar se o número foi salvo após eu ter clicado no botão "SALVAR ALTERAÇÕES"

@dadospessoais @numeroInvalido
Cenário: Definir/Trocar número de WhatsAPP válido
Dado que eu entre no site da natura e vou em dados pessoais logo após ter feito o login
Quando eu clicar em dados pessoais e abrir uma tela, e por fim eu definir/trocar meu número de whatsapp inválido
Então devo validar se apareceu uma menssagem de erro do número