# Study
## OOP
### enum

- week 3 Weekend Homework
  - Create a class, which contains:
    - static final variable
    - static variable
    - final variable
    - non-static, non-final variable
    - Constructors (no-args, all-args, etc...)
    - instance methods
    - static methods
    - main()
      - you should call all the above constructors and methods
  - Math, BigDecimal, StringBuilder, LocalDate
  - Think about another class -> one to many -> array ???
  - 
  - String Literal pool
  - Integer Byte, Short, Long, Boolean, Character -> Internal Cache (-128 to 127)
  - immutable - Stringbox, class
  - object 本質係一個ball 裝住value
  -public double area() {
        return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.length))
        .doubleValue();  // <----- double use BigDecimal, and use valueOf, at the end use double value
- Static vs non Static Variables and Methods 
   -non static:  if the method for the individual object and instance of that class, 
   or it have to be different of all object, use non static
   - Static: something more of the class level, all objects in the class share the same value, 
      and something should be share with of all the class

- enum
  -當objects有限數 或唔會經常變就用enum ： color, 東南西北，星期一至五，貨幣......

  - enum 係 jvm 會幫你 new object create red 同blue 兩個object
 -enum 唔好用compare to, 只係比較地址
 -enum main用的method, 一定要自己寫，自己定義。只有3個method 可用 name(),= enum name, value() = enum array
 - enum 唔需要Setter
 - enum = static 確保唯一，無人可再new Object
- 
      }