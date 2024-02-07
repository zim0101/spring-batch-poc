## Spring Batch POC
In a Spring Batch proof-of-concept (POC), the objective is to retrieve user information from a CSV file and efficiently insert it into a database in manageable chunks 

# Project Structure

```
├── java
│   └── com
│       └── zim0101
│           └── springbatchpoc
│               ├── config
│               ├── controller
│               │   └── JobController.java
│               ├── job
│               │   └── import_user
│               │       ├── ImportUserBatchConfig.java
│               │       ├── UserItemProcessor.java
│               │       └── UserItemWriter.java
│               ├── model
│               │   └── User.java
│               ├── repository
│               │   └── UserRepository.java
│               └── SpringBatchPocApplication.java
└── resources
    ├── application.properties
    ├── csv_imports
    │   └── data.csv
    ├── static
    └── templates
        └── job.html
```

