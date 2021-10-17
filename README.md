# Variaveis-Java
  Variaveis sao conteineres para armazenar valores de dados.

 Em Java, existem diferentes tipos de variaveis, por exemplo:

 ### String:
 armazena texto, como "Olá". Os valores da 'sting' estao entre aspas duplas.
 ### Int:
 armazena inteiros (numeros inteiros), sem decimais, como 123 ou -123.

 ### Float:
 armazena números de flutuante, com decimais, como 19,99 ou -19,99.

 ### Char:
 armazena caracteres unicos, como 'a' ou 'b'. Os valores dos caracteres sao colocados entre aspas simples.

 ### Boolean:
 armazena valores com dois estados: true(verdadeiro) ou False(falso).

 ### Declarando(criando) variáveis:
 Para criar uma variável, voce deve especificar o tipo e atribuir um valor a ela:

## Variáveis de exibição:
O println() método é frequentimente usado para exibir variáveis.
Para combinar texto e variável, use o caractere: +

#### Exemplo:

    public class Ex001{
        public static void main(String[] args) {
            String nome ="John";
            System.out.println("Olá " + nome);
        }
    }
resultado: Olá John
