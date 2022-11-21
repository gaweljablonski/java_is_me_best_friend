package klasaobject;


public class Main {

   
    public static void main(String[] args) 
    {
        Object[] punkty = new Punkt[4];
       
        
        punkty[0] = new Punkt(2, 8);
        punkty[1] = new Punkt(4, 8);
        punkty[2] = new Punkt(7, 8);
        punkty[3] = new Punkt(2, 88);
        
        for(int i = 0; i < punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }
      
        
    }
    
}

class Punkt 
{
    private int x;
    private int y;
    
    Punkt()
    {
        
    }
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o) 
    {
        if (this == o)
            return true;        
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;

        Punkt przyslany = (Punkt)o;        
        
        return this.x == przyslany.x && this.y == przyslany.y;        
    }
    @Override
    public String toString()
    {
        return getX() + ", " + getY();
    }

}