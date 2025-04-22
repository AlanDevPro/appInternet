class Complejo {
    constructor(real, imaginaria) {
        this.real = real
        this.imaginaria = imaginaria
    }

    sumar(numero) {
        return new Complejo(this.real + numero.real, this.imaginaria + numero.imaginaria)
    }

    restar(numero) {
        return new Complejo(this.real - numero.real, this.imaginaria - numero.imaginaria)
    }

    multiplicar(numero) {
        return new Complejo((this.real * numero.real - this.imaginaria * numero.imaginaria), this.real * numero.imaginaria + this.imaginaria * numero.real)
    }

    imprimir() {
        if (this.imaginaria > 0)
            return console.log(this.real + ' + ' + this.imaginaria + 'i')
        else
            return console.log(this.real + ' - ' + this.imaginaria + 'i')
    }


}

console.log('Numeros Complejos en JavaScript\n')
let c1 = new Complejo(3, 2)
let c2 = new Complejo(1, 4)
let stringc1 = c1.imprimir(), stringc2 = c2.imprimir()

let suma = c1.sumar(c2)
let resta = c1.restar(c2)
let multiplicacion = c1.multiplicar(c2)

stringc1
stringc2
console.log('suma = ' + suma.real + ' + ' + suma.imaginaria + 'i')
console.log('resta = ' + resta.real + ' + ' + resta.imaginaria + 'i')
console.log('multiplicacion = ' + multiplicacion.real + ' + ' + multiplicacion.imaginaria + 'i')