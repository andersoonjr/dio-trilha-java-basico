package terminal_argumentos;

public class EntendendoArgumentos {

    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}

/*

Nessa classe aprendemos sobre arrays de argumentos.
Se executarmos essa classe direto no terminal. Logo após especificar o nome da classe precisamos de passar
os parametros para que a mensagem do algoritmmo se complete com  os dados do usuário no caso os "Argumentos".

nesse caso nosso algoritmo rcebe os dados sem o Scanner.

 */