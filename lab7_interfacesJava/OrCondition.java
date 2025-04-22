
import java.util.List;
import java.util.Random;

public class OrCondition implements idCondicion {
    idCondicion condicion1;
    idCondicion condicion2;

    public OrCondition(idCondicion _condicion1, idCondicion _condicion2) {
        this.condicion1 = _condicion1;
        this.condicion2 = _condicion2;
    }

    @Override
    public List<Integer> condicion(List<Integer> lista) {

        Random random = new Random();
        if ((random.nextInt(2)) == 1)
            return this.condicion1.condicion(lista);
        else
            return this.condicion2.condicion(lista);

    }

}
