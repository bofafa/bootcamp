
// !!! Type K can be same as Type V

import java.util.LinkedList;
import java.util.List;

public class SuperMap<K, V> {
  private List<SuperEntry<K, V>> entries;

  public SuperMap() {
    this.entries = new LinkedList<>();
  }

  public void put (K key, V value){
    // if not duplicate
    if (this.getEntry (key) == null){
      this.entries.add(new SuperEntry<>(key, value));
      return;
    }
    this.getEntry(key).setValue(value);

    }
  



  public SuperEntry<K, V> getEntry(K key) {
    // if not found, return null
    if (key == null) 
    return null;
    for( SuperEntry< K, V> entry : this.entries) {
      if(key.equals(entry.getKey()))
      return entry;
    }
    return null;
  }

  public V get (K key){
    SuperEntry<K,V> entry = this.getEntry(key);
    return entry == null ? null : entry.getValue();
  }

   public int size(){
     return this.entries.size();
   }

    //this.entries.add(new SuperEntry<>(key, value));

    public static void main(String[] args) {
      SuperMap<String, String> nameMap = new SuperMap<>();
      nameMap.put("john","apple");
      nameMap.put("vincent", "orange");
      System.out.println(nameMap.get("john"));
      System.out.println(nameMap.size());
    }
  }



