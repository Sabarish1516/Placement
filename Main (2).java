/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int [][]array={{1,20,3},{3,4,50}};
	    int total=0;
		for (int i=0;i<2;i++){
		    for(int j=0;j<3;j++){
		        total+=array[i][j];
		    }
		}
		       System.out.print(total);
		       
		       
		        
		   
		    
		}
}