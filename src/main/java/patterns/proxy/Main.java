package patterns.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        IPersonalBean bean = new PersonBean("Joe","2","3","4");
        IPersonalBean proxyInstance = (IPersonalBean)Proxy.newProxyInstance(bean.getClass().getClassLoader()
                ,bean.getClass().getInterfaces(),new OwnInvocationHandler(bean));
        System.out.println(proxyInstance.getName());
        try{
            proxyInstance.setHobby("swim");
            System.out.println("set hobby success");
        }catch (Exception e){
            System.out.println("cannot set hobby");
        }


        IPersonalBean proxyInstance2 = (IPersonalBean)Proxy.newProxyInstance(bean.getClass().getClassLoader()
                ,bean.getClass().getInterfaces(),new NotOwnInvocationHandler(bean));
        System.out.println(proxyInstance2.getName());
        try{
            proxyInstance2.setHobby("swim");
            System.out.println("set hobby success");
        }catch (Exception e){
            System.out.println("cannot set hobby");
        }
    }
}
