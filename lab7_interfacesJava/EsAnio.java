import java.util.ArrayList;
import java.util.List;

public class EsAnio implements idCondicion {

    @Override
    public List<Integer> condicion(List<Integer> lista) {

        List<Integer> month = new ArrayList<>();
        String name = "[ ";
        for (Integer mes : lista) {
            if (mes > 0 && mes < 12) {
                switch (mes) {
                    case 1:
                        name += "ENERO, ";
                        break;
                    case 2:
                        name += "FEBRERO, ";
                        break;
                    case 3:
                        name += "MARZO, ";
                        break;
                    case 4:
                        name += "ABRIL, ";
                        break;
                    case 5:
                        name += "MAYO, ";
                        break;
                    case 6:
                        name += "JUNIO, ";
                        break;
                    case 7:
                        name += "JULIO, ";
                        break;
                    case 8:
                        name += "AGOSTO, ";
                        break;
                    case 9:
                        name += "SEPTIEMBRE, ";
                        break;
                    case 10:
                        name += "OCTUBRE, ";
                        break;
                    case 11:
                        name += "NOVIEMBRE, ";
                        break;
                    case 12:
                        name += "DICIEMBRE, ";
                        break;
                }
                month.add(mes);
            }

        }
        System.out.println(name + "]");
        return month;
    }

}
