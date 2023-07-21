# Read Me First

- Execute the test (Docker is needed)
```
./gradlew clean build
```

or

- Create Docker DB PostgreSQL 
```
  docker run -d --name template_postgres -e POSTGRES_USER=templateUser -e POSTGRES_PASSWORD=templatePassword -e POSTGRES_DB=template -p 5435:5432  --restart=always postgres
```
- Start the application with 
```
./gradlew bootRun
```

