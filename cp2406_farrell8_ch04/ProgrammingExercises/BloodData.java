public class BloodData
{
    private String type, factor;
    public BloodData()
    {
        //Default Constructor
        type = "O";
        factor = "+";
    }
    public String getType()
    {
        return type;
    }
    public String getFactor()
    {
        return factor;
    }
    public void setType()
    {
        this.type = type;
    }
    public void setFactor()
    {
        this.factor = factor;
    }
}
