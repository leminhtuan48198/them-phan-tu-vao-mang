import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,index;
        int[] arr= {1,2,3,4,5,6,7,0,0,0,0};
        System.out.println("Mang ban dau la:");
        for (int e:arr) {
            System.out.print(e+"\t");
        }
        System.out.println("\n Nhap gia tri muon them vao:");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        System.out.println("Nhap vi tri muon them vao:");
        index=scanner.nextInt();
        if(index<0||index>=arr.length-1){
            System.out.println("Khong chen duoc phan tu vao mang");
        }else{
            for (int i = arr.length-1; i>index ; i--) {
                arr[i]=arr[i-1];
            }
            arr[index]=x;
        }
        System.out.println("Mang sau khi them phan tu la:");
        for (int e:arr) {
            System.out.print(e+"\t");
        }
    }
}
