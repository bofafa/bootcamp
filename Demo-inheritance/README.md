##pass by reference

## week 4
 - for "extends" - 一個仔 跟一個媽
 - Attributes in parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"

 - - Constructors in Parent  <---- 要Call super 嚟用 
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super"
  
 - - Methods in Parent <-- child 一定要用 mother method 但可以ovrride
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

- No matter you are doing individaul class or extend, you should override the following.....
   - 1. equals()
   - 2. hashCodee()
   - 3. toString()
  
- if you do not overwrite the above 3 method, your class by default inherit Parent's one
  - by defult, all class has a super Parent "Object.class"
  - "Object.class" make use of "Object address" to perform the above 3 methods.

- Polymorphism
   - Compile time
    - the scope of the "reference"is determined by the type of reference
    - when you re-assign the object to a lower level reference, the object behavior maybe different.
- Run time   
     -methoed implementation belongs to object itself (but not the reference type) 
     
     ##Why do we need Inheritance + Polymorphism?

abstract class type can be used in method parameter (i.e. Shape[] -> area)
abstract class type can be an attribute of a class (i.e. Rank is an attribute of Card)