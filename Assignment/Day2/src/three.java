import java.util.Scanner;

public class three {
public static void main(String args[]){
	int a[][],b[][],c[][];
	int i,j,sum=0;
	c=new int[3][3];
	b=new int[3][3];
	a=new int[3][3];
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter elements of a");
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			a[i][j]=sc.nextInt();
		}
		}
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			System.out.print( +a[i][j]+ " ");
		}
		System.out.println();
		}
	System.out.println("Enter elements of b");
	for(i=0;i<b.length;i++){
		for(j=0;j<b[i].length;j++){
			b[i][j]=sc.nextInt();
		}
		}
	for(i=0;i<b.length;i++){
		for(j=0;j<b[i].length;j++){
			System.out.print(+b[i][j]+ " ");
		}
		System.out.println();
		}

	System.out.println("Transpose");
	for(i=0;i<a.length;i++){
		for(j=0;j<a[i].length;j++){
			System.out.print( a[j][i]+ " ");
		}
		System.out.println();
	}
	System.out.println("Addition of a and b :");
	for(i=0;i<a.length;i++){
		for(j=0;j<a.length;j++){
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(i=0;i<a.length;i++){
		for(j=0;j<a.length;j++){
			System.out.print(+c[i][j] +" ");;
		}
		System.out.println();
	}
	System.out.println("Multiplication of a and b :");
	for(i=0;i<a.length;i++){
		for(j=0;j<a.length;j++){
			c[i][j]=0;
			for(int k=0;k<a.length;k++){
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
			
		}
	}
	
	for(i=0;i<a.length;i++){
		for(j=0;j<a.length;j++){
			System.out.print(+c[i][j] +" ");;
		}
		System.out.println();
	}
}
}
