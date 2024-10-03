
### Stream
 似collection, 但同collection 無關係
 新的class 形容個list

Stream 一定要跟Optional!!!!Optional只會用嚟做return type
 Optional == checked exception

 stream .boxed .collect
 Optional , can not new
  
用Optional persent a list：
   Optional <Integer> result = Arrays.stream(arr2).boxed()
   .filter(e -> e>10)
   .findAny();   // if any

   if(result.isPresent()){
    System.out.println(result.get());
   }else{
    System.out.println("not found");
   }

 how to resolve Option of value, if no volue 包底
 optional 1. .ispresent()  -> check is null?  -> get()
          1.  .ifpresent() 
          2.  ofElse() 
          3.  ofElseThrow ()