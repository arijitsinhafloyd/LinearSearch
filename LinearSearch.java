import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        if(arr.length>size)
        System.out.println("Not possible");
        else{
        System.out.println("Enter the element to be searched in the array:");
        int element=sc.nextInt();
        int index=linearSearch(arr, element);
        if(index==-1)
            System.out.println("Elememt is not present in the array");
        else
            System.out.println("Elememt is present in the array at index: "+index);
        }
    }
    public static int linearSearch(int a[], int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                return i;
        }
        return -1;
    }
}
