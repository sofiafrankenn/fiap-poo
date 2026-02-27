# PROJETO CAMISETA

Este projeto representa uma camiseta dentro de um sistema de loja.

A classe Camiseta possui as seguintes características:

- cor
- tipo
- material
- estoque

O sistema permite adicionar camisetas ao estoque e realizar vendas, alterando a quantidade disponível.

## Atributos

- cor: representa a cor da camiseta
- tipo: modelo da camiseta (Polo, Social, etc.)
- material: material da camiseta
- estoque: quantidade disponível para venda

## metodos

### adicionarEstoque(int quantidade)

Adiciona uma quantidade ao estoque.

Regra:
- A quantidade precisa ser maior que 0.
- Se for menor ou igual a 0, o sistema informa que é inválido.

### venderCamiseta(int quantidade)

Diminui a quantidade do estoque ao realizar uma venda.

Regras:
- A quantidade deve ser maior que 0.
- O estoque deve ser suficiente para realizar a venda.
- Se não houver estoque suficiente, o sistema informa erro.

## Testes

No SistemaPrincipal foram feitos testes:

- Adicionando estoque
- Vendendo camisetas com estoque suficiente
- Tentando vender mais do que tem em estoque

Assim é possível ver que as regras de negócio estão funcionando.