class Employee{
  private String name;
  private int age;

  //in encapsulation we use getter and setter method to access the private varivale
  public void setName(String name){
    this.name  =name;
    
  }
  public String getName(){
    return name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
}
