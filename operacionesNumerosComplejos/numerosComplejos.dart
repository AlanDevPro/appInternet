void main() {
  Complejo c1 = Complejo(1, 2);
  Complejo c2 = Complejo(3, 4);
  String stringc1 = c1.imprimir();
  String stringc2 = c2.imprimir();

  Complejo suma = c1.sumar(c2);
  Complejo resta = c1.restar(c2);
  Complejo multiplicacion = c1.multiplicar(c2);

  print('Numeros Complejos en Dart\n');
  print(stringc1);
  print(stringc2);
  print('suma = ${suma.real} + ${suma.imaginario}i');

  print('resta = ${resta.real} + ${resta.imaginario}i');

  print(
      'multiplicacion= ${multiplicacion.real} + ${multiplicacion.imaginario}i');
}

class Complejo {
  int real;
  int imaginario;

  Complejo(this.real, this.imaginario);

  Complejo sumar(Complejo numero) {
    return Complejo(
        this.real + numero.real, this.imaginario + numero.imaginario);
  }

  Complejo restar(Complejo numero) {
    return Complejo(
        this.real - numero.real, this.imaginario - numero.imaginario);
  }

  Complejo multiplicar(Complejo numero) {
    return Complejo(
        this.real * numero.real - this.imaginario * numero.imaginario,
        this.real * numero.imaginario + this.imaginario * numero.real);
  }

  String imprimir() {
    if (this.imaginario > 0)
      return '${real} + ${imaginario}i';
    else
      return '$real - ${imaginario}i';
  }
}
