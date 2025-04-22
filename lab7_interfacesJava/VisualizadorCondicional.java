import java.util.List;

public class VisualizadorCondicional {

    public void mostrar(String men, List<Integer> num, idCondicion cond) {
        System.out.println(men);
        System.out.println(cond.condicion(num) + "\n");
    }

}
