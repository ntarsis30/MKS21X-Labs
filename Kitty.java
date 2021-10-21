public class Kitty {

  //Three fields (instance variables):
  private String name;
  private int age;

  //One constructor:
  public Kitty(String startName, int startAge) {
      name = startName;
      age = startAge;
  }
  public Kitty(){
    name = "Mittens";
    age = 2;
  }


  // three accessor methods
  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }

  // four mutator methods
  public void setName(String newValue) {
      name = newValue;
  }

  public void setAge(int newValue) {
      age = newValue;
  }
  public void makeOlder() {
      age++;
  }
  public void changeName(String updateName) {
      name = updateName;
  }



}

