public class Wizard extends Adventurer {
    private int wisdom;
    private String incantation;

    public Wizard(){
	     this("Alphonse");
    }

    public Wizard(String name){
	     this(name,"Wingardium Leviosa!!", 20, 30);
    }

    public Wizard(String name, String incantation, int wisdom, int wisdomMax){
      super(name,10+(int)(Math.random()*30),50);
      setincantation(incantation);
      setwisdom(wisdom);
      this.wisdomMax = wisdomMax;
    }

    //Wizard methods

    public String attack(Damageable other){
    	int damage = (int)(Math.random()*7)+1;
  	    other.applyDamage(damage);
  	    setwisdom(getSpecial() + 1);
  	    return (this + " attacked " + other + " for " + damage + " damage!");
    }

    public String specialAttack(Damageable other){
	     if(getSpecial() >= 10){
  	        int damage = (int)(Math.random()*15)+5;
            other.applyDamage(damage);
            setwisdom(getSpecial() - 2);
            return (this + " fires a spell at " + other + " for " + damage + " damage! " + incantation);
	    }else{
        attack(other);
			  return("Not enough wisdom! ");
	    }
    }

    //get methods

    public int getSpecial(){
	     return wisdom;
    }

    //set methods
    public void setwisdom(int r){
	     this.wisdom = r;
    }

    public void setincantation(String incantation){
	     this.incantation = incantation;
    }
    private int wisdomMax;
    public String getSpecialName(){
      return "Spell";
    }
    public int getSpecialMax(){
      return wisdomMax;
    }


}
