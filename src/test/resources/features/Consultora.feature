# language: pt
# encoding UTF-8

Funcionalidade: Buscar Consultora

@buscarconsultora @buscarnome
Cenário: Buscar consultora por nome válido
Dado que eu entre no site da natura e vou em buscar consultora
Quando eu inserir o nome de uma consultora existente e clicar em pesquisar
Então deverá aparecer um card com sua foto, seu nome e seu estado / cidade

@buscarconsultora @buscarcep
Cenário: Buscar consultora por CEP válido
Dado que eu entre no site da natura e vou em buscar consultora
Quando eu inserir o CEP de uma consultora existente e clicar em pesquisar
Então deverá aparecer um card com sua foto, seu nome e seu estado / cidade