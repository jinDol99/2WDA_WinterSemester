const http = require('http');
const { off } = require('process');
const server = http.createServer((req, res)=>{
    res.writeHead(200, {'Content-Type':'text/html'});
    if(req.url == '/hello')
        res.end('<html><head></head><body><h1>Hello</h1></body></html>');
    else 
        res.end('<html><head></head><body><h1>Welcome</h1></body></html>');
    
});
server.listen(3000);