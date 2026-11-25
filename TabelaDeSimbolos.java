import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// Guarda nome e tipo das variáveis (um HashMap por escopo)
public class TabelaDeSimbolos {

    private final Deque<Map<String, String>> escopos = new ArrayDeque<>();

    public TabelaDeSimbolos() {
        abrirEscopo(); // escopo global
    }

    public void abrirEscopo() {
        escopos.push(new HashMap<>());
    }

    public void fecharEscopo() {
        escopos.pop();
    }

    // Retorna false se a variável já existe no escopo atual
    public boolean declarar(String nome, String tipo) {
        Map<String, String> atual = escopos.peek();
        if (atual.containsKey(nome)) {
            return false;
        }
        atual.put(nome, tipo);
        return true;
    }

    // Procura do escopo atual até o global
    public String buscar(String nome) {
        for (Map<String, String> escopo : escopos) {
            if (escopo.containsKey(nome)) {
                return escopo.get(nome);
            }
        }
        return null;
    }

    public boolean existe(String nome) {
        return buscar(nome) != null;
    }

    public String tipoNoEscopoAtual(String nome) {
        return escopos.peek().get(nome);
    }
}
