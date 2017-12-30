public class Kata {
    public static String HighAndLow(String numbers) {

        String[] str = numbers.split(" ");

        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return max + " " + min;
    }

    public static void main(String args[])
    {
        String highAndLow = HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(highAndLow);
    }
}
