package OOPselfTest;

public class User {
  
  private String name;
  private String membership;
  private String age;

  public User (String name, String membership, String age){
    this.name = name;
    this.membership= membership;
    this.age = age;
  }

  public User (){
   
  }
    public String getName(){
      return this.name;
    }
     
    public void setName(String name){
       this.name = name;
    }
       public String getMembership(){
       return this.membership;
       }
       public void setMembership(String membership){
        this.membership = membership;
       }
    public String getAge(){
      return this.age;
          }
        public void setAge (String age){
          this.age = age;
        }
   }

