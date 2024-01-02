const base = {
    get() {
        return {
            url : "http://localhost:8080/majortom/",
            name: "majortom",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/majortom/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园二手物品交易平台"
        } 
    }
}
export default base
