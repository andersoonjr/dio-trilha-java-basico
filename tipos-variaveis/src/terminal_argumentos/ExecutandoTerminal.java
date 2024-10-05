package terminal_argumentos;

public class ExecutandoTerminal {

    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo terminal");
    }
}

/*

Para executar seu código pelo terminal do PowerShell voce precisa seguir a seguinte sequencia de passos:

1- Navegar até o diretório do projeto java (depois de ter compilado o projeto é claro), no meu caso utilizei
o seguinte endereço:  C:\estudos\dio-trilha-java-basico\tipos-variaveis\out\production\tipos-variaveis

No ultimo diretório estava armazenado todos os meus pacotes e dentro deles todas as minhas classes.
depois de abrir o PowerShell no administrador utilizei o comando "cd" para navegar até o diretório exigido. Exemplo:

cd C:\estudos\dio-trilha-java-basico\tipos-variaveis\out\production\tipos-variaveis

Logo em seguida executei o seguinte comando: java terminal_argumentos.ExecutandoTerminal
e assim minha classe foi executada.

Obs: Geralmente se seu projeto não tiver pacote o comando seria "java NomeDaClasse.java"

Mas como minha classe se localizava dentro de um pacote ficou assim: "java nome_do_pacote.NomeDaClasse".
 */