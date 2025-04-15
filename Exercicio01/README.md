# Explicação: Busca Binária

A busca binária possui um requisito fundamental: o vetor precisa estar ordenado. Se o vetor estiver desordenado, o método não funcionará corretamente.

O funcionamento da busca binária se baseia em dividir o vetor ao meio em busca do elemento desejado. Ela seleciona um elemento no meio do vetor e verifica se o valor à direita é maior ou menor que o valor procurado:

- Se o valor à direita for maior, a busca continua na parte direita do vetor.
- Se for menor, a busca continua na parte esquerda.
- Se for igual, a busca pode parar ou continuar na parte esquerda, dependendo do objetivo.

## Explicação do método proposto

O método implementado é semelhante à busca binária, mas em vez de buscar um valor específico, ele retorna a posição do maior elemento do vetor.

### Implementação:
```java
static int posMaior2(int[] vetor, int i, int f) {
    if (i == f) {
        return i;
    }
    int m = (i + f) / 2;
    if (vetor[m] < vetor[m + 1]) {
        return posMaior2(vetor, m + 1, f);
    } else {
        return posMaior2(vetor, i, m);
    }
}
```

### Vetor de exemplo:
```
6    16    24    27    32    41    44    49    50    53    56    57    71    62    59
```

### Índice esperado:
```
12
```

## Explicação do código

O código começa verificando se o índice inicial (`i`) é igual ao índice final (`f`). Essa verificação é necessária, pois o problema é resolvido por divisão recursiva.

A lógica principal é semelhante à da busca binária, no sentido de dividir o vetor ao meio e comparar o elemento central com o elemento à sua direita.

- Se o elemento central for menor que o da direita, a busca continua na metade direita do vetor, ou seja, o índice inicial (`i`) passa a ser `m + 1`.
- Se o elemento central for maior que o da direita, a busca continua na metade esquerda, ou seja, o índice final (`f`) passa a ser `m`.

A execução prossegue até que `i` seja igual a `f`, indicando que o vetor foi reduzido a um único elemento. Nesse ponto, o índice retornado corresponde à posição do maior valor encontrado no vetor.

## Análise assintótica
T(n) = T(n/2) + O(1)
T(n) = O(log n)
