import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ceshibaogao from '@/views/modules/ceshibaogao/list'
    import news from '@/views/modules/news/list'
    import discussceshixinxi from '@/views/modules/discussceshixinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xiaoxitongzhi from '@/views/modules/xiaoxitongzhi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import shujutuisong from '@/views/modules/shujutuisong/list'
    import forum from '@/views/modules/forum/list'
    import ticeshuju from '@/views/modules/ticeshuju/list'
    import ceshixinxi from '@/views/modules/ceshixinxi/list'
    import ceshibaoming from '@/views/modules/ceshibaoming/list'
    import config from '@/views/modules/config/list'
    import jiankangpinggu from '@/views/modules/jiankangpinggu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/ceshibaogao',
        name: '测试报告',
        component: ceshibaogao
      }
      ,{
	path: '/news',
        name: '校园资讯',
        component: news
      }
      ,{
	path: '/discussceshixinxi',
        name: '测试信息评论',
        component: discussceshixinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xiaoxitongzhi',
        name: '消息通知',
        component: xiaoxitongzhi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/shujutuisong',
        name: '数据推送',
        component: shujutuisong
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/ticeshuju',
        name: '体测数据',
        component: ticeshuju
      }
      ,{
	path: '/ceshixinxi',
        name: '测试信息',
        component: ceshixinxi
      }
      ,{
	path: '/ceshibaoming',
        name: '测试报名',
        component: ceshibaoming
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiankangpinggu',
        name: '健康评估',
        component: jiankangpinggu
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
