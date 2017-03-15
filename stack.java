public class stack
{
private long [] stackarry;
private int top;
public stack (int siz) 
size=siz; 
{
stackarry=new long[size];
top=-1;
}
public void push (long k)
{
stackarry[++top]=k;
}
public long pop()
{
return stackarry[top--];
}
public long peek()
{
return stackarry[top];
}
public bolean isempty()
{
return (top==-1);
}
public bolean isfull();
{
return (top==size--);
}
public static void main(string [] args)
stack thestack=new stack(10);
thestack.push(10);
thestack.push(20);
thestack.push(30);
thestack.push(40);
thestack.push(50);
while(thestack.isempty())
{
long value =thestack.pop();
system.out.println(values);
system.out.println("");
}
system.out.println("");
}
}
