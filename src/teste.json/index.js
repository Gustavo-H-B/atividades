const http = require("http");

const server = http.createServer((req, res) => {
    res.end("Olá do Node.js!");
});

server.listen(3001, () => {
    console.log("Servidor rodando na porta 3001");
});

//node 'nome do arquivo definifo como main no package.jason'