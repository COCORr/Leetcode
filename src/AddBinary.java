public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charArray1=a.toCharArray();
        char[] charArray2=b.toCharArray();

        int len1=charArray1.length;
        int len2=charArray2.length;
        int lenofall = len1>len2? len1:len2;
        char[] ans=new char[lenofall];
        boolean push=false;

        while(len1>0&&len2>0){
            if (charArray1[len1-1]=='1'&&charArray2[len2-1]=='0'||
                    charArray1[len1-1]=='0'&&charArray2[len2-1]=='1'){
                if (push==true){
                    ans[lenofall-1]='0';
                    push=true;
                }else {
                    ans[lenofall-1]='1';
                }
            }else if (charArray1[len1-1]=='1'&&charArray2[len2-1]=='1'){
                if (push==true){
                    ans[lenofall-1]='1';
                    push=true;
                }else {
                    ans[lenofall-1]='0';
                    push=true;
                }
            }else {
                if (push==true){
                    ans[lenofall-1]='1';
                    push=false;
                }else {
                    ans[lenofall-1]='0';
                }
            }
            lenofall--;
            len1--;
            len2--;
        }

        while (len1>0){
            if (push==true){
                if (charArray1[len1-1]=='1'){
                    push=true;
                    ans[lenofall-1]='0';
                }else {
                    ans[lenofall-1]='1';
                    push=false;
                }
            }else {
                ans[lenofall-1]=charArray1[len1-1];
            }
            len1--;
            lenofall--;
        }
        while (len2>0){
            if (push==true){
                if (charArray2[len2-1]=='1'){
                    push=true;
                    ans[lenofall-1]='0';
                }else {
                    ans[lenofall-1]='1';
                    push=false;
                }
            }else {
                ans[lenofall-1]=charArray2[len2-1];
            }
            len2--;
            lenofall--;
        }
        if (push==true){
            return "1"+String.valueOf(ans);
        }else {
            return String.valueOf(ans);
        }
    }
}
