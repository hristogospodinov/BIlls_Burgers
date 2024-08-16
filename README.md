The purpose of this challenge is to showcase the usage of all OOP principles in a finalized project structure.

  **Bill's Burgers**

Program to create hamburger meals, that consist of 3 items - 1 hamburger, 1 drink and 1 side dish.

The basic meal order is the most common one - it won't take any arguments. Within it will be included a **regular** burger, **small** coke and fries.

Each of the three meal components (burger/drink/side) have the following attributes:

*Drink - Name, type, size and price (different for each size)

*Side - Name, type, size and price

*Burger - Name, type, price and up to 3 toppings


The burger constructor should include type and price.
Extra toppings are added and priced.

Composition - used in the MealOrder class - it will hold the 3 different components - burger, drink and side, as Item pbjects.
Inheritance - used for the Item and Burger classes relationships, meaning Burger is an Item
Polymorphism - the base price will need to be adjusted/overriden depending on the Item type or size
Encapsulation - MealOrder will hide some of the implementation details for Item and its subclasses from the calling code 

Class diagram

![Class diagram (1)](https://github.com/user-attachments/assets/3bd657ca-fbf0-4aed-9f57-a55013309d15)


*Bonus - Deluxe Burger Bonus - it has a set price on the burger and can have any type of extra toppings, up to a total of 5 toppings.

