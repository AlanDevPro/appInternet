import java.util.List;

public class esDivisor implements idCondicion {
    int divisor;

    public esDivisor(int _divisor) {
        this.divisor = _divisor;
    }

    @Override
    public List<Integer> condicion(List<Integer> lista) {
        return lista;
    }
}
