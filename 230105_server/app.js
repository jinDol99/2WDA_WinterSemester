const express = require('express');
const app = express();

const indexRouter = require('./routes/index')
const helloRouter = require('./routes/hello')

app.use('/', indexRouter);
app.use('/hello', helloRouter);

module.exports = app;   // 현재 app.js를 타 파일에서 불러올 수 있도록 내보냄