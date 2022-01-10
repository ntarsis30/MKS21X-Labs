public class Wizard extends Adventurer {
    private int wisdom;
    private String incantation;

    public Wizard(){
	     this("Alphonse");
    }

    public Wizard(String name){
	     this(name,"Wingardium Leviosa!!", 20);
    }

    public Wizard(String name, String incantation, int wisdom){
      super(name,30+(int)(Math.random()*10));
      setincantation(incantation);
      setwisdom(wisdom);
    }

    //Wizard methods

    public void attack(Damageable other){
    	int damage = (int)(Math.random()*7)+1;
  	    other.applyDamage(damage);
  	    setwisdom(getwisdom() + 1);
  	    System.out.println(this + " attacked " + other + " for " + damage + " damage!");
    }

    public void specialAttack(Damageable other){
	     if(getwisdom() >= 10){
  	        int damage = (int)(Math.random()*15)+5;
            other.applyDamage(damage);
            System.out.println(this + " fires a spell at " + other + " for " + damage + " damage! " + incantation);
            setwisdom(getwisdom() - 2);
	    }else{
			System.out.println("Not enough wisdom! ");
            attack(other);
	    }
    }

    //get methods

    public int getwisdom(){
	     return wisdom;
    }

    //set methods
    public void setwisdom(int r){
	     this.wisdom = r;
    }

    public void setincantation(String incantation){
	     this.incantation = incantation;
    }


}
