
import java.util.ArrayList;
import java.util.List;

public class CondicionPrimo implements idCondicion {

    @Override
    public List<Integer> condicion(List<Integer> lista) {
        int aux;
        List<Integer> primos = new ArrayList<>();

        for (Integer numero : lista) {
            aux = 0;
            for (int i = 1; i < lista.get(lista.size() - 1); i++) {
                if (numero % i == 0)
                    aux++;
            }
            if (aux == 2)
                primos.add(numero);
        }
        return primos;
    }

}
