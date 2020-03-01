# An integration example of Spring, Actuator, Prometheus, Undertow, and Dockerization

``
    docker-compose up 
``


> Run prometheus in docker: docker run \
    -p 9090:9090 \
    -v /tmp/prometheus.yml:/etc/prometheus/prometheus.yml \
    prom/prometheus



**Screenshot**

![](https://raw.githubusercontent.com/mohistzh/spring-actuator-undertow/master/screenshot.png)