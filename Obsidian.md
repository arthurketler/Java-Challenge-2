Criar um programa interativo de console com um menu de operações:
1. sair
2. adicionar items
3. remover itens(listagem)
O [[#Main|programa]] deve realizar um pedido de um restaurante/lanchonete armazenado dentro de um [[#NewList]] cada um contendo um tipo de [[#Itens|item]] (prato, bebida, acompanhamento).
Os ArrayList devem ter funções de adição(sem duplicidade), remoção e imprimir uma lista ordenada alfabeticamente.
# Estrutura
## NewList
* Estruturação de classe genérica NewList herdando ArrayList com overrides requeridos.
## Menu
* Os itens de referência a partir de classe simulatória API.
## Itens
* Superclasse item com métodos em comum.
* Definir classes de tipos de items(pratos, bebidas e acompanhamentos) - as funções são de override portanto não precisa-se de cast.
## Main
* No main instanciar o array com a quantidade de tipos cada um com um NewList.
* Definir o menu com seus métodos.