public class CompanyEmpWage
{
    public static String name;
    public static int rate;
    public static int hrs;
    public static int days;
    public CompanyEmpWage(name, rate, hrs, days)
    {
        this.name=name;
        this.rate=rate;
        this.hrs=hrs;
        this.days=days;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CompanyEmpWage.name = name;
    }

    public static int getRate() {
        return rate;
    }

    public static void setRate(int rate) {
        CompanyEmpWage.rate = rate;
    }

    public static int getHrs() {
        return hrs;
    }

    public static void setHrs(int hrs) {
        CompanyEmpWage.hrs = hrs;
    }

    public static int getDays() {
        return days;
    }

    public static void setDays(int days) {
        CompanyEmpWage.days = days;
    }
}