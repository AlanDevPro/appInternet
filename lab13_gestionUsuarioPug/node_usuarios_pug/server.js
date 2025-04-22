const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const userRoutes = require('./routes/users');
const sequelize = require('./models/database');

const app = express();
const PORT = 3000;

// Configurar el motor de plantillas Pug
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

// Middleware
app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, 'public')));

// Rutas
app.use('/users', userRoutes);
const mainRoutes = require('./routes/main');
app.use('/', mainRoutes);

// Sincronizar con la base de datos y luego iniciar el servidor
sequelize.sync().then(() => {
    app.listen(PORT, () => {
        console.log(`Server is running on http://localhost:${PORT}`);
    });
});
