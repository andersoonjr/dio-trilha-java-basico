import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        // Operadores de atribuição
        String nome = "ANDERSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // Operadores Unários
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //Operadores incrementadores
        int numero_ = 5;

        //x repetição
        numero_ = numero_ +1;

        // é a mesma coisa que: numero_++;

        //Operador lógico
        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel); //por conta do operador lógico o resultado retorna o valor False.

        //Operador Ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a==b ? "verdadeiro" : "falso"; //Mesma coisa que um if / else. (Condição sempre booleana).
        //                condição      se         senao
    }
}


/*
________________________________________________________________________________________________________________________

Os operadores de atribuição são usados para atribuir valores a variáveis.
O operador de atribuição mais básico é o =.
Além disso, existem operadores de atribuição compostos que combinam operações aritméticas com a atribuição.

Exemplos:
1- Atribuição Simples:

    int x = 10; // x agora vale 10

2- Atribuição composta:

    x += 5; // Equivalente a x = x + 5; x agora vale 15

________________________________________________________________________________________________________________________

Os operadores aritméticos são usados para realizar operações matemáticas básicas em programação.
Aqui estão os principais operadores aritméticos e suas funções:

Adição (+):
Soma dois valores.


int a = 5;
int b = 3;
int resultado = a + b; // resultado é 8

Subtração (-):
Subtrai o segundo valor do primeiro.
J

int a = 5;
int b = 3;
int resultado = a - b; // resultado é 2

Multiplicação (*):
Multiplica dois valores.


int a = 5;
int b = 3;
int resultado = a * b; // resultado é 15

Divisão (/):
Divide o primeiro valor pelo segundo. (Lembre-se de que a divisão de inteiros resulta em um valor inteiro.)


int a = 5;
int b = 3;
int resultado = a / b; // resultado é 1

Módulo (%):
Retorna o resto da divisão do primeiro valor pelo segundo.


int a = 5;
int b = 3;
int resultado = a % b; // resultado é 2

Incremento (++):
Incrementa o valor da variável em 1.


int a = 5;
a++; // a agora é 6

Decremento (--):
Decrementa o valor da variável em 1.
Java

int a = 5;
a--; // a agora é 4

________________________________________________________________________________________________________________________


Os operadores unários são operadores que operam em um único operando. Eles são usados para realizar várias operações,
como incremento, decremento, negação e inversão de sinal.
 Aqui estão alguns exemplos comuns de operadores unários em Java:

Incremento (++):
Incrementa o valor da variável em 1.


int a = 5;
a++; // a agora é 6

Decremento (--):
Decrementa o valor da variável em 1.


int a = 5;
a--; // a agora é 4

Negação (-):
Inverte o sinal de um valor numérico.


int a = 5;
int b = -a; // b agora é -5

Complemento lógico (!):
Inverte o valor booleano.


boolean flag = true;
flag = !flag; // flag agora é false

Operador de tipo (+):
Indica um valor positivo (geralmente implícito e não usado explicitamente).


int a = +5; // a é 5

________________________________________________________________________________________________________________________


O operador ternário é uma forma concisa de escrever uma expressão condicional em muitas linguagens de programação,
como JavaScript, C, C# e Java.

Em Java, o operador ternário é uma forma concisa de escrever uma expressão condicional,
substituindo uma estrutura if-else simples. A sintaxe básica é:

condição ? expressão1 : expressão2;

Aqui está um exemplo prático:

int idade = 20;
String mensagem = (idade >= 18) ? "Você é maior de idade." : "Você é menor de idade.";
System.out.println(mensagem); // Saída: Você é maior de idade.

Neste exemplo, se a condição idade >= 18 for verdadeira, a variável mensagem receberá o valor “Você é maior de idade.”
Caso contrário, receberá "Você é menor de idade.

________________________________________________________________________________________________________________________



Operadores Relacionas

Os operadores relacionais são usados para comparar valores e determinar a relação entre eles.
O resultado de uma expressão relacional é sempre um valor booleano: verdadeiro ou falso.
Aqui estão os operadores relacionais mais comuns:

Igual a (==): Verifica se dois valores são iguais.


int a = 5;
int b = 5;
boolean resultado = (a == b); // verdadeiro

Diferente de (!=): Verifica se dois valores são diferentes.


int a = 5;
int b = 3;
boolean resultado = (a != b); // verdadeiro

Maior que (>): Verifica se o valor à esquerda é maior que o valor à direita.


int a = 5;
int b = 3;
boolean resultado = (a > b); // verdadeiro

Menor que (<): Verifica se o valor à esquerda é menor que o valor à direita.


int a = 3;
int b = 5;
boolean resultado = (a < b); // verdadeiro

Maior ou igual a (>=): Verifica se o valor à esquerda é maior ou igual ao valor à direita.


int a = 5;
int b = 5;
boolean resultado = (a >= b); // verdadeiro

Menor ou igual a (<=): Verifica se o valor à esquerda é menor ou igual ao valor à direita.


int a = 3;
int b = 5;
boolean resultado = (a <= b); // verdadeiro

Esses operadores são fundamentais para a criação de condições e tomadas de decisão em programas


________________________________________________________________________________________________________________________


OPERADORES LÓGICOS

Os operadores lógicos são fundamentais na programação para combinar e manipular valores booleanos (verdadeiro ou falso).
Eles são usados para avaliar condições em estruturas de controle, como if, while e for.
Aqui estão os principais operadores lógicos:

AND (&&): Retorna verdadeiro se ambas as condições forem verdadeiras.


boolean a = true;
boolean b = false;
boolean resultado = a && b; // falso

OR (||): Retorna verdadeiro se pelo menos uma das condições for verdadeira.


boolean a = true;
boolean b = false;
boolean resultado = a || b; // verdadeiro

NOT (!): Inverte o valor lógico da condição.


boolean a = true;
boolean resultado = !a; // falso

XOR (^): Retorna verdadeiro se uma e somente uma das condições for verdadeira.

boolean a = true;
boolean b = false;
boolean resultado = a ^ b; // verdadeiro

Esses operadores são essenciais para criar lógica complexa em seus programas

 */
