const { Sequelize, DataTypes } = require('sequelize');
const sequelize = require('./database');

const User = sequelize.define('User', {
    fullname: {
        type: DataTypes.STRING,
        allowNull: false
    },
    username: {
        type: DataTypes.STRING,
        allowNull: false,
        unique: true
    },
    password: {
        type: DataTypes.STRING,
        allowNull: false
    },
    role: {
        type: DataTypes.STRING,
        allowNull: false
    }
});

module.exports = User;

// Crear el usuario por defecto si no existe
(async () => {
    await sequelize.sync(); // Asegurarse de que las tablas estén creadas
    const user = await User.findOne({ where: { username: 'manuelrua35' } });
    if (!user) {
        await User.create({
            fullname: 'Alan Nicolas Limachi Villarroel',
            username: 'alanlimachi35',
            password: '1234',
            role: 'medico'
        });
        console.log('Usuario por defecto creado');
    } else {
        console.log('Usuario por defecto ya existe');
    }
})();

