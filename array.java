class testclass{
  public int[] m1(){
    return new int[]{1,2,3};
  }
}
class array{
public static void main(String args[]){
   int arr[]=new int[10];
   int []foo;
   foo=new int[10];
   for(int i=0;i<arr.length;i++)
   {
     System.out.println(arr[i]);
   }
   testclass c=new testclass();
   int arr1[]=c.m1();
   System.out.println(arr1[0]);
   System.out.println(arr1.length);

  }
}
