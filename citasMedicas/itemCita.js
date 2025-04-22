class ItemCita {
    constructor(id, estado, tipoConsulta, formaPago, observacion, prioridad, duracion, ubicacion) {
        this._id = id;
        this._estado = estado;
        this._tipoConsulta = tipoConsulta;
        this._formaPago = formaPago;
        this._observacion = observacion;
        this._prioridad = prioridad;
        this._duracion = duracion;
        this._ubicacion = ubicacion;
    }

    // Getters
    get id() {
        return this._id;
    }

    get estado() {
        return this._estado;
    }

    get tipoConsulta() {
        return this._tipoConsulta;
    }

    get formaPago() {
        return this._formaPago;
    }

    get observacion() {
        return this._observacion;
    }

    get prioridad() {
        return this._prioridad;
    }

    get duracion() {
        return this._duracion;
    }

    get ubicacion() {
        return this._ubicacion;
    }

    // Setters
    set estado(estado) {
        this._estado = estado;
    }

    set tipoConsulta(tipoConsulta) {
        this._tipoConsulta = tipoConsulta;
    }

    set formaPago(formaPago) {
        this._formaPago = formaPago;
    }

    set observacion(observacion) {
        this._observacion = observacion;
    }

    set prioridad(prioridad) {
        this._prioridad = prioridad;
    }

    set duracion(duracion) {
        this._duracion = duracion;
    }

    set ubicacion(ubicacion) {
        this._ubicacion = ubicacion;
    }
}

// Exportar la clase para que pueda ser utilizada en otros archivos
module.exports = ItemCita;