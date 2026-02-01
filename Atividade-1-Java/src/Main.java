import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> nomes = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("-----Gerenciador de Nomes-----");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes cadastrados");
            System.out.println("3 - Atualizar um nome existente");
            System.out.println("4 - Remover um nome");
            System.out.println("5 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();
            int opcaoNum;
            try {
                opcaoNum = Integer.parseInt(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite um número de 1 a 5.");
                continue;
            }
            if (opcaoNum < 1 || opcaoNum > 5) {
                System.out.println("Opção precisa existir.");
                continue;
            }
            switch (opcaoNum) {
                case 1:
                    cadastrarNome();
                    break;
                case 2:
                    listarNomes();
                    break;
                case 3:
                    atualizarNome();
                    break;
                case 4:
                    removerNome();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
            }
        }
    }

    public static void cadastrarNome() {
        while (true) {
            System.out.print("Digite o nome que deseja cadastrar: ");
            String nome = scanner.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Nome não pode ser vazio.");
                continue;
            }
            if (nome.matches(".*\\d.*")) {
                System.out.println("Nomes não podem ter números.");
                continue;
            }
            nomes.add(nome);
            System.out.println("Nome cadastrado com sucesso!");
            break;
        }
    }

    public static void listarNomes() {
        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome cadastrado.");
        } else {
            System.out.println("Nomes cadastrados:");
            for (String nome : nomes) {
                int idx = nomes.indexOf(nome);
                System.out.println(idx + " - " + nome);
            }
            System.out.println("Aperte qualquer botão para continuar...");
            String nada = scanner.nextLine();
        }
    }


    public static void removerNome() {
        while (true) {
         if (nomes.isEmpty()) {
                System.out.println("Nenhum nome cadastrado.");
                return;
            }
            System.out.println("Nomes cadastrados:");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(i + " - " + nomes.get(i));
            }
        System.out.println("Digite o index do nome que deseja retirar");
        String index = scanner.nextLine();
        int idxNum;
       try {
            idxNum = Integer.parseInt(index);
             if (idxNum < 0 || idxNum >= nomes.size()) {
                System.out.println("Index inválido. Digite um número entre 0 e " + (nomes.size() - 1));
                continue;
            }
            String nome = nomes.get(idxNum);
            System.out.println("nome removido: " +nome);

            if(nome.isEmpty()) {
               System.out.println("O index escolhido não pertence a nenhum nome");
               return;
            }
           
            
            nomes.remove(idxNum);
            System.out.println("nome removido com sucesso, pressione qualquer tecla para continuar...");
            String qualquer = scanner.nextLine();
            break;
            
       } catch (NumberFormatException e) {
        System.out.println("index é o númmero do lado esquerdo do nome");
        System.out.println("Ex: 1 - NomeExemplo");
        continue;
       }
       
    }
    }
    
    
    public static void atualizarNome() {
        while (true) {
            if (nomes.isEmpty()) {
                System.out.println("Nenhum nome cadastrado.");
                return;
            }
            System.out.println("Nomes cadastrados:");
            for (int i = 0; i < nomes.size(); i++) {
                System.out.println(i + " - " + nomes.get(i));
            }
            System.out.print("Digite o index do nome que deseja atualizar: ");
            String index = scanner.nextLine();
            int idxNum;
            try {
                idxNum = Integer.parseInt(index);
            } catch (NumberFormatException e) {
                System.out.println("Index deve ser um número.");
                continue;
            }
            if (idxNum < 0 || idxNum >= nomes.size()) {
                System.out.println("Index inválido. Digite um número entre 0 e " + (nomes.size() - 1));
                continue;
            }
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine().trim();
            if (novoNome.isEmpty()) {
                System.out.println("Nome não pode ser vazio.");
                continue;
            }
            if (novoNome.matches(".*\\d.*")) {
                System.out.println("Nomes não podem ter números.");
                continue;
            }
            nomes.set(idxNum, novoNome);
            System.out.println("Nome atualizado com sucesso!");
            break;
        }
    }
}
