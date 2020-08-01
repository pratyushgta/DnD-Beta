import java.util.*;
class timemodule
{
    Scanner sc=new Scanner(System.in);
    int hh;
    int mm;

    void read()
    {
        System.out.print("Enter time: ");
        hh=sc.nextInt();
        System.out.print("Enter min: ");
        mm=sc.nextInt();
    }

    void choose()
    {
        System.out.println("1.1st Function\n2.2nd Function");
        int ch=sc.nextInt();
        if(ch==1)
            fn();
        else if(ch==2)
            fn2();
    }

    void fn()
    {
        System.out.println("START");
        hh=hh+1;
        mm=mm+30;
        time();
        System.out.println("END");
    }

    void fn2()
    {
        System.out.println("START 123");
        hh=hh+1;
        mm=mm+30;
        time();
        System.out.println("END 123");
    }

    void time()
    {
        if(hh>=24)
        {
            hh=hh-24;
        }
        if(mm>=60)
        {
            mm=mm-60;
            hh++;
        }
        if(mm==0)
        {
            System.out.println("TIME IS: "+hh+":"+mm+"0");
        }
        else
        {
            System.out.println("TIME IS: "+hh+":"+mm);

        }
    }

    void main()
    {
        timemodule ob=new timemodule();
        ob.read();
        ob.choose();
    }
}

