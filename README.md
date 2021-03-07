The project about household appliances store. This project is a kind of application for working and sorting the products of the store. The application is directly connected to the database and has many functions. These functions are designed to work with store data, for example: add product, find the cheapest price and ect.
The application consists of objects :
Main, MyApplication, Irepository, Controller, Product, DataBase and etc.
Сlass “Main” there is where our app starts.
Class “MyApplication” is a class that works directly with the user. Here the user chooses what actions he wants to do.
Class “Irepository” is the class where all the work takes place. This class works directly with the database. 
Class “Controller” it is here that you can find out which responses the user will receive and which functions will start working.
Class “Product” is the main class that stores all product data such as the product id, product price, etc. This class consists of getters and setters, constuctors and toString function.
Class “DataBase” it combines the database and our project itself. Here we enter a link to the database and write its password.
