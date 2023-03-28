### Simple Boot 3 Application

Simple Spring Boot 3 application with corouter

## Install 

The application needs a ecr url set in local or global gradle.properties
```shell
ecr-repository-root=[YOUR_AWS_ACCOUNT].dkr.ecr.[YOUR_REGION].amazonaws.com
```
The gradle jib task will push to ecr
```shell
./gradlew jib
```

See build.gradle.kts for details