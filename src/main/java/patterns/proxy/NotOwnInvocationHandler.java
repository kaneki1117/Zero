package patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnInvocationHandler implements InvocationHandler {
    private IPersonalBean personBean;

    public NotOwnInvocationHandler(IPersonalBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("setScore")){
            return method.invoke(personBean,args);
        }else if(method.getName().startsWith("set")){
             throw new IllegalAccessException("");
        }else {
            return method.invoke(personBean,args);
        }
    }
}
