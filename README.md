# 💰 Bank Management System

## 🏦 Project Overview

The Bank Management System is a full-stack web application that allows users to perform core banking operations such as account creation, login, deposit, withdrawal, transaction tracking, and balance inquiries — all through an interactive web interface.
<br>
This project is built using Spring Boot (Java) for the backend and HTML/CSS/JavaScript for the frontend. The database is hosted on Clever Cloud MySQL, and the project is fully deployed with:

- 🖥️ Backend → Render
- 🌐 Frontend → Netlify
- 🚀 Live Demo
- 🔗 Frontend (Client App): [live here](https://royalbankbysk.netlify.app)
- 🔗 Backend (API Server): [live here](https://bankmanagementsystem-961b.onrender.com)

---

## 🧠 Features

✅ Multi-step signup (3 forms: personal, additional, and account details)<br>
✅ Secure login using card number and PIN<br>
✅ Deposit, Withdraw, Balance, and Mini Statement features<br>
✅ Auto-generated Form Numbers and unique account IDs<br>
✅ Cross-Origin (CORS) enabled for frontend-backend communication<br>
✅ MySQL database integration via JPA and Spring Data Repository<br>
✅ Responsive and elegant frontend design (Royal dark theme)<br>
✅ Hosted backend on Render and frontend on Netlify

---

## 🏗️ Tech Stack

### 🖥️ Backend

- Language: Java 22
- Framework: Spring Boot
- Database: MySQL (Clever Cloud)
- Build Tool: Maven
- Deployment: Render
- IDE: NetBeans 24

<br>

### 💻 Frontend

- Languages: HTML, CSS, JavaScript
- Styling: Custom responsive design with royal blue theme
- Deployment: Netlify

--- 

## 🧩 Project Structure
```
BankManagementSystem/
│
├── bankapp/                     # Spring Boot Backend
│   ├── src/main/java/com/bank/bankapp/
│   │   ├── model/               # Entity classes (Signup, Login, etc.)
│   │   ├── repository/          # JPA repositories
│   │   ├── controller/          # REST controllers
│   │   └── BankappApplication.java
│   ├── pom.xml
│   └── render.yaml              # Render deployment config
│
├── frontend/                    # HTML, CSS, JS Frontend
│   ├── signup1.html
│   ├── signup2.html
│   ├── signup3.html
│   ├── login.html
│   ├── deposit.html
│   ├── withdraw.html
│   ├── balance.html
│   ├── transactions.html
│   ├── pinchange.html
│   ├── statement.html
│   └── style.css
│
└── README.md                    # Project documentation
```

---

## ⚙️ Backend Setup (Local Execution)

To run the backend locally:<br>
Open Command Prompt and navigate to:<br>
```
cd BankManagementSystem\bankapp
```

Run the Spring Boot application:<br>
```
./mvnw spring-boot:run
```

The backend will start at:
```
http://localhost:8081
```
---

## 📸 Screenshots

### Login page:
<img width="1905" height="860" alt="image" src="https://github.com/user-attachments/assets/c097f145-d989-486a-a575-046246590e32" /><br>
### Signup Step1:
<img width="1909" height="861" alt="image" src="https://github.com/user-attachments/assets/8b304e37-2a35-40e1-8141-61b264b59b68" /><br>
### Signup Step2:
<img width="1909" height="862" alt="image" src="https://github.com/user-attachments/assets/1468d373-917e-41e9-a284-48d33dd20123" /><br>
### Signup Step3:
<img width="1909" height="864" alt="image" src="https://github.com/user-attachments/assets/251b9332-7117-4a73-b3f8-84872f6bb322" /><br>
### Transaction:
<img width="1910" height="851" alt="image" src="https://github.com/user-attachments/assets/c1281363-6772-4693-84b5-362545ca1047" />

---

## 💾 Database Configuration

The project uses MySQL (Clever Cloud).
You can connect using:
```
mysql -h bygcdwagelum9ah437ii-mysql.services.clever-cloud.com -u <your-username> -p
```

Database tables include:

- signup1
- signup2
- signup3
- login
- bank (for transactions)
- account_details

---

## 🌍 Deployment Summary

Service :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                    	Platform :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	              Description :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	                                    Status :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
Backend	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                      Render	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;               Spring Boot API connected with MySQL &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	                                                                                                                                                                                                                                                                                      ✅ Live    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
Frontend &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                   	Netlify &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	                   Static website (HTML/CSS/JS)	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		                                                                                                                                                                                                                              ✅ Live     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
Database &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                     Clever Cloud	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                                              MySQL cloud-hosted database  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	                                                                                                                                                                                                                                                           ✅ Connected  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>

---

## 🧰 Key Endpoints
```
Method	Endpoint	Description
POST	/api/signup/step1	          Register step 1 personal details
POST	/api/signup/step2	          Register step 2 additional details
POST	/api/signup/step3	          Register step 3 account details
POST	/api/login	                   Login using card number and PIN
POST	/api/deposit	              Deposit money
POST	/api/withdraw	              Withdraw money
GET	  /api/balance/{formno}	          Check balance
GET	  /api/transactions/{formno}	  View transactions
```

---

## 🏁 Conclusion

This Bank Management System demonstrates end-to-end development — from backend APIs and database connectivity to frontend deployment and hosting. It’s a great learning project for understanding how modern web applications function across full-stack technologies.
