const express = require('express');
const router = express.Router();
const UserService = require('../services/userService');
const userService = new UserService();

// Obtener todos los usuarios
router.get('/', async (req, res) => {
    const users = await userService.getAllUsers();
    res.render('index_user', { users });
});

// Formulario para crear un nuevo usuario
router.get('/new', (req, res) => {
    res.render('new');
});

// Crear un nuevo usuario
router.post('/', async (req, res) => {
    const { fullname, username, password, role } = req.body;
    await userService.createUser({ fullname, username, password, role });
    res.redirect('/users');
});

// Formulario para editar un usuario
router.get('/:id/edit', async (req, res) => {
    const user = await userService.getUserById(req.params.id);
    res.render('edit', { user });
});

// Actualizar un usuario
router.post('/:id', async (req, res) => {
    const { fullname, username, password, role } = req.body;
    await userService.updateUser(req.params.id, { fullname, username, password, role });
    res.redirect('/users');
});

// Eliminar un usuario
router.post('/:id/delete', async (req, res) => {
    await userService.deleteUser(req.params.id);
    res.redirect('/users');
});

// Buscar usuario por ID
router.get('/:id', async (req, res) => {
    const user = await userService.getUserById(req.params.id);
    if (user) {
        res.json(user);
    } else {
        res.status(404).send('Usuario no encontrado');
    }
});

// Buscar usuario por username desde formulario
router.get('/username/search', (req, res) => {
    const username = req.query.username;
    if (username) {
        res.redirect(`/users/username/${username}`);
    } else {
        res.redirect('/users');
    }
});

// Buscar usuario por username
router.get('/username/:username', async (req, res) => {
    const user = await userService.getUserByUsername(req.params.username);
    if (user) {
        res.render('user_detail', { user }); // Asegúrate de tener una vista 'user_detail.pug'
    } else {
        res.status(404).send('Usuario no encontrado');
    }
});

module.exports = router;
