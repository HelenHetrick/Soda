public class Soda
{
  //This is my instance data. There are 4 and include 3 
  //different variable tpes
private int calories;
private int intro;
private String name; 
private boolean caffeine;

//These are my constructors-
public Soda(String n, int c, int i, boolean b)
{
setName(n);
setCalories(c);
setIntro(i);
setCaffeine(b);
}

//This is the default constructor
public Soda()
{
  this("unknown",0,0,true);
}


//These are the Accessor Methods for all of my instance data
public String getName()
{
  return name;
}
public int getCalories()
{
  return calories;
}
public int getIntro()
{
  return intro;
}
public boolean getCaffeine()
{
  return caffeine;
}

//These are my Mutator Methods for all of my instance data
public void setName(String n)
{
   name=n;
}
public void setCalories(int c)
{
   calories=c;
}
public void setIntro(int i)
{
   intro=i;
}
public void setCaffeine(boolean b)
{
  caffeine=b;
}

//This is an additional method that randomizes the kind of soda and sets the other values to the corresponding information about the soda. 
public void randomize()
{
  int num=(int)(1+(Math.random()*4));
  if(num==1)
  {
name="Rootbeer";
calories=152;
intro=1876;
caffeine=false;
  }

else if(num==2)
  {
name="Sprite";
calories=192;
intro=1961;
caffeine=false;
  }

  else if(num==3)
  {
name="Vernors";
calories=140;
intro=1866;
caffeine=false;
  }

 else if(num==4)
  {
name="Coca-Cola";
calories=139;
intro=1886;
caffeine=true;
  }

else  if(num==5)
  {
name="Pepsi";
calories=150;
intro=1896;
caffeine=true;
  }

  return;
}

//This is an additional method to represent a change in the number of servings(or cans) drank by multipling the amount drank by the original number of calories
public void totalCalories(int x)
{
calories=(calories*x);
  return;
}


//This is the equals method to compare two sodas based on their name
public  boolean equals(Soda d)
{
  if(this.getName()==d.getName())
  {
    return true;
  }
  else
  {
    return false;
  }
}

//This toString Method prints all corresponding values of the soda.
public String toString()
{
  return "Name: "+name+"\nCalories: "+calories+"\nYear Introduced: "+intro+"\nContains caffeine:"+caffeine ;
}



}