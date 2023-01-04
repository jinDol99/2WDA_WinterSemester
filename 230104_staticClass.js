// 4장 24페이지
class Rectangle{
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
}

const Circle = class {
    constructor(radius) {
        this.radius = radius;
    }
}

const r = new Rectangle(10, 10);
const c = new Circle(5);
console.log(r);
console.log(c);