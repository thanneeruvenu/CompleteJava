**Java 8 Features** 
-------------------
1. Lambda Expressions
2. functional interfaces
3. default methods in interface
4. static methods in interface
5. pre define functional interfaces
   * predicate 
   * consumer
   * Function
6. **::** operator (method reference/constructor reference)
7. streams API
8. Date and Time API (joda.org) -- joda API


**Lambda Experssions** 
---------------------
+ what is Lambda expression? 
    + it is an anonymous function, which doesn't have name, modifiers and return type.
 + why?
   + which makes enable of parallel process and functional programming.
   + to make more readable, maintained and consigned code.
   + to use API's more effectively and easily  
  

 **Example :**
 ---------------
 **ex 1:** simple method which will print some output which doesn't have any args

```java
 public void m() {
 System.out.println("Hello");
 }
```
converting the above function to lambda. As per the rule name , modifiers, return type should be elimented.

```java
() -> { System.out.println("Hello"); }
````
if body has only one statement then currly brases are not required, so {} should be elimented.

```java
() -> System.out.println("Hello");
```





 
 
 
 
 
 
 

