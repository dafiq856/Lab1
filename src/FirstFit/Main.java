/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstFit;

/**
 *
 * @author milo
 */
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int[] memory = {10,20,30,40,50};
        int num;
        
        System.out.print("Enter number of instruction : ");
        num=s.nextInt();
        
        int[] inst = new int[num];
        
        for(int i=0;i<num;i++)
	    {
            System.out.print("Instruction number "+(i+1)+" size : ");
            inst[i]=s.nextInt();
	    }	
        
        int k = memory.length;
        
        boolean[] memocheck = new boolean[k];
        boolean[] instcheck = new boolean[num];
        
        int r=0;
        
        System.out.println("Instruction no.\t\tBlock no.\t\tFragment");
        System.out.println("===========================================================");
        
        for(int i=0;i<num;i++)
        {
		    for(int j=0;j<k;j++)
		    {
                int dif=inst[i]-memory[j];
                if(dif<=0 && memocheck[j]!=true)
                    {
                        System.out.println((i+1)+"\t\t\t"+j+"\t\t\t"+dif*-1);
                        memocheck[j]=true;
			            instcheck[i]=true;
			            break;    
                    }
             }
             if(instcheck[i]==false)
                System.out.println((i+1)+"\t\t\tNot Allocated\t\t0");
             else
                System.out.println("");
         }
    }
}
