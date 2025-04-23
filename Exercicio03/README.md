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

## Atividades proposta
1. O vetor criancas armazena os dados de n crianças de faixa etária de 6 a 16 anos. Cada registro possui um campo nome, um campo idade e um campo turno. Escrever um algoritmo de reorganização desse vetor de tal forma que todas as crianças do turno da manhã venham antes das crianças do turno da tarde. Seu algoritmo de reorganização deve executar em tempo O(n) e ser local. Escrever a saída do seu programa após a reorganização do vetor. Realizar a análise de complexidade do seu algoritmo.

2. Escrever um algoritmo de reorganização desse vetor obedecendo a ordem: crianças de 14 a 16 anos; crianças de 11 a 13 anos; e crianças de 6 a 10 anos. Seu algoritmo de reorganização deve executar em tempo O(n) e ser local. Escrever a saída do seu programa após a reorganização do vetor. Realizar a análise de complexidade do seu algoritmo.

## Resolução
### 1. Algoritmo de Reorganização do Vetor de Crianças por Turno
```java
static void organizaTurno (Crianca[] A) {
    int i = -1;
    Crianca temp;
    for(int j = 0; j < A.length; j++){
        if(A[j]. turno == 'M'){
            i++;
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
```
### Explicação do Código
O algoritmo percorre o vetor de crianças e utiliza uma variável `i` para rastrear a posição onde a próxima criança do turno da manhã deve ser colocada. Quando encontra uma criança do turno da manhã, troca-a com a criança na posição `i`, incrementando `i` em seguida. Isso garante que todas as crianças do turno da manhã fiquem à frente das do turno da tarde.

### Análise de Complexidade
A complexidade do algoritmo é O(n), onde n é o número de crianças no vetor. Isso ocorre porque o algoritmo percorre o vetor uma única vez, realizando operações constantes em cada iteração.

### 2. Algoritmo de Reorganização do Vetor de Crianças por Idade
```java
static void organizaIdade (Crianca[] A) {
    int i = -1;
    Crianca temp;
    for(int j = 0; j < A.length; j++){
        if(A[j]. idade >= 14){
            i++;
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    for(int j = i + 1; j < A.length; j++){
        if(A[j]. idade >= 11){
            i++;
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
```

### Explicação do Código
O algoritmo percorre o vetor de crianças duas vezes. Na primeira passagem, ele organiza as crianças de 14 a 16 anos, movendo-as para o início do vetor. Na segunda passagem, ele organiza as crianças de 11 a 13 anos, movendo-as para a posição seguinte. As crianças de 6 a 10 anos permanecem na ordem original.

### Análise de Complexidade
A complexidade do algoritmo é O(n), onde n é o número de crianças no vetor. Isso ocorre porque o algoritmo percorre o vetor duas vezes, mas cada passagem é linear, resultando em uma complexidade total de O(n).

