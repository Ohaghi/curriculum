class Taiyaki{
    constructor(flav){
        this.flav=flav;
    }

    whatIsIn(){
        console.log(`中身は${this.flav}です`);
    }
}

let anko = new Taiyaki('あんこ');
anko.whatIsIn();
let cream = new Taiyaki('クリーム');
cream.whatIsIn();
let cheese = new Taiyaki('チーズ');
cheese.whatIsIn();