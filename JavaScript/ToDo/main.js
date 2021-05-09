var app = new Vue({
    el: '#app',
    data: {
        list: [
            
        ],
        newText:''
    },
    methods:{
        addText : function(){
            if (this.newText !== '') {
            this.list.push({
                text:this.newText,
                isChecked:false
            });
        }
            this.newText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        }
    }
});