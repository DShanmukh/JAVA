class command 
{
public static void main(String args[])
{
 int sum=0;
 System.out.println("No of commands ="+args.length);
for(int i=0;i<args.length;i++)

  sum=sum+Integer.parseInt(args[i]);
 System.out.println("Sum ="+sum);
}
}