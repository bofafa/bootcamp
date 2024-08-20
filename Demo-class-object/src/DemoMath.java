import java.util.Random;

public class DemoMath {

  public static void main(String[] args) {
    
    // min
    System.out.println(Math.min(7, 3));//3
    System.out.println(Math.min(2, 8));//2
    System.out.println(Math.min(5, 5));//5

    //max
    System.out.println(Math.max(7, 3));
    System.out.println(Math.max(2, 8));
    System.out.println(Math.max(5, 5));

    System.out.println("------------fine the max / Min in Arrays------------");
    //Find Max
    int[] arr = new int[] { 3, 6, -1,100,4};
    int max = Integer.MIN_VALUE;
     for (int i = 0; i<arr.length; i++){
      //if (arr[i] > max) max =arr [i];
     max = Math.max(arr[i], max);
     }
   System.out.println(max);//100

    //Find min
     int min = Integer.MAX_VALUE;
     for (int i =0 ; i<arr.length; i++){
      min = Math.min(arr[i], min);
     }
      System.out.println(min); // -1


      System.out.println("-----------ABS sum Arrays------------");
      int[] arr2 = new int[]{3,6,1,400+1000};
      int sum =0;
      for (int i=0 ; i< arr2.length ; i++){
        sum += Math.abs(arr2[i]);
      }
      System.out.println(sum);

      System.out.println("----------sqrt()-----------");
      int x =81;
      System.out.println(Math.sqrt(x)); //9.0

      //Math.pow (double a, double b)
      double result = Math.pow(2.0, 3L);
      System.out.println(result); //8

      //Math.pow (double a, double b)
      result = Math.pow (byte)2, (short)3);
      System.out.println(result);//8


      //math.round ---> nearst integer 
      System.out.println(Math.round(10.4111111)); //10 ( round to integer)
      System.out.println(Math.round(10.4911111)); //10 ( round to integer)
      System.out.println(Math.round(10.5411111)); //11 ( round to integer)


           //math.floor
    System.out.println(Math.floor(3.1)); //3.0
    System.out.println(Math.floor(3.9)); //3.0
    System.out.println(Math.ceil(3.9)); //4.0
    System.out.println(Math.ceil(3.1)); //4.0

    //log.
    System.out.println(Math.log10(1000)); //3;


    System.out.println("----------random and round-----------");
    // random and round
   //0.0 - 1.0
   System.out.println(Math.random());// 0.678768676763
   System.out.println(Math.round(Math.random()*100)); //68

   System.out.println(new Random().nextInt(80)+120); // 120-200
    }

  
}
