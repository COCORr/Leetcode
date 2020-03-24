public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i>=0;i--){
            if (digits[i]+1<10){
                digits[i] +=1;
                return digits;
            }else {
                digits[i]=0;
            }
        }
        int[] tempdigits = new int[digits.length+1];
        tempdigits[0]=1;
        for (int i=0;i<digits.length;i++){
            tempdigits[i+1]=digits[i];
        }
        return tempdigits;
    }
}
