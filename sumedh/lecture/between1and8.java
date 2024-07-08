import java.util.Scanner;
class between1and8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        while(true){
            if(i>=1 && i<=8){
                System.out.println("nice");
                break;
            }
            System.out.println("wrong!");
            i=sc.nextInt();
        }       
    }
}
