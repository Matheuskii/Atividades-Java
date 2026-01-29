import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> lista = new ArrayList<String>();

    public static void main(String[] args) {

      String nome = "Matheuys";
      String nome2 = "Lavinia";
      String nome3 = "Robin";
      lista.add(nome);
      lista.add(nome2);
      lista.add(nome3);

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        lista.add(input);
        imprimir(lista);


        }
    public static void imprimir(ArrayList<String> lista){
        for(String nomeLista : lista){
            System.out.println(nomeLista);
        }

  }
}
