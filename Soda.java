public class Soda
{
private int calories;
private int intro;
private String name; 


public Soda(String n, int c, int i)
{
setName(n);
setCalories(c);
setIntro(i);
}

public Soda()
{
  this("unknown",0,0);
}



public int getName()
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

public String randomize()
{
  double num=(1+(Math.random()*4));
  if(num==1);
  {
  this.setName("Rootbeer");
  this.setCalories(152);
  this.setIntro(1876);
  return name;
  }

  if(num==2);
  {
  this.setName("Sprite");
    this.setCalories(192);
    this.setIntro(1961);
  return name;
  }

  if(num==3);
  {
  this.setName("Vernors");
    this.setCalories(140); 
     this.setIntro(1866);
  return name;
  }

  if(num==4);
  {
  this.setName("Coca-Cola");
    this.setCalories(139);
    this.setIntro(1886);
  return name;
  }

  if(num==5);
  {
  this.setName("Pepsi");
  this.setCalories(150);
    this.setIntro(1896);
  return name;
  }
}


public boolean equals(Soda d)
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

public String toString()
{
  return "Name: "+name+"\nCalories: "+calories+"\nYear Introduced: "+intro;
}


}