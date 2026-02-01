import java.util.ArrayList;
import java.util.List;


public class NameList {
    private String nome;
    private List<String> nomes = new ArrayList<>();



    //Getters

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.matches(".*\\d.*")){
            System.out.println("Nomes não tem númerosssss");
        }
        else {
            this.nome = nome;
        }
    }
    public List<String> getList(){
        return this.nomes;
    }
    
    public void adicionarNome(String nome) {
        this.nomes.add(nome);
    }

    public void removerNome(int id){
        List<String> lista = this.nomes;
        lista.remove(id);
    }

    public void atualizarNome(int id, String novoNome) {
        List<String> lista = this.nomes;
        String idNome = lista.get(id);
       

        


    }



}
