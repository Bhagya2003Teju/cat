   public class danu {
    
        int a;
        int b;
        
        danu(int i)
        {
            a=i;
        }
        danu(int j,int k)
        {
            a=j;
            b=k;
        }
    }
    class dts{
        public static void main(String args[])
        {
           
            
            danu c=new danu(10);
            danu c1=new danu(20,30);
            System.out.println(c.a);
            System.out.println(c1.a);
              System.out.println(c1.b);
            
        }
    }
    

