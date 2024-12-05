import  java.util.Scanner; 
 
public class AddMatrix  
{ 
 
 public static void main(String[] args)  
   
 { 
  int n=Integer.parseInt(args[0]); 
  int i,j; 
   
  int mat1[][] = new int[n][n]; 
  int mat2[][] = new int[n][n]; 
  int res[][] = new int[n][n]; 
   
  Scanner  in = new Scanner(System.in); 
 
  System.out.println("Enter the elements of  matrix1"); 
 
  for ( i= 0 ; i < n ; i++) 
  {  
        for ( j= 0 ; j < n ;j++) 
        { 
           mat1[i][j] = in.nextInt(); 
        } 
  } 
   
  System.out.println("Enter the elements of  matrix2"); 
 
  for ( i= 0 ; i < n ; i++) 
  { 
 
       for ( j= 0 ; j < n ;j++) 
       { 
          mat2[i][j] = in.nextInt(); 
       } 
  } 
   
  for ( i= 0 ; i <n ; i++ ) 
  for ( j= 0 ; j <n ;j++ ) 
  res[i][j] = mat1[i][j] + mat2[i][j] ;  
 
  System.out.println("Sum of matrices:-"); 
 
  for ( i= 0 ; i <n ; i++ ) 
  {  
       for ( j= 0 ; j <n ;j++ ) 
       { 
          System.out.print(res[i][j]+"\t"); 
       } 
 
          System.out.println(); 
   } 
 
   } 
   
} 