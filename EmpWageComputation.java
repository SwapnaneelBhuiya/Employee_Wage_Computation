public class EmpWageComputation
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int empCheck= (int)(Math.random()*10)%2;
        if(empCheck==1)
        {
            System.out.println("Employee Present");
            int hours_day=8, wage_hr=20;
            int daily_wage=8*20;
            int part_time_hour=4, part_time_wage=20;
            int empType=(int) (Math.random()*10)%3;
            switch(empType)
            {
                case 1:
                    daily_wage=8*20;
                    break;
                case 2:
                    daily_wage=4*20;
                    break;
                default:
                    daily wage =0;
            }
        }
        else
            System.out.println("Employee Absent");


    }
}