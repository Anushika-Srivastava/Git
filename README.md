# Git
Basic Programs
(Inheirtance)

Program 1: Shapes.java
Describe abstract class called Shape which has three subclasses say Triangle,Rectangle,Circle. Define one method area() in the abstract class and override this area() in these three subclasses to calculate for specific object i.e. area() of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle.

Pogram 2: Teacher.java
Create a Base Class Person and two derived class as student and teacher with their constructor and method.
The inheritance hierarchy would appear as follows:
                        Person
                        /    \
                   Student  Teacher
1. Add methods to “set” and “get” the instance variables in the Person class. These would consist of: getName, getAge, getGender, setName,  setAge, and setGender.
2. Add methods to “set” and “get” the instance variables in the Student class. These would consist of: getIdNum, getGPA, setIdNum, and setGPA.
3. Write a Teacher class that extends the parent class Person.
4. Write a constructor for the Teacher class. The constructor will use five parameters to initialize myName, myAge, myGender, subject, and salary.  Use the super reference to use the constructor in the Person superclass to initialize the inherited values.
