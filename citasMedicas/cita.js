class Cita {
    constructor(id, medico, paciente, fechaHora, estado, costo, descripcion) {
        this._id = id;
        this._medico = medico;
        this._paciente = paciente;
        this._fechaHora = fechaHora;
        this._estado = estado;
        this._costo = costo;
        this._descripcion = descripcion;
    }

    // Getters
    get id() {
        return this._id;
    }

    get medico() {
        return this._medico;
    }

    get paciente() {
        return this._paciente;
    }

    get fechaHora() {
        return this._fechaHora;
    }

    get estado() {
        return this._estado;
    }

    get costo() {
        return this._costo;
    }

    get descripcion() {
        return this._descripcion;
    }

    // Setters
    set medico(medico) {
        this._medico = medico;
    }

    set paciente(paciente) {
        this._paciente = paciente;
    }

    set fechaHora(fechaHora) {
        this._fechaHora = fechaHora;
    }

    set estado(estado) {
        this._estado = estado;
    }

    set costo(costo) {
        this._costo = costo;
    }

    set descripcion(descripcion) {
        this._descripcion = descripcion;
    }
}

// Exportar la clase para que pueda ser utilizada en otros archivos
module.exports = Cita;