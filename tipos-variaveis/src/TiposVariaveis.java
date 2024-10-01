public class TiposVariaveis {

    //Tipos primitivos
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo.
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo. Obrigado ser encerrado com L.
        float pi = 3.14F; // Obrigatório terminar com F o tipo float.
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; //sem o casting daria erro. Casting refere-se à conversão de um tipo de dado para outro

        //Constantes
        final double VALOR_DE_PI = 3.14;

    }
}


// TIPOS DE DADOS

// Tipos primitivos em java são: int, byte, short, lon, float, double, boolean e char -
// Esses tipos não são considerados objetos (São tipo primitivos), e portanto representam valores brutos.
// Eles são armazenados diretamente na pilha de memória. (Memory stack).

/* TIPO     Tamanho(byts)            VALOR MINIMO                         VALOR MAXIMO

   byte	          8	 (1)              -128	                                127
   short	      16 (2)	           -32,768	                            32,767
   int	          32 (4)	           -2.147.483.648                       2.147.483.647
   long	          64 (8)	           -9.223.372.036.854.775.808           9.223.372.036.854.775.807
   float	      32 (4)	           -3,428E + 38	                        3,4028E + 38
   double	      64 (8)	           -1,7976E + 308	                    1,7976E + 308
   char	          16 (2)	           ‘\u0000’ (ou 0)	                    ‘\uffff’ (ou 65,535)
   boolean	      1	 (1)               false	                            true
 */

/* DIFERENÇA DE VARIAVEIS PARA CONSTANTES

    VARIAVEIS podem ter seu valor alterado no decorrer do desenvolvimento do algoritmo.
    CONSTANTES tenho seus valores fixos, tornando-as immpossiveis de serem alteradas.
    Por convenção as constantes tem a obrigação de serem escritas em CAIXA ALTA.
 */