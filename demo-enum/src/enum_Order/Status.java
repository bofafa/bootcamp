package enum_Order;
public enum Status {
  PAID(1),
  READY_TO_SHIP(2), 
  SHIPPING(3), 
  DELIVRED(4),
   ;
  
   //attribute design, easy to find the enum
   //1.easier to find someting
   private static int nextvalue = 0;

   private int value;

   private Status (int value){
    this.value = value;
   }

    public int getValue(){
      return this.value;
    }

    public Status get(int value){
      for (Status status : Status.values()){
            if (value == status.getValue())
            return status;

      }
      return null;// throw later
       }

       public Status next(){
        return this.get(this.value +1);
       }
    public static void main(String[] args) {
  
 }

    }

