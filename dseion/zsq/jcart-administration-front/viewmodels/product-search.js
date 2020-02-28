var app=new Vue({
    el:'#app',
    data:{
        pageinfo:'',
        pageNum:1
    },
    mounted(){
        console.log('view mounted');
        this.searchProduct();
    },
    method:{
        handlePageChange(val){
            console.log('page change');
            this.pageNum=val;
            this.searchProduct();
        },
        searchProduct(){
            axios.get('/product/search',{
                params:{
                    pageNum:this.pageNum
                }
            }).then(function(response){
                console.log(response);
                app.pageinfo=response.data;
            })
                .carch(function (error){
                    console.log(error);
                });
        }
    }
})