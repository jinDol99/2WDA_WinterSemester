import obj6 from "./obj6.js";
import { message, hello, bye } from "./each6.js";
// 2 라인과 같이 구조분해할당으로 import 받는다면
// 아래와 같이 obj6.sayHello() 형식이 아닌
// hello() 처럼 곧바로 사용해야함.

console.log(obj6);
obj6.sayHello();

console.log(message);
hello(obj6.user);
bye();
