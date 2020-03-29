Welcome to Spring Cloud Functions demo with AWS

This tutorial uses Spring cloud functions using @Beans and 
AWS Lambda for accessing the AWS S3 where the application jar file is 
stored. We will have AWS API Gateway for accesing the application lambda API's.

We will also use CloudWatch logs (optional)

Below are the steps:

1. Make sure you are using at least Spring cloud function context version 3.0.3 release(Previous version may not work),
2. Remove the unnecessary spring framework function dependency, refer to POM for further discussion,
3. Use lombok for log printing in AWS CloudWatch,
4. Please use the handler for handling the input and output for the function,
5. Create a function like Spring-Cloud-Function in API gateway,
6. Upload the app jar and give your packagename.handlerClassName as your handlerinfo
7. Test the endpoint created by AWS, it should display your default message with null values,
8. Then use curl -X POST -H 'Content-Type: text/plain' {YourAPIURLHereWithoutQuotes} -d 'This is {YourName/test msg} first Spring Cloud Function on AWS, is it working?' -i
9. Now your should see all the msg displayed with headerInfo like below:
date: Sun, 29 Mar 2020 12:08:37 GMT
content-type: text/plain; charset=utf-8
content-length: 142
apigw-requestid: {SomeArbitraryCodes}
10. Go and Check CloudWatch logs and you should be able to see the logged statement.

Happy Spring Cloud Functioning !!!
