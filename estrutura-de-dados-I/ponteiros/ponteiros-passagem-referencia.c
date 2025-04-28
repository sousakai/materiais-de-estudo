/******************************************************************************

Estrutura de Dados I 
Prof.º Eduardo Alves de Freitas

Desenvolva um programa em C que duplique um
determinado valor de entrada. Desenvolva uma sub-rotina
que receba por referência o valor a ser duplicado.
*******************************************************************************/
#include <stdio.h>

//protótipo da função 
/* a função duplicador está no final do código, mas a chamada dela vem antes, na função main. para que o compilador entenda que a função existe e não apresente erros, criamos o protótipo da função (consiste em evidenciar a assinatura da função) */

void duplicador(int *num);

int main()
{
    int valor = 0;
    
    printf("Olá! Por favor, digite o número a ser duplicado:\n");
    scanf("%d", &valor);
    
    printf("Valor escolhido: %d\n", valor);
    
    duplicador(&valor); 
    // nossa função duplicador trabalha com ponteiro, logo, passamos a ela o endereço de memória da variável valor.
    
    printf("O valor multiplicado agora é: %d", valor);
    //exibe o resultado
}


void duplicador(int *num){
    // criamos uma função que usa um ponteiro como parâmetro
    *num *=2;
}
