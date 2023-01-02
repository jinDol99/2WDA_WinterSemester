console.log('Hello');

console.log('\n------------------\n')

const val_boolean = true;
const val_null = null;
let val_undefined_1;     // undefined
const val_undefined_2 = undefined;
const val_number_1 = 1;
const val_number_2 = 1.1;
const val_bigint = 1n;
const val_String = 'abc';

console.log(typeof val_boolean);
console.log(typeof(val_null));
console.log(typeof val_undefined_1);
console.log(typeof val_undefined_2);
console.log(typeof val_number_1);
console.log(typeof val_number_2);
console.log(typeof val_bigint);
console.log(typeof val_String);

console.log('\n------------------\n')

let i = 0;
const str = `value is ${i + 5}`;
const str2 = `Hello,
Everyone`;

console.log(str);
console.log(str2);
// string은 따옴표 뿐만 아니라 백틱을 사용하여 입력할 수 있으며,
// 백틱을 사용할 경우 줄바꿈과 int 타입 계산도 할 수 있음.

console.log('\n------------------\n');

const score = 10;
let result;

if (score > 5)
    result = true;
else
    result = false;

console.log(result);    // true

// 위 if-else문은 아래의 삼항연산자 ?와 같은 구조.
result = score > 5 ? true : false;
console.log(result);    // true

/* console.log('\n------------------\n');

const switchValue = 1;

swtich (switchValue % 2) {
    case 0:
        console.log('Even');
        break;
}

const switchValue2 = '0';
swtich (switchValue2) {
    case 0:
        console.log('case 0');
        break;
    default:
        console.log('defalut');
} */

console.log('\n------------------\n');

outer: myOuterLabel
for(let i = 0; i < 3; i++) {
    inner: myInnerLabel
    for(let j = 0; j < 3; j++) {
        if (i+j > 2) break;
        console.log(`${i} + ${i+j}`);
    }
}