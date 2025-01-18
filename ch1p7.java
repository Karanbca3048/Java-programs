class complex
{
    int real,imag;
    complex()
    {
        real=imag=0;
    }
    complex(int a)
    {
        real=imag=a;
    }
    complex(int a,int b)
    {
        real=a;
        imag=b;
    }
    complex add(complex a,complex b)
    {
        complex t=new complex();
        t.real=a.real+b.real;
        t.imag=a.imag+b.imag;
        return(t);
    }
    complex sub(complex a,complex b)
    {
        complex t=new complex();
        t.real=a.real-b.real;
        t.imag=a.imag-b.imag;
        return(t);
    }
    complex mul(complex a,complex b)
    {
        complex t=new complex();
        t.real=a.real*b.real;
        t.imag=a.imag*b.imag;
        return(t);
    }
    void display()
    {
        System.out.println("real ::"+real+"  "+"imag ::"+imag);
    }
}

class ch1p7
{
    public static void main(String args[])
    {
      complex c1=new complex(6,7);
      complex c2=new complex(4,3);
      complex c3=new complex();
      c3=c1.add(c1,c2);
      c3.display();
      c3=c1.sub(c1,c2);
      c3.display();
      c3=c1.mul(c1,c2);
      c3.display();
    }
}