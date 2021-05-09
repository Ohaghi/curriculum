var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        searchWord:'',
    },
    //watchでlistの変更を監視
    watch: {
        list: {
            handler: function() {
                //localStorageにデータを保存
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },
    //マウントされた時にlocalStorageからデータを取得
    mounted: function() {
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    methods: {
        addToDo: function() {
            if (this.addText !== '') {
                this.list.push({
                    text: this.addText, 
                    isChecked: false,
                });
            }
            this.addText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        }
    },
    
    computed:{
        undone:function(){
            let count = this.list.filter(function(todo){
                return todo.isChecked;
            }).length;
            return count;
        },
        filterList:function(){
            var filList =[];
            for(var i in this.list){
            let todo = this.list[i];
                if(todo.text.indexOf(this.searchWord)!== -1){
                filList.push(todo);
                }
            }  
            return filList;   
        }
    }
});