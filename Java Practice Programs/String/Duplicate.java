public class Duplicate
{   // make numbers and 
	public static void main(String[] args) {				
    String str = "Manmeet";
    int cnt = 0;
    char[] inp = str.toCharArray();
    for(int i=0;i<=(inp.length-1);i++)
    {
        for(int j=i+1;j<=(inp.length-1);j++){
            if(inp[i]==inp[j])
            {
                System.out.println(inp[j]);
                break;
            }
        }
    }
	}
}