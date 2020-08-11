public class Driver {

    /**
     *  Similar to Hex -> Decimal
     *  We are converting with base 26
     * @param s String to be converted
     * @return int base 10
     */
    public int titleToNumber(String s) {
        int accumulator = 0;
        int index = 0;
        for(int i = s.length()-1;i >=0;i--){
            char c = s.charAt(i);
            int offset = (int)(c) - 64;
            accumulator += ((Math.pow(26, index)) * (offset));
            index++;
        }
        return accumulator;
    }

    public static void main(String[] args) {
        {
            Driver d = new Driver();
            String tmp = "A";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 1
        }
        {
            Driver d = new Driver();
            String tmp = "Z";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 26
        }
        {
            Driver d = new Driver();
            String tmp = "AA";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 27
        }
        {
            Driver d = new Driver();
            String tmp = "AB";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 28
        }
        {
            Driver d = new Driver();
            String tmp = "BA";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 53
        }
        {
            Driver d = new Driver();
            String tmp = "ZY";
            int num = d.titleToNumber(tmp);
            System.out.println(num); // 701
        }
    }
}
