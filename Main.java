//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Jogo jogo;

    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var jogos = new ArrayList<Jogo>();

        while(true){
            System.out.println("""
                Bem vindo ao sistema de gerenciamento de jogos!
                Digite a opção desejada:
                1 - Cadastrar novo jogo
                2 - Listar jogos cadastrados
                3 - Remover jogo
                4 - Sair
                """);
            Scanner scan = new Scanner(System.in);
            var options = scan.nextInt();
            scan.nextLine();

            if(options == 1){

                System.out.println("Digite o nome do jogo que deseja cadastrar: ");
                var titulo = scan.nextLine();
                System.out.println("Digite a plataforma do jogo:");
                var plataforma = scan.nextLine();
                System.out.println("Digite a data de lançamento do jogo (YYYY-MM-DD)");
                var dataLancamento = scan.nextLine();


                
                jogos.add(jogo);
                System.out.println("Jogo cadastrado com sucesso!");
            } else if(options == 2){
                System.out.println("Lista de jogos cadastrados!");
                var index = 1;
                for(var jogo : jogos){
                    System.out.println(index + " - " + jogo);
                    index++;
                }
            } else if(options == 3){
                System.out.println("Remover jogo cadastrados! Informe o nome");
                String nome = scan.nextLine();
                jogos.remove(nome);
                System.out.println("Jogo remoovido com sucesso!");
            } else if(options == 4){
                System.exit(0);
            }else {
                System.out.println("Informe um número valido!");
            }
        }

    }

}