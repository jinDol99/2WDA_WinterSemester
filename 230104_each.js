// 항목을 하나씩 exports 객체에 추가하는 방법

// 원래 존재하지 않는 'message' 변수를 추가함
module.exports.message = 'Util module';

module.exports.hello = (user)=>{
    console.log(`Hello ${user}`);   
};

// 위 람다식은 아래와 같이 풀어 쓸 수 있음.
/*
module.exports.hello = function (user) {
    console.log(`Hello ${user}`);   
};
*/