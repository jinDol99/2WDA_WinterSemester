// 가장 큰 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120899

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


// 자리수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120906

console.log(1234/1)