
public class Complejos {

    public int real;
    public int imaginario;

    public Complejos(int _real, int _imaginario) {
        this.real = _real;
        this.imaginario = _imaginario;
    }

    public Complejos sumar(Complejos numero) {
        return new Complejos(this.real + numero.real, this.imaginario + numero.imaginario);
    }

    public Complejos restar(Complejos numero) {
        return new Complejos(this.real - numero.real, this.imaginario - numero.imaginario);
    }

    public Complejos multiplicar(Complejos numero) {
        return new Complejos((this.real * numero.real - this.imaginario * numero.imaginario),
                (this.real * numero.imaginario + this.imaginario * numero.real));
    }

    public Complejos dividir(Complejos numero) {
        int denominador = numero.real * numero.real + numero.imaginario * numero.imaginario;
        int nuevoReal = (this.real * numero.real + this.imaginario * numero.imaginario) / denominador;
        int nuevoImaginario = (this.imaginario * numero.real - this.real * numero.imaginario) / denominador;
        return new Complejos(nuevoReal, nuevoImaginario);
    }

    public Complejos conjugado() {
        return new Complejos(real, -imaginario);
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }

    public double fase() {
        return Math.atan2(imaginario, real);
    }

    public Complejos potencia(int n) {
        int nuevoReal = (int) Math.round(Math.pow(modulo(), n) * Math.cos(fase() * n));
        int nuevoImaginario = (int) Math.round(Math.pow(modulo(), n) * Math.sin(fase() * n));
        return new Complejos(nuevoReal, nuevoImaginario);
    }

    public Complejos raizCuadrada() {
        int nuevoReal = (int) Math.round(Math.sqrt(modulo()) * Math.cos(fase() / 2));
        int nuevoImaginario = (int) Math.round(Math.sqrt(modulo()) * Math.sin(fase() / 2));
        return new Complejos(nuevoReal, nuevoImaginario);
    }

    public Complejos logaritmo() {
        double r = Math.sqrt(this.real * this.real + this.imaginario * this.imaginario);
        double theta = Math.atan2(this.imaginario, this.real);
        int nuevoReal = (int) Math.round(Math.log(r));
        int nuevoImaginario = (int) Math.round(theta);

        return new Complejos(nuevoReal, nuevoImaginario);
    }

    public String imprimir() {
        if (this.imaginario > 0)
            return Integer.toString(this.real) + " + " + Integer.toString(this.imaginario) + "i";
        else
            return Integer.toString(this.real) + "  " + Integer.toString(this.imaginario) + 'i';
    }

    public static void main(String[] args) {

        Complejos c1 = new Complejos(1, 2);
        Complejos c2 = new Complejos(5, 6);

        Complejos suma = c1.sumar(c2);
        Complejos resta = c1.restar(c2);
        Complejos multiplicacion = c1.multiplicar(c2);
        Complejos division = c1.dividir(c2);
        Complejos conjugado = c1.conjugado();

        double modulo = c1.modulo();
        double fase = c1.fase();

        Complejos potencia = c1.potencia(2);
        Complejos raizCuadrada = c1.raizCuadrada();
        Complejos logaritmo = c1.logaritmo();

        System.out.println("Numeros Complejos en Java\n");
        System.out.println("suma  =  " + suma.imprimir());
        System.out.println("resta   =   " + resta.imprimir());
        System.out.println("multiplicacion   =   " + multiplicacion.imprimir());
        System.out.println("division  =  " + division.imprimir());
        System.out.println("conjugado   =   " + conjugado.imprimir());
        System.out.println("modulo   =   " + modulo);
        System.out.println("fase  =  " + fase);
        System.out.println("potencia   =   " + potencia.imprimir());
        System.out.println("raizCuadrada   =   " + raizCuadrada.imprimir());
        System.out.println("logaritmo   =   " + logaritmo.imprimir());

    }
}