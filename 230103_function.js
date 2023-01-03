// 함수의 Hoisting 실습 [3장 6페이지]

console.log(hello());

function hello() {
    return 'Hello'
}

console.log('\n---------------------------\n')


// 객체의 생성: 올바른 예시
const obj = {
    values:[]
}
console.log(obj.values.length)      // 0

obj.values.push('first');
obj.values.push('second');

console.log(obj);                   // { values: [ 'first', 'second' ] }
console.log(obj.values[0]);         // first
console.log(obj.values.length);     // 2

obj.values.shift();                 // 'first' 제거

console.log(obj);                   // { values: [ 'first', ] }
console.log(obj.values[0]);         // second
console.log(obj.values.length);     // 1


console.log('\n---------------------------\n')


// 객체의 생성: 잘못된 예시
const wrongObj = {
    values:{}
}
console.log(wrongObj.values.length)     // undefinded

wrongObj.values[0] = "first"
wrongObj.values[1] = "second"

console.log(wrongObj);                   // { [0]:'first', [1]:'second' }
console.log(wrongObj.values[0]);         // first
console.log(wrongObj.values.length);     // undefinded

delete wrongObj.values[0]                // 예상: 0번 인덱스인 'first' 제거

console.log(wrongObj);                   // { [1]:'second' }
console.log(wrongObj.values[0]);         // undefinded
console.log(wrongObj.values.length);     // undefinded

console.log('\n---------------------------\n')


// 객체의 속성 [3장 17페이지]
const myObj = {
    id: 1,
    arr: [1, 2, 3]
}
console.log(myObj);

Object.defineProperty(myObj, 'value', {
    configurable: false,
    enumerable: true,
    value: 'aa',
    writable: false
});
console.log(myObj);

console.log(delete myObj.value);
console.log(myObj);
myObj.value = '123';
console.log(myObj);

console.log('\n---------------------------\n')


// 객체 속 데이터의 속성 [3장 19페이지]
/*
const myObj2 = {
    id: 1,
    arr: [1, 2, 3]
}
console.log(myObj2);

myObj2.defineProperty(myObj2), 'value', {
    configurable: false,

}

console.log('\n---------------------------\n')
*/

// 함수를 객체로 사용하기 [3장 24페이지]
function add(n1, n2) {
    return n1 + n2;
}

function sub(n1, n2) {
    return n1 - n2;
}

// function executor(f, a, b) {
//     return f(a, b);
// }

function executor(type) {
    if (type == 'add')
        return add
    else
        return sub
}

// const result = executor(add, 1, 1);
// console.log(result);

const f = executor('add');
console.log(f(1,1));

console.log('\n---------------------------\n')


// 함수 안에 함수 [3장 25페이지]
function outer() {
    function inner() {
        console.log('inner')
    }

    console.log('outer')
    inner();
    inner();
}

outer();

console.log('\n---------------------------\n')


// 함수 선언 시 매개변수 가변적으로 지정 [3장 29페이지]
function test(...params) {
    console.log(params.length)
    if(params.length > 0)
    console.log(params[0])
}

test();
test(1);
test(1, 2, 3)

console.log('\n---------------------------\n')

// 구조 분해 할당 [3장 33페이지]
const arr = ['a', 'b', 'c', 'd']

let [value1, value2, ...restValues] = arr
console.log(value1, value2);
console.log(restValues)

console.log('\n---------------------------\n')


// 배열 [3장 36페이지]
const myArr = [1, 2, 3, 4];
console.log(myArr);
console.log(myArr[0]);

myArr.push(5);
console.log(myArr);

myArr.pop();
console.log(myArr);

const myValue = myArr.splice(1, 2);
console.log('removed: ', myValue);
console.log(myArr);

const myArray = [1, 2, 3, 4];

// 배열과 관련된 함수는 실무에서 자주 쓰이니 한번 따라 쳐보는 것 추천!

console.log('\n---------------------------\n')


// for in과 for of [3장 47페이지]
const iterArr = [1, 3, 5, 7, 9];

console.log('\n++ traditional ++')
for(let i = 0; i < iterArr.length; i++) {
    console.log(iterArr[i]);
}

console.log('\n++ for each ++')
iterArr.forEach((item)=>{
    console.log(item)
});

console.log('\n++ for of ++')
for (let i of iterArr){
    console.log(i)
}
