import java.util.Scanner;
public class Desktop
{
    String processor,graphicCard;
    int cost[]=new int[5];
    Processor pr=new Processor();
    GraphicCard gc=new GraphicCard();
    String po;
    Desktop(String processor,String graphicCards)
    {
        po=processor;
    }

    public static void main()
    {
        Desktop d= new Desktop("","");
        d.p();
    }

    public void p()
    {
        pr.ma();
    }

    public void g()
    {
        gc.ma();
    }
    public class Processor
    {
        int price;
        Scanner sc=new Scanner(System.in);
        Processor()
        {
        }
        String s,na;
        int n,p;
        double f;
        Processor(String manufacturer,String name,double frequency,int no_Of_Cores,int price)
        {
            s=manufacturer;
            na=name;
            f=frequency;
            n=no_Of_Cores;
            p=price;
        }

        public void display()
        {
            System.out.println("Manufacturer:"+s);
            System.out.println("Frequency:"+f);
            System.out.println("No of cores:"+n);
            System.out.println("Price:"+p);
        }

        public void ma()
        {
            Processor i9800k=new Processor("Intel","i9800k",5.5,8,90000);
            System.out.println("Processors");
            System.out.println("Press 1 to view i9800k");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                i9800k.display();
                processor=i9800k.na;
                price=i9800k.p;
                purchase();
            }
        }

        public void purchase()
        {
            System.out.println("Press 0 to go back or press 1 to purchase it");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                processor="";
                price=0;
                ma();
                case 1:
                cost[0]=price;
                g();
            }
        }
    }
    public class GraphicCard
    {
        String m,a,na;
        int price,p;
        Scanner sc=new Scanner(System.in);
        GraphicCard()
        {
        }

        GraphicCard(String manufacturer,String architecture,String name,int price)
        {
            m=manufacturer;
            a=architecture;
            na=name;
            p=price;
        }

        public void display()
        {
            System.out.println("Manufacture:"+m);
            System.out.println("Architecture:"+a);
            System.out.println("Price"+p);
        }

        public void ma()
        {
            GraphicCard GeForceRtx_2080=new GraphicCard("Nvidia","Volta","GeForce RTX 2080",86000);
            System.out.println("Graphic Cards");
            System.out.println("Press 1 to view GeForce RTX 2080");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                GeForceRtx_2080.display();
                graphicCard=GeForceRtx_2080.na;
                price=GeForceRtx_2080.p;
                purchase();
            }
        }

        public void purchase()
        {
            System.out.println("Press 0 to go back or press 1 to purchase it");
            int a=sc.nextInt();
            switch(a)
            {
                case 0:
                graphicCard="";
                ma();
                case 1:
                cost[1]=price;
                exit();
            }
        }
    }
    public void exit()
    {
        int su=0,i;
        System.out.println("Specifications");
        System.out.println("Processor:"+processor);
        System.out.println("Graphic Card:"+graphicCard);
        for(i=0;i<5;i++)
        {
            su=su+cost[i];
        }
        String s1="",s2="";
        char c;
        int l;
        String s=Integer.toString(su);
        s1=reverse(s);
        l=s1.length();
        for(i=0;i<l;i++)
        {
            c=s1.charAt(i);
            if((i+1)==3)
            {
                s2=s2+c;
                s2=s2+",";
            }
            else if((i+1)%2!=0&&(i+1)<l&&(i+1>3))
            {
                s2=s2+c;
                s2=s2+",";
            }
            else
            {
                s2=s2+c;
            }
        }
        s1=reverse(s2);
        System.out.println("Cost:Rs"+s1);
    }

    public static String reverse(String s)
    {
        int l=s.length();
        char c;
        String s1="";
        for(int i=l-1;i>=0;i--)
        {
            c=s.charAt(i);
            s1=s1+c;
        }
        return s1;
      
    }
}

