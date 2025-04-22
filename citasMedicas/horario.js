class Horario {
    constructor(id, turno, estado, fecha, hora) {
        this._id = id;
        this._turno = turno;
        this._estado = estado;
        this._fecha = fecha;
        this._hora = hora;
    }

    // Getters
    get id() {
        return this._id;
    }

    get turno() {
        return this._turno;
    }

    get estado() {
        return this._estado;
    }

    get fecha() {
        return this._fecha;
    }

    get hora() {
        return this._hora;
    }

    // Setters
    set turno(turno) {
        this._turno = turno;
    }

    set estado(estado) {
        this._estado = estado;
    }

    set fecha(fecha) {
        this._fecha = fecha;
    }

    set hora(hora) {
        this._hora = hora;
    }
}

// Exportar la clase para que pueda ser utilizada en otros archivos
module.exports = Horario;