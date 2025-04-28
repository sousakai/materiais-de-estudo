/******************************************************************************

Estrutura de Dados I 
Prof.º Eduardo Alves de Freitas

Desenvolva um programa em C crie um vetor de inteiros
com tamanho 5, atribua valores no vetor no momento de
sua declaração. Crie um ponteiro de inteiros, atribua o
endereço do vetor no ponteiro.
Percorra todos os elementos do vetor utilizando o ponteiro e
incremente o valor 1 em cada elemento do vetor.
Mostre os valores do vetor utilizando o ponteiro.
*******************************************************************************/
#include <stdio.h>



int main(){
    int vetor[5] = {10, 20, 30, 40, 50};
    int i, *p;
    p = &vetor[4];  // atribui o endereço do último elemento do vetor à variável p
    
     // 'p' agora aponta para o último elemento do vetor, então usamos *p para acessar o valor nele.
      
    printf("Valores do vetor:\n");
    for(i = 0; i < 5; i++){
       printf("%d\t", *p);
       p--; // movemos o ponteiro para a próxima casa do vetor
    }
    
}
