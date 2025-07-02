# 🚌 Bus Reservation System

A simple **Java + MySQL** console-based Bus Reservation System that allows users to view bus details and book tickets with date and bus number. It performs **CRUD operations** using JDBC.

---

## 🔧 Technologies Used

- 💻 Java (JDK 8+)
- 🛢️ MySQL (Database)
- 🔗 JDBC (Java Database Connectivity)
- 🧠 Core Java OOP Concepts
- 📦 Eclipse IDE (Recommended)

---

## 📂 Project Structure

Bus_Reservation_System/ 
├── Bus_Main.java 
├── DB_Connection.java 
├── Bus_table.java 
├── Booking.java 
├── Booking_table.java 
└── README.md 


---

## 📌 Features

- 🚍 View available buses
- 👤 Book a seat (with date)
- 📅 Check seat availability
- ✅ CRUD operations on booking
- ❌ Prevent overbooking

---

## 🗃️ Database Tables

### `bus`
| id | ac (0/1) | capacity |
|----|----------|----------|
| 1  | 1        | 30       |

### `booking`
| passenger_name | bus_no | travel_date |
|----------------|--------|-------------|

---

## ▶️ How to Run

### 1. 📥 Clone the Repository
```bash
git clone https://github.com/Sudhipth/Bus_Reservation_System.git
cd Bus_Reservation_System


