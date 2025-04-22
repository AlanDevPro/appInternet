
import java.util.List;

public class NotCondition implements idCondicion {
    idCondicion not;

    public NotCondition(idCondicion condicion) {
        this.not = condicion;
    }

    @Override
    public List<Integer> condicion(List<Integer> lista) {
        int aux = 0;
        List<Integer> notlista = lista;
        for (Integer numero : not.condicion(lista)) {
            for (int i = aux; i < notlista.size(); i++) {
                if (numero == lista.get(i)) {
                    lista.remove(i);
                    aux = i;
                    break;
                }

            }
        }
        return lista;
    }

}
