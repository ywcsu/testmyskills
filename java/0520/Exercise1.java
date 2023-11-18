public class Exercise1{
    int[] test = {20,31,15,17,30};
    int temp;
    public void u1(){
        int[] name=test;
        for(int j=1;j<5;j++){
            for(int i=1;i<4;i++){
                if(name[i]>name[i+1]){
                    temp = name[i];
                    name[i]=name[i+1];
                    name[i+1]=temp;
                }
                if(name[i]<name[i-1]){
                    temp = name[i-1];
                    name[i-1]=name[i];
                    name[i]=temp;
                }         
            }
        }
        for (int k=0;k<5;k++){
            System.out.println(name[k]);
        }
    }

    public void u2(){
        int[] a=test;
        for(int j=1;j<5;j++){
            for(int i=1;i<4;i++){
                if(a[i]>a[i-1]){
                    temp = a[i-1];
                    a[i-1]=a[i];
                    a[i]=temp;
                }
                if(a[i]<a[i+1]){
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }         
            }
        }
        for (int k=0;k<5;k++){
            System.out.println(a[k]);
        }
    }
    public static void main (String[] args){
        Exercise1 user = new Exercise1();
        user.u1();       
        System.out.println();
        user.u2();
    }
}