# ssl
1 How to enable HTTPS in a Spring Boot Java application

1), Springboot Configure SSL

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto.webserver.configure-ssl

2), Run the following OpenSSL command to generate your private key and public certificate.

openssl req -newkey rsa:2048 -nodes -keyout key.pem -x509 -days 365 -out certificate.pem

3), Make a browser trust an SSL certificate 

https://localhost:8443/ssl


