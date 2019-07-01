//package com.gj;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author Gjing
// **/
//@Component
//public class GlobalFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        //设置过滤类型
//        return FilterConstants.PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        //设置过过滤器优先级
//        return -4;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        //是否需要过滤
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        String token = request.getHeader("token");
//        if (StringUtils.isEmpty(token)) {
//            //返回错误信息
//            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//            context.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
//            context.setSendZuulResponse(false);
//            return null;
//        }
//        return null;
//    }
//}
//
