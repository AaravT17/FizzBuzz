public class Reduce {
    public static void main(String[] args) {
        int n = 100, steps = 0;
        while(n > 0){
            if(n % 2 == 0)
                n /= 2;
            else
                n--;
            steps++;
        }
        System.out.println("It takes " + steps + " steps to reduce 100 to 0.");
    }
}
