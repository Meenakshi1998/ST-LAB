import java.util.*;
import java.io.*;

class NextDate {

        public static void main(String[] args)
        {

                Scanner sc = new Scanner(System.in);
                int day,month,year,next_day=0,next_month=0,next_year=0;
                char flag;
                do{

                        System.out.println("Enter today's date in the format DD MM YYYY (between 1800 and 2018)");
                        flag = 'y';
                        day = sc.nextInt();
                        month = sc.nextInt();
                        year = sc.nextInt();

                        next_month = month;
                        next_year = year;

                        if(day<1 || day>31)
                        {
                                System.out.println("Value of day does not exist");
                                flag = 'n';
                        }

                        if(month < 1 || month > 12)
                        {
                                System.out.println("Value of month does not exist");
                                flag = 'n';
                        }

                        else if((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 31))
                        {
                                System.out.println("31 days does not exist");
                                flag = 'n';
                        }

                        if(year<=1800 || year>2018)
                        {
                                System.out.println("Value of year is not in the specified range \n");
								 System.out.println("Value of year is not in the specified range \n");
                                flag='n';
                        }

                        if(month==2)
                        {
                                if((((year % 4 ==0) && (year%100 != 0)) || (year%400==0)) && day>29)
                                {
                                        System.out.println("Invalid date input for leap year");
                                        flag='n';
                                }
                                else if((((year % 4 !=0) && (year%100 == 0)) || (year%400!=0)) && day>28)
                                {
                                        System.out.println("Invalid date input for common year or non leap year");
                                        flag='n';
                                }
                        }

                  }while (flag =='n');

                switch (month)
                {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:if(day<31)
                                        next_day=day+1;
                                else
                                        {
                                                next_day=1;
                                                next_month=month+1;
                                        }
                        break;
                        case 4:
                        case 6:
                        case 9:
                        case 11: if(day<30)
                                        next_day=day+1;
                                 else
                                        {
                                                next_day=1;
												 next_month=month+1;
                                        }
                        break;
                        case 12: if(day<31)
                                        next_day=day+1;
                                 else
                                        {
                                                next_day=1;
                                                next_month=1;
                                                if(year==2018)
                                                {
                                                        System.out.println("The next day is out of the specified boundary\n");
                                                        System.exit(0);
                                                }
                                                else
                                                        next_year=year+1;
                                        }
                                 break;
                        case 2:
                                if(day<28)
                                {
                                        next_day=day+1;
                                }
                                else if((((year % 4 ==0) && (year%100 != 0)) || (year%400==0)))
                                {
                                        if(day == 28)
                                        {
                                                next_day = day+1;
                                        }

                                }

                                else if(day==28 || day==29)
                                {
                                        next_day=1;
                                        next_month=3;
                                }
                                break;

                }
                System.out.println(next_day + "/" + next_month + "/" +next_year);
        }
}
