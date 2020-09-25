import java.util.*;
public class EmpWageBuilderUC1 extends CompanyEmpWage implements EmpWageBuild
{
    public static ArrayList<CompanyEmpWage> ar=new ArrayList<CompanyEmpWage>();
    public static ArrayList<String> comp_name=new ArrayList<String>();

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
                //System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);


            }
            totalwage=totalemphrs*emprate1;
            return totalwage;


        }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<4;i++)
            {
                System.out.println("Enter each company info");
                String name1=sc.nextLine();
                int emp_hr=sc.nextInt();
                int emprate=sc.nextInt();
                int days1=sc.nextInt();
                CompanyEmpWage obj=new CompanyEmpWage(name1,emprate,emp_hr,days1);
                ar.add(obj);
                comp_name.add(name1);
            }
            ArrayList<Integer> wages=new ArrayList<Integer>();
            HashMap<Integer, Integer> daily_total_wages=new HashMap<Integer, Integer>();
            for(int i=0;i<4;i++)
            {
                wages.add(ComputeWage(ar[i].getName(),ar[i].getRate(),ar[i].getDays(),ar[i].getHrs()));
                daily_total_wages.put(ar[i].getRate(),wages[i]);
                System.out.println("Total wage for "+ar[i].getName()+ "is: "+wages[i]);
            }
            System.out.println("Enter company name to be searched");
            String search_name=sc.nextLine();
            for(int i=0;i<4;i++)
            {
                if(comp_name(i).equals(search_name))
                {
                    System.out.println("Total Wage for "+comp_name(i)+" is " + wages(i));
                    System.exit(0);
                }
            }
            System.out.println("Company not found!");
        }
}

