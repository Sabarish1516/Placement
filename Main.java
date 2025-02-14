/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int [][]array={{1,2,3},{3,4,5}};
		for (int i=0;i<2;i++){
		    for(int j=0;j<3;j++){
		        array[i][j]=array[i][j]*2;
		    }
		}for (int i=0;i<2;i++){
		    System.out.println("{");
		    for(int j=0;j<3;j++)
		    {
		        
		       System.out.print(array[i][j]);
		       System.out.print(",");
		       
		        array[i][j]=array[i][j]*2;
		    }
		    System.out.println("}");
		    
		}}
}