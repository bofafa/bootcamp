### Data Structure - List, Queue, Set
  ### Array can be interface or for loop
  -用ArrayList ，已夠用
 

java is
  -左邊complile time , 右邊 runtime time
  - 左邊what to do, 右邊 how to do
    -java最底層只有兩種 array , linkedlist 
    - java memory 係 runtime 完成
 
  java 來來去去都係3樣
- "add" use boolean to check
- "remove" return remove items, to check if the item remove
- "search" seach something, return something, 
      


  "Collection" 有 3 列： List，Queue，Se （ 有樹圖）
  - List 有order ，linkedlist 有排隊但storage 唔係放一齊
  - Set 無order, object can not duplicated
  - Qeuee 無order ,只有頭尾
  - Map not belong to "collection"  無order, map key can not duplicated
  - -  - For-each,  正常右手邊放Array

  - List： 正常用ArrayList , 跟住先LinkedList
     -LinkedList可用 list & Queue Method
    -  CharSequence
  -Queue, 先到先得的系統，for排隊用及 一定需要有公平時候用 如 audit, 極致時先用
   -做完個task 就走，唔會留定
   - if you need to use loop, you should not use Queue
   - Priority Queue 同 comparitor 有關係, .get 搵 頭一粒Array

 - HashSet, 無次序地store array, object can not duplicated
     -hashset , object value無重複，
       strings = new HashSet<>();

 - HashMap, 用key for searching,
     - HashMap.get() by key ->  arraylist for loop list, if value = key, return the object
     -  HaspMap example: Map <Integer, String> map = new HashMap<>() <-- 左邊key，右手邊value 
     -  
        class： Person1，HKID，DemoHashMAP
  -  for read, not for write, 唔會點remove, 通常remove by key.
  
    -map for each 放Entry. call entry, need 要call Map.entry
   
   - java memory 路程
     Mege Srot
    O(1) = 
    O(n) = loop
    O(n2) =loop inside for loop
