# HelpDesk - Help Desk System (Backend)

![HelpWise Logo](https://via.placeholder.com/150) <!-- Adicione aqui o link da imagem do logo do projeto -->
![Java](https://via.placeholder.com/50/007396/FFFFFF?text=Java) <!-- Logo Java -->
![Spring Boot](https://via.placeholder.com/50/6DB33F/FFFFFF?text=SB) <!-- Logo Spring Boot -->
![MySQL](https://via.placeholder.com/50/4479A1/FFFFFF?text=MySQL) <!-- Logo MySQL -->

**HelpWise** is a comprehensive Help Desk backend system aimed at optimizing customer support and ticket management. Built using Java and Spring Boot, this application provides a robust API for handling support tickets efficiently.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features
- **User Roles**: Supports multiple roles including Customers, Attendants, and Admins.
- **Ticket Management**: Users can create, update, and track their support tickets easily.
- **Real-Time Updates**: Immediate updates on ticket status and communications.
- **Secure Access**: Utilizes JWT for authentication and authorization, ensuring secure access to the system.

## Technologies Used
- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Authentication**: JWT
- **Build Tools**: Maven

## Installation

To set up the backend locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/helpwise.git
   cd helpwise/backend
Configure your application.properties with your database details.
Build the application:

```bash
mvn clean install

```
Run the application:
```bash
mvn spring-boot:run
```
API Endpoints
``` bash
Endpoint	Method	Description
/api/tickets	POST	Create a new support ticket.
/api/tickets/{id}	GET	Retrieve ticket details.
/api/tickets/{id}	PUT	Update ticket information.
/api/tickets/{id}	DELETE	Delete a ticket.
```

## Link para o Swagger
- http://localhost:8080/swagger-ui/index.html#/
Contributing

Contributions are welcome! If you have suggestions for improvements or features, please fork the repository and submit a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.