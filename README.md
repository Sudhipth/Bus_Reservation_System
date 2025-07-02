# 🚌 Bus Reservation System

A **Java + MySQL** based console application for booking bus tickets. The system allows users to view available buses, check seat availability, and make bookings based on date and bus number. It uses **JDBC** for database operations and demonstrates key **CRUD operations**.

---

## 📖 About the Project

This is a simple console-based system built using **Core Java** and **MySQL** to simulate a basic bus ticket booking system. It interacts with the database to fetch bus details and record bookings. Designed with modular classes, it shows how Java handles **database connections, SQL queries, and date input**.

---

## 🔧 Technologies Used

- 💻 Java (JDK 8+)
- 🛢️ MySQL (Database)
- 🔗 JDBC (Java Database Connectivity)
- 🧠 Core Java (OOP Concepts)
- 📦 Eclipse IDE (Recommended)

---

## 📂 Project Structure

Bus_Reservation_System/
├── Bus_Main.java # Main class to run the project
├── DB_Connection.java # DB connection class
├── Bus_table.java # Handles Bus table
├── Booking.java # Takes user input
├── Booking_table.java # Booking logic and DB access
└── README.md # Project info

yaml
Copy
Edit

---

## 📌 Features

- 🚍 Display available buses  
- 👤 Book a seat with date and bus number  
- 📅 Check if a seat is available  
- ✅ Prevent overbooking by comparing capacity  
- 🗃️ CRUD operations on bookings  

---

## 🔄 CRUD Operations Used

| Operation   | Description                                      |
|-------------|--------------------------------------------------|
| **Create**  | Insert a new booking into `booking` table        |
| **Read**    | Display all buses and fetch booked count         |
| **Update**  | (Extendable) Could be added to modify bookings   |
| **Delete**  | (Extendable) Could be added to cancel a booking  |

---

## 🗃️ Database Tables

### `bus`

| id (PK) | ac (0/1) | capacity |
|--------:|---------:|----------|
|   1     |    1     |    30    |
|   2     |    0     |    45    |

### `booking`

| passenger_name | bus_no | travel_date |
|----------------|--------|-------------|
| Sudhipth       |   1    | 2025-10-11  |

---

## ✅ Example Input & Output

```bash
------------------------------------------
Bus No: 1
AC: yes
Capacity: 30
Bus No: 2
AC: no
Capacity: 45
------------------------------------------

Enter 1 to Book and 2 to exit
1
Enter name of passenger: 
Sudhipth
Enter bus no: 
1
Enter date dd-mm-yyyy
11-10-2025
Your booking is confirmed
▶️ How to Run
1. 📥 Clone the Repository
bash
Copy
Edit
git clone https://github.com/Sudhipth/Bus_Reservation_System.git
cd Bus_Reservation_System
2. 🛠️ Setup MySQL
Create a database jdbcdemo

Create the bus and booking tables as shown above

3. 🚀 Run the Application
Open the project in Eclipse

Run Bus_Main.java

📬 Contact
If you have any queries related to this project, feel free to reach out:

📧 vjsudhipth@gmail.com
