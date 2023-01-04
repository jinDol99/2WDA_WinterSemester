// 내부 폴더 안에 있다면 경로를 이런식으로 작성하면 됨
// 만약, 내부 폴더 안에 해당 파일이 없다면 기본적으로 index.js 파일을 실행함
const user = require('./user')

const admin = require('./admin')

console.log(user.userId);
console.log(user.name);
console.log(admin.adminId);
console.log(admin.checkAdmin('11, 22'));