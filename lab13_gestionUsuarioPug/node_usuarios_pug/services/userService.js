const User = require('../models/User');

class UserService {
    async getAllUsers() {
        return await User.findAll();
    }

    async getUserById(id) {
        return await User.findByPk(id);
    }

    async getUserByUsername(username) {
        return await User.findOne({ where: { username } });
    }

    async createUser(data) {
        return await User.create(data);
    }

    async updateUser(id, data) {
        return await User.update(data, {
            where: { id }
        });
    }

    async deleteUser(id) {
        return await User.destroy({
            where: { id }
        });
    }
}

module.exports = UserService;
