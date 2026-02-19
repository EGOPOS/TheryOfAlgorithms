public class Employee {
    private String firstName;
    private String lastName;
    private float commissionRate;
    private float grossSales;

    public Employee(String firstName, String lastName, float commissionRate, float grossSales) {
        setFirstName(firstName);
        setLastName(lastName);
        setCommissionRate(commissionRate);
        setGrossSales(grossSales);
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(float commissionRate) {
        if (commissionRate < 0.0f || commissionRate > 1.0f)
        {
            System.out.println("-- Warning blin -- commissionRate value is invalid '" + commissionRate + "', changed to '0'");
            this.commissionRate = 0;
            return;
        }
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales < 0.0f)
        {
            System.out.println("-- Warning blin -- grossSales value is invalid '" + grossSales + "', changed to '0'");
            this.grossSales = 0;
            return;
        }
        this.grossSales = grossSales;
    }

    public double getEarnings() {
        return commissionRate * grossSales;
    }

    public void printInformation()
    {
        System.out.println("");
        System.out.println("-----------");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Commission rate: " + commissionRate);
        System.out.println("Gross sales: " + grossSales);
        System.out.println("Earnings: " + String.format("%.2f", getEarnings()));
        System.out.println("-----------");
        System.out.println("");
    }
}
