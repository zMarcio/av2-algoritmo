## Explicação do Quicksort
O Quicksort é um algoritmo de ordenação eficiente que utiliza a técnica de divisão e conquista. Ele funciona da seguinte maneira:
1. Partition: 
    - Escolhe um elemento do vetor como pivô.
    - Reorganiza o vetor de forma que todos os elementos menores que o pivô fiquem à esquerda dele e todos os elementos maiores fiquem à direita.
2. Recursão:
    - Aplica o mesmo processo recursivamente nas sublistas à esquerda e à direita do pivô.
    - A recursão continua até que as sublistas tenham tamanho 0 ou 1, momento em que estão automaticamente ordenadas.
    - O resultado final é um vetor ordenado.
3. Complexidade:
    - O Quicksort tem uma complexidade média de O(n log n), mas no pior caso pode chegar a O(n²) se o pivô escolhido for sempre o menor ou maior elemento.

## 