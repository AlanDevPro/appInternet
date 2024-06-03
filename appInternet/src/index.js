import app from './app.js';
import { sequelize } from './database/database.js';
import './models/Medic.js';
import './models/Office.js';

async function main() {

    await sequelize.sync();
    app.listen(8080);
    console.log('Lab-12 API REST ORM SEQUELIZE          Limachi Villarroel Alan Nicolas');
    console.log('sever is listening on port', 8080);

}

main();