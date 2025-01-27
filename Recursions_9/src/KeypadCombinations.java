public class KeypadCombinations {
    static void combination(String dig, String[] kp, String res) {
        if(dig.length()==0){
            System.out.println(res+" ");
            return;
        }
        int currNum =  dig.charAt(0) - '0'; //2
        String CurrChoices=kp[currNum];//abc

        for(int i=0;i<CurrChoices.length();i++){
            combination(dig.substring(1),kp,res+CurrChoices.charAt(i));
        }

    }

    public static void main(String[] args) {
        String dig = "23";
        String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
