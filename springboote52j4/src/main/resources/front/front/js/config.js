
var projectName = '小学生身体素质测评管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '测试信息',
	url: './pages/ceshixinxi/list.html'
}, 

{
	name: '交流论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '校园资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboote52j4/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","导入"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除","查看评论"],"menu":"测试信息","menuJump":"列表","tableName":"ceshixinxi"}],"menu":"测试信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"测试报名","menuJump":"列表","tableName":"ceshibaoming"}],"menu":"测试报名管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","删除","报告"],"menu":"体测数据","menuJump":"列表","tableName":"ticeshuju"}],"menu":"体测数据管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除","报表"],"menu":"测试报告","menuJump":"列表","tableName":"ceshibaogao"}],"menu":"测试报告管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"消息通知","menuJump":"列表","tableName":"xiaoxitongzhi"}],"menu":"消息通知管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除"],"menu":"数据推送","menuJump":"列表","tableName":"shujutuisong"}],"menu":"数据推送管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除","报表"],"menu":"健康评估","menuJump":"列表","tableName":"jiankangpinggu"}],"menu":"健康评估管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"校园资讯","tableName":"news"},{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","报名"],"menu":"测试信息列表","menuJump":"列表","tableName":"ceshixinxi"}],"menu":"测试信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"测试报名","menuJump":"列表","tableName":"ceshibaoming"}],"menu":"测试报名管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"测试报告","menuJump":"列表","tableName":"ceshibaogao"}],"menu":"测试报告管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"消息通知","menuJump":"列表","tableName":"xiaoxitongzhi"}],"menu":"消息通知管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"数据推送","menuJump":"列表","tableName":"shujutuisong"}],"menu":"数据推送管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"健康评估","menuJump":"列表","tableName":"jiankangpinggu"}],"menu":"健康评估管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","报名"],"menu":"测试信息列表","menuJump":"列表","tableName":"ceshixinxi"}],"menu":"测试信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","导入"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除","数据上传","审核"],"menu":"测试报名","menuJump":"列表","tableName":"ceshibaoming"}],"menu":"测试报名管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除"],"menu":"体测数据","menuJump":"列表","tableName":"ticeshuju"}],"menu":"体测数据管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"数据推送","menuJump":"列表","tableName":"shujutuisong"}],"menu":"数据推送管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","报名"],"menu":"测试信息列表","menuJump":"列表","tableName":"ceshixinxi"}],"menu":"测试信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
