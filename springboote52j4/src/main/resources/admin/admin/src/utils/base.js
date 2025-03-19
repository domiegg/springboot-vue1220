const base = {
    get() {
        return {
            url : "http://localhost:8080/springboote52j4/",
            name: "springboote52j4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboote52j4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小学生身体素质测评管理系统"
        } 
    }
}
export default base
