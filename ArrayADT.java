import java.util.*;
public class Main
{
    private int[] a;
    private int n; //size based on array values
    private int c; //total capacity of an array
    public Main(int size)
    {
        this.c=size;
        a=new int[c];
        n=0;
    }
    
    public void insert(int val)
    {
        if(n>=c)
        {
            System.out.print("Overflow");
            return;
        }
        a[n++]=val;
    }
    
    public void insertind(int i,int val)
    {
        if(n==c-1)
        {
            System.out.print("Overflow");
            return;
        }
        if(i<0 || i>n)
        {
             System.out.print("Overflow");
             return;
        }
        for(int j=n-1;j>=i;j--)
        {
            a[j+1]=a[j];
        }
        a[i]=val;
        n++;
    }
    
    public void delete(int i)
    {
        if(i<0 || i>=n)
        {
            System.out.print("invalid");
            return;
        }
        for(int j=i;j<=n-1;j++)
        {
            a[j]=a[j+1];
        }
        n--;
    }
    
    public void update(int i,int val)
    {
         if (i < 0 || i >= n) 
         {
        System.out.print("invalid");
        return;
         }
    a[i] = val;
    }
    
    public void search(int val) 
    {
    int i;
    for (i = 0; i < n; i++)
    {
        if (a[i] == val) 
        {
            System.out.println("Index " + i);
            break;
        }
    }
    if (i == n) 
    {
        System.out.println("Not found");
    }
    }   

    public void reverse() {
        for (int i = n-1; i>=0;i--) {
          System.out.print(a[i]+" ");
        }
    }


    public void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
	public static void main(String[] args) {
		Main ob=new Main(6);
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insertind(1,15);
		ob.delete(2);
		ob.display();
		System.out.println();
		ob.update(0,5);
		ob.display();
        System.out.println();
		ob.search(15);
		ob.search(100);
		ob.reverse();
		System.out.println();
		ob.display();
	}
}
