class timer 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello welcome to harsha World!");
		for(int i=00;i<24;i++)
		{
			for(int j=00;j<60;j++)
			{
				for(int k=00;k<60;k++)
				{
					try
					{
/*						int a=i;
						int b=j;
						int c=k;*/
					System.out.println(i+":"+j+":"+k);
					Thread.sleep(1000);		
					}
					catch (Exception e)
					{
						System.err.println(e);
					}
				
				}
			}
		}
	}
}
