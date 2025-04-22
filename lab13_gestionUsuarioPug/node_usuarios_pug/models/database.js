const { Sequelize } = require('sequelize');

const sequelize = new Sequelize('sqlite::memory:'); // o tu cadena de conexión

module.exports = sequelize;
