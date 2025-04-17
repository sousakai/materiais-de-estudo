#include <stdio.h>

int main(){
    
    //declarando a variável que será indicada pelo ponteiro
    int apontada = 5;
    
    //declarando um ponteiro para o ENDEREÇO DE MEMÓRIA da variável
    int *ptr = &apontada;
    
    printf("Exibindo o conteúdo da variável 'apontada': %d\n", apontada);
    printf("Exibindo o endereço de memória da variável 'apontada': %p\n", &apontada);
    //veja, incluímos o &.
    
    printf("\n");
    
    printf("Exibindo o conteúdo do ponteiro ptr: %d\n", *ptr);
    printf("Exibindo o endereço de memória do ponteiro: %p\n\n", &ptr);
    //veja, incluímos o &.
    
    //MANIPULAÇÃO INDIRETA
    
    
    printf("Exibindo o conteúdo da variável 'apontada': %d\n\n", apontada);
    
    printf("PÓS MANIULAÇÃO INDIRETA VIA PONTEIRO\n");
    
    *ptr = *ptr + 15;
    //estamos adicionando 15 ao valor do nosso ponteiro.
    
    printf("Exibindo o conteúdo da variável 'apontada': %d\n", apontada);

    return 0;
}
