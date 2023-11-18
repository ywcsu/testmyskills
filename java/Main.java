public class Main {
    
    public static void main(String[] args){ //接口編程
        
        //Dog dog = new Dog("blue", 43,"Sb");
        
        //System.out.println(dog.colour + "\n" +dog.age + "\n" +dog.name);

        Son son = new Son();
        son.walking();
        son.play();

        Dog dog = new Dog("yellow",53,"alex");
        dog.sleeping();
        dog.feeding("carrot");

        ninenine a = new ninenine();
        a.run();
    }
}
