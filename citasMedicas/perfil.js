class Perfil {
    constructor(id, nombre, apellido, email, telefono, contraseña, foto, direccion, fecha_nacimiento, genero, CI, tipo_perfil) {
        this._id = id;
        this._nombre = nombre;
        this._apellido = apellido;
        this._email = email;
        this._telefono = telefono;
        this._contraseña = contraseña;
        this._foto = foto;
        this._direccion = direccion;
        this._fecha_nacimiento = fecha_nacimiento;
        this._genero = genero;
        this._CI = CI;
        this._tipo_perfil = tipo_perfil;
    }

    // Getters
    get id() {
        return this._id;
    }

    get nombre() {
        return this._nombre;
    }

    get apellido() {
        return this._apellido;
    }

    get email() {
        return this._email;
    }

    get telefono() {
        return this._telefono;
    }

    get contraseña() {
        return this._contraseña;
    }

    get foto() {
        return this._foto;
    }

    get direccion() {
        return this._direccion;
    }

    get fecha_nacimiento() {
        return this._fecha_nacimiento;
    }

    get genero() {
        return this._genero;
    }

    get CI() {
        return this._CI;
    }

    get tipo_perfil() {
        return this._tipo_perfil;
    }

    // Setters
    set nombre(nombre) {
        this._nombre = nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }

    set email(email) {
        this._email = email;
    }

    set telefono(telefono) {
        this._telefono = telefono;
    }

    set contraseña(contraseña) {
        this._contraseña = contraseña;
    }

    set foto(foto) {
        this._foto = foto;
    }

    set direccion(direccion) {
        this._direccion = direccion;
    }

    set fecha_nacimiento(fecha_nacimiento) {
        this._fecha_nacimiento = fecha_nacimiento;
    }

    set genero(genero) {
        this._genero = genero;
    }

    set CI(CI) {
        this._CI = CI;
    }

    set tipo_perfil(tipo_perfil) {
        this._tipo_perfil = tipo_perfil;
    }
}

// Exportar la clase para que pueda ser utilizada en otros archivos
module.exports = Perfil;