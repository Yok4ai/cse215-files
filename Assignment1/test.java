
package Assignment1;

public class test {
    public static void main(String[] args) {
        int n=3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" " + k + " ");
            }
            for(int k=i+1; k<=2*i-1; k++){
                System.out.print(" " + k + " ");
            }
            System.out.print("\n");
        }
    }

}

