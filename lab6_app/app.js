const express = require('express');
const app = express();

app.listen(5000, () => {
    console.log("Servidor escuchando en http://localhost:5000");
});


app.get("/", (req, res) => {
    res.send("Hola mundo \n Ramiro duran");
});

