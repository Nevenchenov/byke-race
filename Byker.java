package name.yuris;

/**
 * Created by Rain on 03-Oct-16.
 */
public class Byker {
    public String name;
    public Short range;
    public Byke byke;
    public double time = 0;
    protected boolean isRun = true;

    public Byker(String name)
    {
        this.name = name;
        this.byke = new Byke();
    }
    public Short setRange(Short range)
    {
        this.range = range;
        return range;
    }
    public String getName()
    {
        return this.name;
    }

}
