import java.util.ArrayList;
import java.util.List;

public class CondicionMultiplo implements idCondicion {
    public int multiplo;

    public CondicionMultiplo(int _multiplo) {
        this.multiplo = _multiplo;
    }

    @Override
    public List<Integer> condicion(List<Integer> lista) {
        List<Integer> multiplos = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % this.multiplo == 0)
                multiplos.add(lista.get(i));
        }
        return multiplos;
    }

}
