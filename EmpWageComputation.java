public class EmpWageComputation
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int i=0, wages_month=0, hours=0;
        while(i<20&&hours<100) {
            int empCheck = (int) (Math.random() * 10) % 2;
            if (empCheck == 1) {
                System.out.println("Employee Present");
                int hours_day = 8, wage_hr = 20;
                int daily_wage = 8 * 20;
                int part_time_hour = 4, part_time_wage = 20;
                int empType = (int) (Math.random() * 10) % 3;
                switch (empType) {
                    case 1:
                        daily_wage = 8 * 20;
                        hours+=8;
                        break;
                    case 2:
                        daily_wage = 4 * 20;
                        hours+=4;
                        break;
                    default:
                        daily_wage = 0;
                }
                wages_month=wages_month+daily_wage;
                i++;
            }
            else
                System.out.println("Employee Absent");
        }
        System.out.println("Total wage ="+wages_month);
    }
}