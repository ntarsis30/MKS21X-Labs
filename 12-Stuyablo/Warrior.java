public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18,40);
    }

    public Warrior(String name, String warcry, int rage, int rageMax){
      super(name,10+(int)(Math.random()*30),45);
      setWarcry(warcry);
      setRage(rage);
      this.rageMax = rageMax;
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getSpecial() + 1);
  	    return(this +
            " attacked " + other + " for " +
            damage + " damage!");
    }

    public String specialAttack(Damageable other){
	     if(getSpecial() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            setRage(getSpecial() - 10);
            return(this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+ warcry);
	    }else{
          attack(other);
			    return("Not enough rage! ");
	    }
    }

    //get methods


    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }
    
    private int rageMax;
    public String getSpecialName(){
      return "Rage";
    }
    public int getSpecialMax(){
      return rageMax;
    }
    public int getSpecial(){
      return rage;
    }
  


}
