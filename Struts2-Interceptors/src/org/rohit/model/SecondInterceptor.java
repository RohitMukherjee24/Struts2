package org.rohit.model;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


/**
 * Created by rohit on 1/29/2017.
 */
public class SecondInterceptor implements Interceptor {

    public void destroy(){}

    public void init(){}

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        String startInterceptor="   Start Interceptor 2";
        System.out.println(startInterceptor);
        String result=actionInvocation.invoke();
        String endInterceptor="   End Interceptor 1";
        System.out.println(endInterceptor);
        return result;
    }

}