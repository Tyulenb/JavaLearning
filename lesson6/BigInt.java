package lesson6;

import java.util.Arrays;

public class BigInt implements Comparable<BigInt>{
    int[] number;

    public BigInt(String num) {
        number = new int[num.length()]; // 123 = {3,2,1}
        for (int i = num.length() - 1, j = 0; i >= 0; i--, j++) {
            number[j] = Integer.parseInt(""+num.charAt(i));
        }
    }
    public BigInt (int[] num){
        number = new int[num.length]; // 123 = {3,2,1}
        System.arraycopy(num, 0, number, 0, number.length);
    }

    private void overflow(int num) throws DigitException {
        if(num >= 10){
            throw new DigitException("OVERFLOW!");
        }
    }
    private void lack(int num) throws DigitException {
        if(num < 0){
            throw new DigitException("LACK!");
        }
    }

    BigInt add(BigInt num){
        int newLength = Math.max(number.length, num.number.length);
        int[] newNum = new int[newLength+1];

        int[] num1 = new int[newLength+1];
        Arrays.fill(num1, 0);
        System.arraycopy(number, 0, num1, 0, number.length);
        int[] num2 = new int[newLength+1];
        Arrays.fill(num2, 0);
        System.arraycopy(num.number, 0, num2, 0, num.number.length);


        int remainder = 0;
        for (int i = 0; i <= newLength; i++) {
            try {
                overflow(num1[i]+num2[i]+remainder);
                newNum[i] = (num1[i]+num2[i]+remainder)%10;
                remainder = 0;
            }catch (DigitException e){
                newNum[i] = (num1[i]+num2[i]+remainder)%10;
                remainder = (num1[i]+num2[i]+remainder)/10;
            }
//            newNum[i]=(num1[i]+num2[i]+remainder)%10;
//            remainder = (num1[i]+num2[i]+remainder)/10;
        }
        if(newNum[newLength]==0){
            int[] reduced = new int[newLength];
            System.arraycopy(newNum, 0, reduced, 0, newLength);
            return new BigInt(reduced);
        }
        return new BigInt(newNum);
    }

    BigInt subtract(BigInt num){
        int[] bigger, smaller;
        if(this.compareTo(num) > 0){
            bigger = number;
            smaller = num.number;
        }else {
            bigger = num.number;
            smaller = number;
        }

        for(int i = 0; i < smaller.length; i++){
            bigger[i]-=smaller[i];
            try {
                lack(bigger[i]);
            }catch (DigitException e){
                bigger[i+1]--;
                bigger[i]+=10;
            }
        }
        return new BigInt(bigger);
    }

    BigInt multiply(BigInt num){
        int[] bigger, smaller;
        if(this.compareTo(num) > 0){
            bigger = number;
            smaller = num.number;
        }else {
            bigger = num.number;
            smaller = number;
        }

        BigInt[] adds = new BigInt[smaller.length];
        int[] tmp = new int[smaller.length+bigger.length-1];

        int i = 0;
        while(i < smaller.length){
           Arrays.fill(tmp, 0);
           int j = 0;
           while(true){
               try{
                   tmp[j+i] = smaller[i]*bigger[j];
                   j++;
               } catch (IndexOutOfBoundsException e){
                   break;
               }
           }
            adds[i] = new BigInt(tmp);
            i++;
        }


        for(int j = 1; j < adds.length; j++){
            adds[j] = adds[j-1].add(adds[j]);
        }
        return adds[adds.length-1];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = number.length-1; i>=0; i--){
            result += number[i];
        }
        return result;
    }

    @Override
    public int compareTo(BigInt o) {
        if(number.length < o.number.length){
           return -1;
        }else if (number.length >  o.number.length){
            return 1;
        }else{
            for(int i = number.length-1; i>=0; i--){
                if(number[i]>o.number[i]) {
                    return 1;
                }else if(number[i]<o.number[i]){
                    return -1;
                }
            }
        }
        return 0;
    }
}
