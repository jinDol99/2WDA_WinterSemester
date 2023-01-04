const message = 'Util module';

const hello = (user)=>{
    console.log(`Hello ${user}`);
};

const bye = ()=>{
    console.log('Bye');
};

export {
    message,
    hello,
    bye
}
