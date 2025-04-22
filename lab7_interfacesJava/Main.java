import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = generateRandomNumbers();
        VisualizadorCondicional visualizador = new VisualizadorCondicional();

        Collections.sort(numeros);

        visualizador.mostrar("TODOS", numeros, new AllwaysTrue());

        visualizador.mostrar("PARES", numeros, new CondicionMultiplo(2));

        visualizador.mostrar("IMPARES", numeros, new NotCondition(new CondicionMultiplo(2)));

        visualizador.mostrar("MULTIPLOS DE 5", numeros, new CondicionMultiplo(5));

        visualizador.mostrar("MULTIPLOS DE 3", numeros, new CondicionMultiplo(3));

        visualizador.mostrar("NO MULTIPLOS DE 5", numeros, new NotCondition(new CondicionMultiplo(5)));

        visualizador.mostrar("PRIMOS", numeros, new CondicionPrimo());

        visualizador.mostrar("MES DE UN AÑO", numeros, new EsAnio());

        visualizador.mostrar("MULTIPLO DE 3 OR 5", numeros,
                new OrCondition(new CondicionMultiplo(3), new CondicionMultiplo(5)));

        visualizador.mostrar("NUMEROS PARES Y  MULTIPLOS DE 4", numeros,
                new AndCondition(new CondicionMultiplo(2), new CondicionMultiplo(4)));

        // implementar EsPotencia(int exponente)
        visualizador.mostrar("POTENCIA DE UN NUMERO", numeros, new esPotencia(4));

        // Es divisor exacto de EsDividor(int numerador)
        visualizador.mostrar("DIVISOR EXACTO", numeros, new esDivisor(7));

    }

    public static List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        return randomNumbers;
    }

}