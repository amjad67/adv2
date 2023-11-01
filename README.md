# adv2
This Java project is designed to manage a user structure, including Directors, Managers, and Staff. The project accomplishes this by defining classes for each user type and utilizes a fake database for data storage and retrieval. Additionally, the code includes a report generation component that allows users to generate reports on staff members and budget calculations.

##Classes Structure

1- User: The base class that encapsulates common user attributes such as ID, name, age, hourly rate, and total hours worked.

2- Director: A class that extends the User class and maintains a list of associated Managers. Directors are responsible for overseeing multiple Managers.

3- Manager: Also extending the User class, Managers have a list of associated Staff members. Managers are in charge of supervising Staff.

 4- Staff: Represents individual Staff members and inherits from the User class.

 5- Database: A "fake" database class that stores user data using two maps: one by user ID and another by user name. Users are added to and retrieved from this database.

 6- Reports: A utility class responsible for generating two types of reports: staff lists and budget reports. These reports are generated based on the type of user, whether Director or Manager.


##Class Diagram

Here's a class diagram illustrating the relationships between the classes in the code:

![Class Diagram]("                                 ")
![Class diagram (1)](https://github.com/amjad67/adv2/assets/80590854/2a9c630c-ecec-44fa-9273-2c281ccb6116)

This class diagram illustrates the class hierarchy and relationships between the User, Director, Manager, and Staff classes. The Director class has a list of Managers, and the Manager class has a list of Staff. The User class contains common user attributes.
