**Bank Accounts (Java Console app)**

Here we tried to learn Object Oriented Programming with the help of BankAccounts example.
Through BankAccounts example we are exploring different OOP topics like
	- Encapsulation
	- Abstraction
	- Inheritance
	- Polymorphism
			-Method Overriding
			-Method Overloading (Pending here)
		- Dynamic Polymorphism
		- static Polymorphism(Pending here)
	- super()
	- constructor() and constructor() overloading
	- Data Hiding

------------


**BaseLine Setup**
  1. Fork the project master.
  2. Clone the forked repo: $ git clone https://github.com/sakhidamaulik/BankAccounts.git
  3. cd into the dir create:d $ cd BankAccounts
  
**Project Structure**
  There are total **four** classes described as below
**   1. Account**
        	**Responsibility: **
- Abstract Class (Base Class)
- Two abstract methods: deposit and withdraw to perform banks basic operation
- One variable required to maintain "balance" to retrive balance and print balance
- printBalance method
  
  
  **2. CurrentAccount extends Account**
  **Responsibility:**
  - Constructor to set initial balance of the user, we are keeping 500 min balance required
  - As it extending Account, we have to implementing deposit and withdraw methods
-   If the user deposit > 100000 than throw exception of taking a permission from manager
  - if the user tries to withdraw money grater than existing amount, we have to throw an exception
-   Also we are maintaing min 500 balance.

**  3. SavingAccount extends Account**
**  Responsibility:**
-   Constructor to set initial balance of the user, we are keeping 500 min balance required
-   As it extending Account, we have to implementing deposit and withdraw methods
-   If the user deposit > 200000 than throw exception of taking a permission from manager
-   if the user tries to withdraw money grater than existing amount, we have to throw an exception for that
-   Also we are maintaing min 500 balance.

**4. PremiumSavingAccount extends SavingAccount**
  **Responsibility:**
-   Inside constructor we have to call super(balance) as we have only parameteaized constructor
-   If the user deposit > 500000 than throw exception of taking a permission from manager
-   if the user tries to withdraw money grater than existing amount, we have to throw an exception for that
-   No minimum balance is required


------------


**TODO**
	**PremiumSavingAccount**
- For the premium saving account customer we have to add an interest on the existing balance and so we have to calculate the formula for it

**Fell Free to fork and add new features**



