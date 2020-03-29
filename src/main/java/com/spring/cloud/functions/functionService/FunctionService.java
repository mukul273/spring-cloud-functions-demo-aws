package com.spring.cloud.functions.functionService;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@Slf4j
public class FunctionService implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent args) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody("Spring Cloud function demo in AWS with Lambda, ApiGateWay, S3 and CloudWatch:" + args.getBody());
        log.info("Spring Cloud function demo in AWS with Lambda, ApiGateWay, S3 and CloudWatch:" + args.getBody());
        return responseEvent ;
    }
}