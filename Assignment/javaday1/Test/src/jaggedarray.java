import java.util.Scanner;

public class jaggedarray {
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int i,j;
	int [][]c={{1,2,3},{4,5,6,5},{8,9}};
	int [][]b = new int[][]{{1,2,3},{4,5,6,5},{8,9}};
	int[][]a;
	a = new int[3][];
	a[0]= new int[4];
	a[1]=new int[3];
	a[2]=new int[2];
	System.out.println("Enter values");
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			System.out.print(+a[i][j]);
		}
	System.out.println();
	}
	
	
	}
	
}

