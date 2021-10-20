package bfs.TeamProj_auth.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

@Component
@Aspect
public class LoggingAOPBruceShen {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Before("within(bfs.TeamProj_auth.controller.*) && args(..,request)")
    public void beforeAdvice(JoinPoint joinPoint, HttpServletRequest request) {
        log.info("Web Layer Before Advice");
        log.info("" + joinPoint.getSignature());
        log.info("Class: " + joinPoint.getSignature().getName());
        log.info("Method: " + joinPoint.getSignature().getDeclaringTypeName());
        log.info("arguments: " + Arrays.toString(joinPoint.getArgs()));

        if (null != request) {
            log.info("Start Header Section of request ");
            log.info("Method Type : " + request.getMethod());
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String headerName = (String) headerNames.nextElement();
                String headerValue = request.getHeader(headerName);
                //log.info("Header Name: " + headerName + " Header Value : " + headerValue);
                log.info(headerName + " " + headerValue);
            }
            log.info("Request Path info :" + request.getServletPath());
        }
    }

    @AfterReturning(value = "within(bfs.TeamProj_auth.controller.*)", returning = "res")
    public void afterReturningAdvice(Object res) {
        log.info("Web Layer After Returning Advice ");
        log.info("The return value is: " + res.toString());
    }
}
