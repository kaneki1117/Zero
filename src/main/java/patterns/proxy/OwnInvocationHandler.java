package patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnInvocationHandler implements InvocationHandler {
    private IPersonalBean personBean;

    public OwnInvocationHandler(IPersonalBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().startsWith("setScore")){
             throw new IllegalAccessException("");
        }else {
            return method.invoke(personBean,args);
        }
    }
}
