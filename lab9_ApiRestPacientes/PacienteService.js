const Paciente = require('./Paciente');



class PacienteService {

    constructor() {

        this.pacientes = [

            new Paciente(1, 'Juan', '1990-01-01'),

            new Paciente(2, 'María', '1985-05-15'),

            new Paciente(3, 'Pedro', '1978-10-30')

        ];

    }

    addPaciente(paciente) {
        this.pacientes.push(paciente);
    }

    getAllPacientes() {
        return this.pacientes;
    }

    getPacienteById(id) {
        for (const paciente of this.pacientes) {
            if (paciente.id === id)
                return paciente;
        }

        return null;
    }

}

module.exports = PacienteService;