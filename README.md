
# Spring Boot Application for User Management and Real-Time Stock Market Data

This Spring Boot application integrates MySQL for user management and Firebase for storing live stock market data. The application provides basic CRUD operations for managing users and displays real-time stock market data with updates on a web page.

## Features

- **User Management**: 
  - Create, Read, Update, and Delete user records using MySQL as the database.
  - CRUD API endpoints:
    - `POST /users`: Create a new user.
    - `GET /users`: Retrieve all users.
    - `PUT /users/{id}`: Update user details.
    - `DELETE /users/{id}`: Delete a user.

- **Stock Market Data Integration**: 
  - Fetch live stock prices for at least 20 stocks using a public WebSocket API (e.g., Upstocks).
  - Real-time stock data stored in Firebase Realtime Database.
  - On data update, historical stock data is moved to a history section in Firebase.

- **Real-Time Display**: 
  - Basic HTML frontend to display the stock data in a table with columns: Stock Symbol, Current Price, Open, Close, High, Low, and Percentage Increase/Decrease.
  - Stock prices are updated in real-time using WebSockets or polling.

## Prerequisites

- JDK 11 or higher
- Maven 3.x
- MySQL 5.x or higher
- Firebase Account and Realtime Database

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/stock-market-user-management.git
   cd stock-market-user-management
   ```

2. Set up MySQL:
   - Create a database for the application (e.g., `user_management`).
   - Add your database connection credentials in `src/main/resources/application.properties`:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/user_management
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. Set up Firebase:
   - Go to the [Firebase Console](https://console.firebase.google.com/), create a new project, and configure Firebase Realtime Database.
   - Obtain the Firebase SDK configuration file (`firebase-config.json`) and place it in the `src/main/resources/` folder.
   - Add Firebase dependencies to your `pom.xml`.

4. Build and run the application:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. Open your browser and go to `http://localhost:8080` to access the frontend.

## API Endpoints

### User Management Endpoints:
- **POST /users**: Create a new user.
  - Request body:
    ```json
    {
      "name": "John Doe",
      "email": "john.doe@example.com",
      "password": "password123"
    }
    ```

- **GET /users**: Retrieve all users.

- **PUT /users/{id}**: Update user details.
  - Request body:
    ```json
    {
      "name": "John Doe Updated",
      "email": "john.doe.updated@example.com",
      "password": "newpassword123"
    }
    ```

- **DELETE /users/{id}**: Delete a user.

### Stock Market Data Integration:
- Real-time stock prices are fetched using WebSocket integration (e.g., Upstocks).
- The stock data is stored in Firebase Realtime Database and is updated in real-time.

## Technologies Used

- **Backend**: Spring Boot, Java, MySQL
- **Frontend**: HTML, JavaScript, WebSockets
- **Database**: MySQL, Firebase Realtime Database
- **APIs**: WebSocket API for stock market data (Upstocks/Alpaca/Alpha Vantage)

  ## Pictures:- 

![Screenshot (11)](https://github.com/user-attachments/assets/b022eca1-2d7a-408b-a1c4-c8a0ea6b4996)


![Screenshot (12)](https://github.com/user-attachments/assets/f6c4930e-d7b3-426e-a674-21225b372769)


## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## Contact
For any questions or issues, please reach out to:
- **Author:** Abhishek Hanmant Ekal
- **Email:** ekalabhishek4@gmail.com
- **Phone:** +91-7219144791



