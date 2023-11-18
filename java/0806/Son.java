public class Son extends Father{
    String name;
    int age;

    public void play(){
        System.out.println("playing");
    }

    public Son(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    public static void main(String[] args){
        Son son = new Son("alex", 34);
        son.play();
        son.watch();
        System.out.printf(son.name + ":" + son.age);
    }
}