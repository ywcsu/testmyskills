public class Dog {
//public private ,設計模式，開閉原則
  String name;
  double age;
  String colour;
  public static final int LEGS = 4;

  //構造函數
  public Dog(String colour,double age,String name){
    this.colour=colour;
    this.age=age;
    this.name=name;
  }

  public void sleeping(){
    System.out.println("sleeping");
  }

  public void feeding(String food){
    System.out.println("Eat: "+ food);
  }

  public static void main(String[] args){
    Dog dog = new  Dog("blue", 5, "al");
    dog.sleeping();
    dog.feeding("bread");
    System.out.println(LEGS);
  }
}