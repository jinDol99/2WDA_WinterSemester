const express = require('express');
const router = express.Router();

router.get('/', (req, res)=>{ // 라우팅: 주소가 '/'으로 끝날 경우 welcome 메시지 보냄
    res.send('Welcome');
})

module.exports = router;