public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    RealNumber rat_n = new RealNumber(numerator);
    RealNumber rat_d = new RealNumber(denominator);
    return rat_n.divide(rat_d);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator==other.numerator && denominator==other.denominator;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator+"/"+denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b){
    if (b==0){
        return a;
    }
    else{
        return gcd(b,a%b);
    }
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  public void reduce(){
    numerator/=gcd(numerator,denominator);
    denominator/=gcd(numerator,denominator);



  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int Nume = numerator*other.numerator;
    int Deno = denominator*other.denominator;
    return new RationalNumber(Nume,Deno);
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int Nume = numerator*other.denominator;
    int Deno = denominator*other.numerator;
    return new RationalNumber(Nume,Deno);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    //gcd(a,b)*lcm(a,b)=a*b
    int Deno = (denominator*other.denominator)/(gcd(denominator,other.denominator));
    int Nume = numerator*(Deno/denominator)+other.numerator*(Deno/other.denominator);
    return new RationalNumber(Nume,Deno);

  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int Deno = (denominator*other.denominator)/(gcd(denominator,other.denominator));
    int Nume = numerator*(Deno/denominator)-other.numerator*(Deno/other.denominator);
    return new RationalNumber(Nume,Deno);
  }
}