let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
    for(i=0;i<numbers.length;i++){
        if(numbers[i] % 2 === 0){
        num = numbers[i];
        console.log(num + 'は偶数です');
        }
    } 
}
isEven();

class Car{
    constructor(gass,number){
        this.gass=gass;
        this.number=number;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です`);
    }
}

let mycar = new Car('満タン',1234);
mycar.getNumGas();