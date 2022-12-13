public class T {
    public static void main(String[] args) {
     //7
     T sf = new T();

     System.out.println(sf.firstLast6(new int[] {1, 2, 6}));
     System.out.println(sf.firstLast6(new int[] {6,1,2,3}));
     System.out.println(sf.firstLast6(new int[] {13,6,1,2,3}));
    }
  
    

    public boolean firstLast6(int[] newarr) 
	{
		if(newarr[0]==6 || newarr[newarr.length-1] == 6)
			return true;
		else
			return false;
	}
}

  