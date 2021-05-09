var app = new Vue({
    el:"#app",
    data:{
        score:10,
    newItem:"",
    items:['item1','item2','item3'],
    users:[{name:'tomomi',age:25},{name:'hiroaki',age:32},{name:'shinjiro',age:26},],
    counter: 0
},
    methods:{
        double: function(){
            return this.score * 2 ;
        },
        addItem: function(){
            this.items.push(this.newItem);
        },
        getData: function() {
            console.log("method");
            return Math.random();
        },
        counterBtn: function() {
            this.counter++;
          },
          lessThanThreeMethod: function() {
            return this.counter > 3 ? '3以上' : '3以下';
          }
    },
    computed:{
        data:function(){
            console.log("computed");
            return Math.random(); 
        },
        lessThanThree: function() {
            return this.counter > 3 ? '3以上' : '3以下'
          }
    }
});