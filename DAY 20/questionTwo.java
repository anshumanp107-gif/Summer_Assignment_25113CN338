public class questionTwo {
    public static void main(String[] args) {

        int[][] a={
                {1,2,3},
                {2,4,5},
                {3,5,6}
        };

        boolean symmetric=true;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=a[j][i]){
                    symmetric=false;
                    break;
                }
            }
        }

        if(symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric");
    }
}