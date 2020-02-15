package prim.arraylist;

public class ArrayList {
	static int ar[];
	int increment=5;
	static int nextposition=1;
	ArrayList()
	{
		ar = new int[increment];
	}

	boolean add(int number)
	{
		boolean flag = false;

		if(nextposition<ar.length)
		{
			ar [nextposition-1] = number;
			nextposition ++;
			flag = true;
			return flag;
		}
		else 
		{
			int[] tempar = new int[ar.length+increment];
			for(int i =0; i<ar.length;i++)
			{
				tempar[i]= ar[i];
			}
			ar = new int[tempar.length];
			ar = tempar;
			add(number);
		}
		return flag;
	}


	void print ()
	{

		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();

	}

	int get(int index)
	{
		if(index<ar.length)
		{
			return ar[index];
		}
		else
		{
			return -1;
		}
	}
	
	boolean remove(int index)
	{
		boolean flag = false;
		if(index<ar.length)
		{
		flag = true;
		for(int i=0;i<ar.length;i++)
		{
			if(index<=i&&i!=ar.length-1)
			{
				ar[i]= ar[i+1];
			}
		}
		ar[ar.length-1]=0;
		return flag;
		}
		else {
		return flag;
	}
}
}
