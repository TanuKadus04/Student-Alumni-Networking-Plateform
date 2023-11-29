#  Student-Alumni-Networking-Plateform

Student-Alumni Networking Platform, a medium to bridge the gap between past, present, and future generations of our esteemed academic community. Our platform is designed to connect students and  graduates, across various fields, fostering a vibrant ecosystem of knowledge sharing, mentorship, and collaboration.

 Our platform is not just a space for networking; it's a thriving community driven by the collective ambition to learn, grow, and succeed together.

 Our project is structured into three different packages namely miniproject, Student, Alumni for easy accessibility of required methods.

## Table of Contents
- [Installation](#installation)
- [Features](#features)
- [Data Structures Implemented](#data-structures-implemented)


## Installation
To install this project, follow these steps:

1.  Clone the repository.
2. Navigate to the project directory.
3. Run `npm install` to install dependencies.

## Features
- User Account Creation (SIGN UP)
- User Account Login (LOG IN)
- [Student Dashboard](#student-dashboard)
- [Alumni Dashboard](#alumni-dashboard)

## Student Dashboard

1. Search and Connect with Alumni.
2. See Your Connections.
3. Send Messages to Your Connections.
4. Update Your Profile.
5. Log Out.

## Alumni Dashboard
1. Update Your Profile.
2. See Your Connections.
3. Send Messages to Your Connections.
4. Log Out.

## Data Structures Implemented
We have thoughtfully selected data structures based on their dynamic nature, suitability, and time complexity:
1. Linked List: Used for dynamically storing student and alumni data, facilitating the creation of accounts, and efficient data management.
2. Graph: Graphs are employed to create and manage connections between students and alumni, similar to professional networking platforms, enabling messaging after connections are established.
3. Hash Map: Hash maps are used to map identity numbers to lists of connections for each user. We prefer hash maps over arrays as the arrays are static in nature, and over arraylists as arraylist allows duplicate keys.
4. Arrays: Identity no of Connections of a user are stored in a String with spaces; then the String is split using the `split()` function into an Array of Strings which is then traversed to print details of connections.
5. Exception handling has been implemented to enhance application robustness.
