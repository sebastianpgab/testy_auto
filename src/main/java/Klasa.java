

public class Klasa {


    public int max(int x, int y)
    {
        if (x<y)
            return y;
        else
            return x;
    }

    public int min(int x, int y)
    {
        if (x>y)
            return y;
        else
            return x;
    }

    public boolean isPositive(int x)
    {
        if (x>=0)
            return true;
        else
            return false;
    }

}
