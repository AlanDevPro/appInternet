class Secretaria {
    constructor(id, turno, antiguedad, fechaContrato, experiencia, estado) {
        this._id = id;
        this._turno = turno;
        this._antiguedad = antiguedad;
        this._fechaContrato = fechaContrato;
        this._experiencia = experiencia;
        this._estado = estado;
    }

    // Getters
    get id() {
        return this._id;
    }

    get turno() {
        return this._turno;
    }

    get antiguedad() {
        return this._antiguedad;
    }

    get fechaContrato() {
        return this._fechaContrato;
    }

    get experiencia() {
        return this._experiencia;
    }

    get estado() {
        return this._estado;
    }

    // Setters
    set turno(turno) {
        this._turno = turno;
    }

    set antiguedad(antiguedad) {
        this._antiguedad = antiguedad;
    }

    set fechaContrato(fechaContrato) {
        this._fechaContrato = fechaContrato;
    }

    set experiencia(experiencia) {
        this._experiencia = experiencia;
    }

    set estado(estado) {
        this._estado = estado;
    }
}

// Exportar la clase para que pueda ser utilizada en otros archivos
module.exports = Secretaria;