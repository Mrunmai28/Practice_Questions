public class SDA{
    public static void main(String args[]){
        int marks[]={10,20,30,40,50};  //declare and initialize 
       /* for(int i=0;i<5;i++)             //Row represent
         {
         System.out.println(marks[i]);
         } */
         System.out.println("Enhanced For Loop or For each loop");
         for(int x:marks)    //for each loop
         {
             System.out.println(x);    
         }
         
    }
}