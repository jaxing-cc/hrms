import Vue from 'vue'
import Router from 'vue-router'
import Home from '../components/Home'
import Login from  '../components/Login'
import Main from "../components/main/Main";
import Authority from '../components/auth/Authority'
import Info from  '../components/info/Info'
import Employ from "../components/employ/Employ";
import Framework from '../components/framework/Framework'
import MsgPush from "../components/msg/MsgPush";
import InfoUpdate from "../components/employ/InfoUpdate";
import Sign from "../components/sign/Sign";
Vue.use(Router);

const router= new Router({
  routes: [
    { path:'/' , redirect: '/login'},
    { path:'/login' , component: Login},
    {
      path: '/home',
      component: Home ,
      redirect: '/home/main',
      children :[
        {path: '/home/main', component: Main},
        {path: '/home/authority', component: Authority},
        {path: '/home/info', component: Info},
        {path: '/home/user', component: Employ},
        {path: '/home/framework', component: Framework},
        {path: '/home/msg', component: MsgPush},
        {path: '/home/employ_info',component: InfoUpdate},
        {path: '/home/attendance',component: Sign},
      ]
    }
  ]
});

router.beforeEach( (to,from,next) =>{
  //to从哪来
  //from去哪
  //next放行函数
  if (to.path==='/login'){return next();}
  const token = sessionStorage.getItem("token");
  if (!token) {
    return next('/login');
  }
  next();
});
export default router;
//挂载路由导航

router.beforeEach(((to, from, next) => {
  //to从哪来 from到哪去
  if (to.path==='/login'){
      return next();
  }
  const token = window.sessionStorage.getItem("token");
  if (!token){
    return router.replace('/login');
  }else{
    return next();
  }
}));
