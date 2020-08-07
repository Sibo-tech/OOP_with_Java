package Objects_and_Classes.UberServices;
public class UberService {
    private String ServiceName;
    private int MinCost;
    private int KMCost;
    private int FeeBase;
    private int CancelFee;

    void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee)
    {
        this.ServiceName= name;
        this.MinCost= costPerMin;
        this.KMCost= costPerKM;
        this.FeeBase= baseFee;
        this.CancelFee= cancellationFee;
    }
    void setName(String name)
    {
        this.ServiceName=name;

    }
    void setCostPerMinute(int cents)
    {
        this.MinCost=cents;
    }
    void setCostPerKilometre(int cents)
    {
        this.KMCost=cents;
    }
    void setBaseFare(int cents)
    {
        this.FeeBase=cents;
    }
    void setCancellationFee(int n)
    {
        this.CancelFee=n;
    }
    public double calculateFare(double minutes, double distance)
    {
        double calculateFare= getBaseFare()+(getCostPerMinute()*minutes)+(getCostPerKilometre()*distance);
        return calculateFare;

    }
    public Object getName() {
        return ServiceName;

    }
    public int getCostPerMinute() {
        return MinCost;
    }

    public int getCostPerKilometre() {
        return KMCost;
    }

    public int getBaseFare() {
        return FeeBase;
    }

    public int getCancellationFee() {
        return CancelFee;
    }
}
