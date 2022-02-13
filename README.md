# Sample of Spring for GraphQL

## Official doc

https://docs.spring.io/spring-graphql/docs/1.0.0-M5/reference/html/

## Schema

Please check src/main/kotlin/resources/graphql/schema.gqls

## How to run

```bash
$ ./gradlew bootRun

$ curl -v -H "Content-Type: application/json" -d "{\"query\": \"{\n  getUserSummary(userId: 2) {\n    userName\n    userId\n  }\n}\"}"  http://localhost:8080/graphql
```

To test the queries, you can also visit GraphiQL page by typing http://localhost:8080/graphiql in your browser.