public class Exercise3 {
    
    public static void main(String[] args){
        int[] score={100,90,50,80,80,70,100,90,30,60};
        int total=0;
        for(int i=0;i<=9;i++){
            int temp=score[i];
            total+=score[i];
            if (temp>=90){
                System.out.println(temp + " :優");
            }
            else if (temp>=80){
                System.out.println(temp + " :秀");
            }
            else if(temp>=70){
                System.out.println(temp + " :良");
            }
            else if(temp>=60){
                System.out.println(temp + " :及格");
            }
        }
        System.out.println("total is " + total);
        int average;
        average = total / 9;
        int averageup=0;
        int averagedown=0;

        for(int j = 0;j<=9;j++){
            int a = score[j];
            if (a>average){
                System.out.println(a + ":平均分數以上");
                averageup++;
            }
            else{
                System.out.println(a + ":平均分數以下");
                averagedown++;
            }
        }
        System.out.println("平均分數以上:"+averageup);
        System.out.println("平均分數以下:"+averagedown);
    }
}
