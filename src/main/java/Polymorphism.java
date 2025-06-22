class Parent{
  public void func(){
    System.out.println("parent class Without parameter");
  }



  public void func(String name){
    System.out.println("Parent class "+" "+name);
  }
}

class Child extends Parent{
  public void func(String name){
    System.out.println("With child class method"+name);
  }
  
}