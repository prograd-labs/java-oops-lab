Consider a case, where you have to create an employee of the fields given below : 

- Name
- Age
- Salary

One way to implement the above case is by simply creating a class named Employee and adding the 
above attributes to that class. 
You can try implementing the above approach under ~ implementation/without-oops/EmployeeTwo.java file.

***NOTE: File structure is already been created for you - so donot change that - just implement the class.***

<details>
  <summary>Hint 1</summary>
  Simply create three variables of either default or public type inside your EmployeeTwo.java class
  For eg:

  ```java
  int age;

  ```
  
</details>

<details>
  <summary>Hint 2</summary>
  Once you have already declared the respective variables, then you can create an object of EmployeeTwo class, inside MainTwo.java class. From this object, you can assign and print the values.

  ```java

  EmployeeTwo employeeTwo = new EmployeeTwo();
  employeeTwo.age = 22;
  System.out.print(employeeTwo.age)

  ```
  
</details>

The problem with the above approach, is that ~ the assignment of the variables are not restricted, i.e. - the user can actually provide with any value - be it positive or negative. For the above approach, everything works. Which in practical sense is not correct, as we cannot have a negative value of age. You can think of making those fields as private as well. But if you do so - then you won't be able to access them in the Main.java file.

So one good approach in order to solve such kind of issue is through the concept known as Encapsulation.

Encapsulation: it is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit.

So, the idea is quite simple. You create the variables - but this time of private type. This will ensure that no other file is able to access these variables ***directly***. 
But because we want to assign some value to these variables -- So for this we can assign values to variables indirectly. This way we can actually make sure what type of values are acceptable and what type of values are not acceptable -- according to our requirement.
The way we assign values to our fields indirectly -- is through getters and setters or by a constructor. This process is known as encapsulatation.

You can try the above approach under ~ implementation/with-oops/EmployeeOne.java file.


***NOTE: File structure is already been created for you - so donot change that - just implement the class.***

<details>
  <summary>Hint 1</summary>
  Simply create three variables of private type inside your EmployeeOne.java class
  For eg:

  ```java
  private int age;

  ```
  
</details>

<details>
  <summary>Hint 2</summary>
  Once you have already declared the respective variables, then you can create 2 methods for each variable ~ for eg: for name variable we can create --> 

  ```java

  public void setName(String name){
    this.name = name;
  }

  public void getName(){
    return this.age;
  }

  ```
</details>

<details>
<summary>Hint 3</summary>
    Once all the methods are created, then you can simply call those methods inside your MainOne.java class.

</details>

The advantage of the above approach is that, now you can add constraints to your methods, in such a way that ensures that you are not giving any invalid value to any field.
So, now try giving a negative value to the age field, and try handling this situation.