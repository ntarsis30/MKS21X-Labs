public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

     return value+other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value*other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    if(other.getValue() == 0){
        return 0;
    }
    return value/other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value-other.getValue();
  }

  public int compareTo(RealNumber other){
    if((value-other.getValue() < 1) && (value-other.getValue() > 0)){
        return (int) (getValue()-other.getValue())+1; 
    }

    if((value-other.getValue() > -1) && (value-other.getValue() < 0)) {
        return (int) (value-other.getValue())-1; 
    }
    return (int) (value-other.getValue());
  }

  public boolean equals(RealNumber other){
    return value == other.getValue();
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
}