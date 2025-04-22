import express from 'express';
import router from './routers/medic.routes.js';

const app = express();

//middlewares
app.use(express.json());

app.use(router);
export default app;