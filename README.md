
# Hotel Management Project

This Content Management System (CMS) is based on the Burj Al Arab, the renowned hotel in Dubai, United Arab Emirates. This hotel management project involves creating a system or software to manage various aspects of a hotel's operations, including reservations, booking leisure activities, guest check-in and check-out, booking travel packages, billing, and other related tasks. The project may also involve integrating with other systems such as online booking platforms, accounting software, and customer relationship management tools to streamline processes and improve efficiency. The goal of a hotel management project is to provide a comprehensive solution that enhances the guest experience, optimizes resource allocation, and increases profitability for the hotel.

# Overview

This project was made in Java. I used the Apache Netbeans IDE to leverage the Java GUI capabilities. The frontend is integrated with a MySQL backend to store the data. This project is based on the Burj Al Arab, the only 7-star (self-proclaimed) hotel in the world. The project consists of five main parts:

### Check-in
It handles the ingress of new customers. It asks for the customer information, room preferences and number of days for stay, and assigns a unique User ID and password to each customer. 

## Activities
Burj Al Arab provides plenty of exciting adventures and fun activities for its guests. The customers can book appointments for various activities organized by the hotel.

## The Terrace
The Burj Al Arab Terrace is a remarkable, one-of-a-kind restaurant, pool, beach and cabana space, offering hotel guests and Burj Al Arab members the finest Arabian hospitality. The customers can book their luxury cabanas for stay at the Terrace, and enjoy exquisite contemporary cuisine, crystal pool access and indulge in thrilling activities such as Jet Skiing, Flyboarding, Kite Surfing etc.

## Tourism
Dubai is world-renowned for its beautiful beaches, record breaking attractions and experiences like no other. The customers can book tailored travel packages across a myriad of popular destinations and enjoy their time with friends and family.

## Check-out
It handles the egress of customers. This sections shows all the bookings, reservations and transactions made by the customer throughout their stay at the Burj Al Arab. It also includes a currency converter for the ease of international visitors.

**Note**: I made this project in my 12th grade for my Informatics Practices class. Hence, it contains few obvious lapses in some aspects like Security, static rates for currency conversion, supposed wait times for booking rooms and Cabanas. This project was mainly focused on the learning of the Java GUI and MySQL fundamentals and learnings. And the knowledge of timers in Java that powered the color animations. And my love for Dubai :)


## Installation

[Download](https://netbeans.apache.org/download/) the latest version of Apache NetBeans IDE

### MySQL Setup

Create a new database "burjalarab"

```bash
  CREATE DATABASE burjalarab;
  USE burjalarab
```
Create the tables

```bash
  CREATE TABLE CHECKIN(USER CHAR(20),PASS CHAR(20),NAME CHAR(20),OCCP INT(2),PHNUM BIGINT(20),ROOMCHAR CHAR(1),DAYS INT(2));

  CREATE TABLE ACTIVITY(USER CHAR(20),PASS CHAR(20),A1 INT(1),A2 INT(1),A3 INT(1),A4 INT(1),A5 INT(1),A6 INT(1),A7 INT(1),A8 INT(1),TOTPRICE FLOAT);

  CREATE TABLE TERRACE(USER CHAR(20),PASS CHAR(20),CABCLASS CHAR(20),HOSCLASS CHAR(20),EXFACIL CHAR(20),HOUR INT(2),CABNO INT(2),SERTAX INT(5),ROYTAX INT(5),EXFACPRICE INT(5),HOSPRICE INT(5),CABPRICE INT(5),TOTPRICE FLOAT);

  CREATE TABLE TOURISM(USER CHAR(20),PASS CHAR(20),CLASS CHAR(50),WORLD CHAR(30),SIGHT CHAR(30),MALL CHAR(30),RESORT CHAR(30),KIDS CHAR(30),SPORTS CHAR(30),PRICE INT(5),WPRICE INT(4),SPRICE INT(4),MPRICE INT(4),RPRICE INT(4),KPRICE INT(4),SOPRICE INT(4));
```

### Running the project
Clone the Project

```bash
  git clone https://github.com/CyberSpyderX/BurjAlArab.git
```

Open the project in the Apache NetBeans IDE

Right-click on the project and click **Run**


## Features

- Appealing UI
- Robust backend design
- Animations
## Demo

### Check-In
![App Screenshot](https://drive.google.com/uc?id=1m3qfDbW_SRYNT28P29OL9NxIAnGDESm2)

### Activities
![App Screenshot](https://drive.google.com/uc?id=1ON5d4ljPSyhS5R1ioRdAqdTch6jZNT8P)


### The Terrace
![App Screenshot](https://drive.google.com/uc?id=1ON5d4ljPSyhS5R1ioRdAqdTch6jZNT8P)

### Tourism
![App Screenshot](https://drive.google.com/uc?id=1POFJmqoKwoTIb-SbOa55fiWtgIWrAd3M)


### Checkout
![App Screenshot](https://drive.google.com/uc?id=1cDx-x5w1ixINebmiP61oVYNFrBeKerf2)