package metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada " + smartTv.ligada);

        System.out.println("Volume atual? " + smartTv.volume);
        System.out.println("Canal atual? " + smartTv.canal);

    }
}

/*

métodos são blocos de código que executam tarefas específicas e são chamados quando necessários.
Eles ajudam a organizar e reutilizar o código. Aqui estão alguns pontos importantes sobre métodos em Java:

Declaração de Métodos:
Um método deve ser declarado dentro de uma classe.
A sintaxe básica é:


public class MinhaClasse {
    public void meuMetodo() {
        // código a ser executado
    }
}

Chamando Métodos:
Para chamar um método, você usa o nome do método seguido por parênteses:


public class MinhaClasse {
    public void meuMetodo() {
        System.out.println("Método executado!");
    }

    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.meuMetodo(); // Chama o método
    }
}

Métodos com Parâmetros:
Métodos podem receber dados através de parâmetros:


public class MinhaClasse {
    public void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }

    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.saudacao("Maria"); // Passa "Maria" como parâmetro
    }
}

Métodos com Retorno:
Métodos podem retornar valores:


public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}

Métodos Estáticos:
Métodos estáticos pertencem à classe, não a instâncias da classe:

public class Util {
    public static void mensagem() {
        System.out.println("Mensagem estática");
    }

    public static void main(String[] args) {
        Util.mensagem(); // Chama o método estático
    }
}

 */
