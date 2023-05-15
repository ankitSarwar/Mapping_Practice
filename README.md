<h1 align="center"> Mapping_Practice </h1>

* Tech stack used: Spring Boot, Hibernate, MySQL, OOPs, Postman, Swagger, and Java
>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

* Implemented CRUD operations with data validation, MySQL database configuration, 
Swagger integration, authentication and established table relationships.
This project is a portal that handles different types of relationships (one-to-one, one-to-many, many-to-one, and many-to-many) between various entities. It provides CRUD (Create, Read, Update, Delete) operations for each model, allowing you to manage the data effectively.

>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.


## Models
The portal includes the following models:

>### Student
- ID: The unique identifier for the student.
- name: The name of the student.
- age: The age of the student.
- phoneNumber: The phone number of the student.
- branch: The branch of study for the student.
- department: The department to which the student belongs.

### Relationships
- address: One-to-one relationship with the Address model.

>### Laptop
- ID: The unique identifier for the laptop.
- name: The name of the laptop.
- brand: The brand of the laptop.
- price: The price of the laptop.
### Relationships
- student: One-to-one relationship with the Student model.

>### Course
- ID: The unique identifier for the course.
- title: The title of the course.
- description: The description of the course.
- duration: The duration of the course.
### Relationships
- studentList: Many-to-many relationship with the Student model.
 
>### Book
- ID: The unique identifier for the book.
- title: The title of the book.
- author: The author of the book.
- description: The description of the book.
- price: The price of the book.

### Relationships
- student: Many-to-one relationship with the Student model.
- 
>### Address
- landmark: The landmark of the address.
- zipcode: The ZIP code of the address.
- district: The district of the address.
- state: The state of the address.
- country: The country of the address.
- 
>### CRUD Operations && Controllers and APIs
The portal provides the following CRUD operations for each model:

>### Student
- Create a new student: POST /students/add
- Get all students: GET /students/getAll
- Get a student by ID: GET /students/{ID}
- Update a student: PUT /students/update
- Delete a student: DELETE /students/{ID}
>### Laptop
- Create a new laptop: POST /laptops/add
- Get all laptops: GET /laptops/getAll
- Get a laptop by ID: GET /laptops/{ID}
- Update a laptop: PUT /laptops/update
- Delete a laptop: DELETE /laptops/{ID}
>### Course
- Create a new course: POST /courses/add
- Get all courses: GET /courses/getAll
- Get a course by ID: GET /courses/{ID}
- Update a course: PUT /courses/update
- Delete a course: DELETE /courses/{ID}
>### Book
- Create a new book: POST /books/add
- Get all books: GET /books/getAll
- Get a book by ID: GET /books/{ID}
- Update a book: PUT /books/update
- Delete a book: DELETE /books/{ID}
## Address
- Create a new address: POST /addresses/add
- Get all addresses: GET /addresses/getAll
- Get an address by ID: GET /addresses/{ID}
- Update an address: PUT /addresses/update
- Delete an address: DELETE /addresses/{ID}
