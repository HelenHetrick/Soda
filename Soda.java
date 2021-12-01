public class Soda
{
private int calories;
private String name; 


public Soda(String n, int c)
{
setName(n);
setCalories(c);
}

public int getName()
{
  return name;
}
public int getCalories()
{
  return calories;
}

public Soda()
{
  this(unknown,0);
}


public void setName(String n)
{
   name=n;
}


public void setCalories(int c)
{
   calories=c;
}






}