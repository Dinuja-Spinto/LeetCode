
public class AddBinary {
    public static void main(String[] args) {
        System.out.println("Binary SUM: "+addBinary("1010","1011"));
    }

    public static String addBinary(String a, String b){
        int sum = binaryToDecimal(a) + binaryToDecimal(b);

        return decimalToBinary(sum);
    }

    public static int binaryToDecimal(String bNum){
        int len = bNum.length();
        int dNum = 0;
        int j=1;
        for(int i = len-1; i >= 0; i-- ){
            dNum = dNum + Character.getNumericValue(bNum.charAt(i))*j;
            j *= 2;
        }

        return dNum;
    }

    public static String decimalToBinary(int dNum){

        if (dNum == 0) {
            return Integer.toString(dNum);
        }

        StringBuilder bNum = new StringBuilder();
        int quotient = dNum;

        while (quotient > 0) {
            int remainder = quotient % 2;
            bNum.append(remainder);
            quotient /= 2;
        }

        bNum.reverse();
        return bNum.toString();
    }

}
