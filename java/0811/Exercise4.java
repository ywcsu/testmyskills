public class Exercise4 {
    double money;
    double robotmoney;
    double m1000;
    double m500;
    double m100;
    double m50;
    double m20;
    double m10;
    double r1000;
    double r500;
    double r100;
    double r50;
    double r20;
    double r10;

    public void bank(int money){
        this.money = money;
        m1000=money%=1000;
        m500=(money-(m1000*1000))%500;
        m100=(money-(m1000*1000+m500*500))% 100;
        m50=(money-(m1000*1000+m500*500+m100*100))% 50;
        m20=(money-(m1000*1000+m500*500+m100*100+m50*50))% 20;
        m10=(money-(m1000*1000+m500*500+m100*100+m50*50+m20*20))% 10;
    }
    public void buy(int price){
        
    }
    public void robot(int robotmoney){
        this.robotmoney=robotmoney;
        r1000=robotmoney%=1000;
        r500=(robotmoney-(m1000*1000))%500;
        r100=(robotmoney-(m1000*1000+m500*500))% 100;
        r50=(robotmoney-(m1000*1000+m500*500+m100*100))% 50;
        r20=(robotmoney-(m1000*1000+m500*500+m100*100+m50*50))% 20;
        r10=(robotmoney-(m1000*1000+m500*500+m100*100+m50*50+m20*20))% 10;
    }
    public static void main(String[] args){
        Exercise4 user = new Exercise4();
        user.bank(10000);
        user.robot(5000);
        user.buy(5045);
        System.out.println(user.money);
    }
}
