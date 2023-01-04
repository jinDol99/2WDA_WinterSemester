
function test(value) {
    return new Promise((resolve, reject)=>{
        if (value >= 0)
            resolve('ok');
        else
            reject('error');
    });
}

test(1)
.then((result)=>{ console.log(result); })
.catch((error)=>{ console.log(error); })


/*
function test(value) {
    return new Promise((resolve, reject)=>{
        if(value>=0)
            resolve('ok');
        else
            reject('error');
    });
}
*/