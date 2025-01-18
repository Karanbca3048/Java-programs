class calamount
{
    double p,r,n;
    calamount(double p1,double r1,double n1)
    {
        p=p1;
        r=r1;
        n=n1;   
    }
    void calci()
    {
        double ci,netv;
        ci=p*(Math.pow((1+(r/100)),n));
        netv=p+ci;
        
        System.out.println("The compond intrest :"+ci+" "+"The net vlaue :"+netv);
    }
}

class ch1p9
{
    public static void main(String args[])
    {
        double p=5000,r=6.5,n=5;
        calamount obj=new calamount(p,r,n);
        obj.calci();
    }
}