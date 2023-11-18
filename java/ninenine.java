public class ninenine {
    public void run(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d * %d = %d",i,j,i*j);
                if (j==9){
                System.out.println("\r");
            }
            }
        }
    }
}
