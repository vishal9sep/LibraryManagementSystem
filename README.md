# LibraryManagementSystem

Library Management System to Borrow and Return books from library.

## API Reference

#### Register User

```http
  POST /users/addUser
```

#### Borrow a book

```http
  GET /users/lend/{userId}?{bookId}
```

#### Return Book

```http
  GET /users/return/{userId}?{bookId}
```






## Deployment

To deploy this project run on Postman

```bash
   http://localhost:8080/
```


## Tech Stack


    -> Java
    -> Spring
    -> Spring Boot
    -> Spring Data JPA
    -> Hibernate
    -> MySQL
    -> Postman
