let numero = 'ropw(76ew + ew11reeri) + '
let resultado = ''
for (let l = 0; numero[l] != 'i'; l++) {
    if (parseInt(numero[l]))
        resultado = resultado + (numero[l])
    else {
        if (numero[l] == '+')
            resultado = resultado + ' + '
        if (numero[l] == 'i')
            resultado = resultado + 'i'
    }
}

console.log(resultado)






