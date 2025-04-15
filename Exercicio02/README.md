## Heap

Heap é uma estrutura de dados que pode ser representada como uma árvore binária e é amplamente utilizada para implementar filas de prioridade. Os elementos são organizados de acordo com suas prioridades. Existem dois tipos principais de heaps:

- **Max-Heap**: O valor de cada nó pai é maior ou igual ao valor de seus filhos. O maior elemento está sempre na raiz do heap.
- **Min-Heap**: O valor de cada nó pai é menor ou igual ao valor de seus filhos. O menor elemento está sempre na raiz do heap.

## Atividade Proposta

A atividade proposta consiste na criação dos métodos `left`, `right`, `maxheapfy` e `buildmaxheap`. A ideia é identificar os filhos esquerdo e direito de um nó, transformar o vetor em uma estrutura Max-Heap e garantir que a estrutura inteira mantenha a propriedade de Max-Heap.

## Implementação

```java
static int left (int i) {
    return 2 * i + 1;
}

static int right (int i) {
    return 2 * i + 2;
}

static void maxheapfy (int[] V, int i) {
    int l = left(i);
    int r = right(i);
    int m = i;
    int aux;
    if (l < V.length && V[l] > V[m]) {
        m = l;
    }
    if (r < V.length && V[r] > V[m]) {
        m = r;
    }
    if (m != i) {
        aux = V[i];
        V[i] = V[m];
        V[m] = aux;
        maxheapfy(V, m);
    }
}

static void buildmaxheap (int[] V) {
    for (int i = (V.length / 2) - 1; i >= 0; i--) {
        maxheapfy(V, i);
    }
}
```

## Explicação do Código

### Métodos `left` e `right`

Esses métodos são simples de implementar. Como discutido em sala, basta considerar que o vetor começa no índice 0. Em uma árvore binária representada por vetor, os índices seguem a estrutura:

```
        0
      /   \
     1     2
    / \   / \
   3   4 5   6
```

Por isso, os cálculos dos filhos são:
- Filho esquerdo: `2 * i + 1`
- Filho direito: `2 * i + 2`

### Método `maxheapfy`

Esse método garante que um nó esteja na posição correta em relação aos seus filhos. Se um dos filhos tiver valor maior que o pai, realiza-se a troca e chama-se `maxheapfy` novamente para o índice alterado, repetindo o processo até que a propriedade de Max-Heap seja satisfeita.

Exemplo de vetor antes e depois da aplicação:

```
Antes:
        0
      /   \
     1     5
    / \   / \
   3   4 2   6

Depois (com estrutura já válida):
        0
      /   \
     1     5
    / \   / \
   3   4 2   6
```

### Método `buildmaxheap`

Constrói a estrutura de Max-Heap completa a partir de um vetor. Começa do meio do vetor até o início, pois somente os nós que possuem filhos precisam ser ajustados. Ele chama `maxheapfy` em cada um desses nós, garantindo que a propriedade de Max-Heap seja aplicada recursivamente.

```
Antes:
        0
      /   \
     1     5
    / \   / \
   3   4 2   6

Depois:
        0
      /   \
     1     5
    / \   / \
   3   4 2   6
```