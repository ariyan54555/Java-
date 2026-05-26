public class varArgs {
    static int sum(int ...arr){
        int s=0;
        for(int a:arr)
        {
            s+=a;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2,3 is "+ sum(2,3));
        System.out.println("The sum of 2,3,4 is "+ sum(2,3,4));
        System.out.println("The sum of 2,3,5 is "+ sum(2,3,5));

    }
}
