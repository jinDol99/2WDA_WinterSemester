// 가장 큰 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120899
/*
var arr = [5, 9, 2, 16, 1, 4];

function findMaxNum(array) {
    let maxNum = 0;
    let maxNumIndex;
    for (let i = 0; i < array.length; i++) {
        if(maxNum < array[i]) {
            maxNum = array[i];
            maxNumIndex = i;
        }
    }
    return [maxNum, maxNumIndex];
}

console.log(findMaxNum(arr));
*/

// 자리수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120906
// 10으로 나누는 원리는 이해했지만 구현을 어떻게 해야할지 몰라 인터넷을 참고함: https://pika-chu.tistory.com/287

/*
let n= 930211;

function answer() {
    let sum = 0;
    while (n > 0) {
        sum += Math.floor(n % 10);
        n = Math.floor(n / 10);
    }
    return sum;
}
*/

// 팩토리얼
// https://school.programmers.co.kr/learn/courses/30/lessons/120848

let n = 7;
let count = 1;

while (count <= 10) {
    n = Math.floor(n/count);
    console.log(n);
    count++;
            
}