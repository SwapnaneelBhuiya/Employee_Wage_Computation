import java.util.*;
public class EmpWageBuilderUC1
{
    public static String name;
    public static int rate;
    public static int hrs;
    public static int days;
    public EmpWageBuilderUC1(name, rate, hrs, days)
    {
        this.name=name;
        this.rate=rate;
        this.hrs=hrs;
        this.days=days;
    }

    public static String getName() {
        return name;
    }

    public static int getRate() {
        return rate;
    }

    public static int getHrs() {
        return hrs;
    }

    public static int getDays() {
        return days;
    }

    public static int ComputeWage(String company, int emprate1, int totalworkdays1, int totalemphrs1)
        {
            int employeehrs=0;
            int totalworkdays=0;
            int totalemphrs=0;
            int totalwage=0;

            while(totalemphrs<=totalemphrs1&&totalworkdays<totalworkdays1)
            {
                totalworkdays++;
                int empcheck=(int) Math.floor(Math.random()*10)%3;

                switch(empcheck)
                {
                    case 1:
                        employeehrs=4;
                        break;
                    case 2:
                        employeehrs=8;
                        break;
                    default:
                        employeehrs=0;
                }



                totalemphrs+=employeehrs;
                System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);


            }
            totalwage=totalemphrs*emprate1;
            return totalwage;


        }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter each company info");
            ArrayList<EmpWageBuilderUC1> ar=new ArrayList<EmpWageBuilderUC1>();
            for(int i=0;i<4;i++)
            {
                String name1=sc.nextLine();
                int emp_hr=sc.nextInt();
                int emprate=sc.nextInt();
                int days1=sc.nextInt();
                ar.add(new EmpWageBuilderUC1(name1,emprate,emp_hr,days1);
            }
            ArrayList<Integer> wages=new ArrayList<Integer>();
            for(int i=0;i<4;i++)
                wages.add(ComputeWage(ar[i].getName(),ar[i].getRate(),ar[i].getDays(),ar[i].getHrs()));
            //System.out.println("Total wage for "+name+ "is: "+ComputeWage(name,emprate,days,emp_hr));
        }


}

