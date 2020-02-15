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
}
