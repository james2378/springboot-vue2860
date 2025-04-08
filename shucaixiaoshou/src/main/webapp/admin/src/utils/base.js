const base = {
    get() {
        return {
            url : "http://localhost:8080/shucaixiaoshou/",
            name: "shucaixiaoshou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shucaixiaoshou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "绿色蔬菜销售管理"
        } 
    }
}
export default base
