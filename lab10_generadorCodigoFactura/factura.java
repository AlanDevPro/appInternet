import java.math.BigInteger;

public class factura {

    public static class StringTools {

        public static String CompleteCero(String pString, int j, boolean pRigth) {

            var vNewString = "";
            if (pString.length() < j) {

                for (int i = pString.length(); i < j; i++) {

                    vNewString = vNewString.concat("0");
                }

            }

            return vNewString.concat(pString);
        }

        public static String Base16(String pString) {

            BigInteger vValor = new BigInteger(pString);

            return vValor.toString(16);
        }

        public static String Base10(String pString) {

            BigInteger vValor = new BigInteger(pString, 16);

            return vValor.toString();
        }
    }

    public static void main(String[] args) {

        String NIT_EMISOR = StringTools.CompleteCero("123456789", 13, false);
        String FECHA_HORA = "20190113163721231";
        String SUCURSAL = StringTools.CompleteCero("0", 4, false);
        String MODALIDAD = "1";
        String TIPO_EMISIÓN = "1";
        String TIPO_FACTURA_DOCUMENTO_AJUSTE = "1";
        String TIPO_DOCUMENTO_SECTOR = StringTools.CompleteCero("1", 2, false);
        String NUMERO_DE_FACTURA = StringTools.CompleteCero("1", 10, false);
        String POS = StringTools.CompleteCero("0", 4, false);

        String campos = NIT_EMISOR + FECHA_HORA + SUCURSAL + MODALIDAD + TIPO_EMISIÓN + TIPO_FACTURA_DOCUMENTO_AJUSTE
                + TIPO_DOCUMENTO_SECTOR + NUMERO_DE_FACTURA + POS;

        cripto crip = new cripto();

        String modulo11 = campos + crip.obtenerModulo11(campos);

        String base16 = StringTools.Base16(modulo11).toUpperCase();

        String solicitudCufd = "A19E23EF34124CD";
        String CUF = base16 + solicitudCufd;

        System.out.println(
                "Laboratorio 10 - SIS324      Limachi Villarroel Alan Nicolas      Ingeneria en Ciencias de la Compuatcion");
        System.out.println("\n" + CUF);

    }
}
