public class Game{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    Adventurer c = new Wizard("Agnes","Zap!",20);
    Adventurer d = new Wizard("Spelliamus","My name?",77);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    a.attack(b);
    b.attack(a);
    c.attack(d);
    d.attack(b);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    a.specialAttack(b);
    b.specialAttack(a);
    c.specialAttack(b);
    d.specialAttack(a);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    d.specialAttack(d);
    System.out.println(d+" ("+d.getHP()+"HP)");



    }

}
