import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(final String palavra, final String definicao){
        this.dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
        else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public void exibirPalavras(){
        for (Map.Entry<String, String> entry : dicionario.entrySet()){
            System.out.println("Palavra: " + entry.getKey() + " Definição: " + entry.getValue());
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String value = dicionario.entrySet()
                .stream()
                .filter(e -> e.getKey().equalsIgnoreCase(palavra))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);

        return value;
    }
}
