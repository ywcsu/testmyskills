public class Exercise2 {
    
    public static void main(String[] args){
        int count=0;
        System.out.println("閏年:");
        for(int i = 2000;i<2101;i++){
            if (count%5==0){
                System.out.println();
            }
            
            if(i%4==0){
                if(i%100!=0){
                    System.out.print(i+" ");
                    count++;
                }
                else if(i%400==0){
                    System.out.print(i+" ");
                    count++;
                }
            }
            
        }
        
    }
}
