var express = require('express');
var router = express.Router();

/* POST info page. */
router.post('/', function(req, res, next) {
  res.render('info', { date: '20230105' });
});

module.exports = router;