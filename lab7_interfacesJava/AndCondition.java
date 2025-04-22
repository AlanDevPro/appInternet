
import java.util.List;

public class AndCondition implements idCondicion {
    idCondicion condicion1;
    idCondicion condicion2;

    public AndCondition(idCondicion _condicion1, idCondicion _condicion2) {
        this.condicion1 = _condicion1;
        this.condicion2 = _condicion2;
    }

    @Override
    public List<Integer> condicion(List<Integer> lista) {

        List<Integer> cond1 = this.condicion1.condicion(lista);
        List<Integer> andList = this.condicion2.condicion(cond1);

        return andList;
    }
}
