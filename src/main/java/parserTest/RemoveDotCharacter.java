package parserTest;

public class RemoveDotCharacter {
    public static void main(String[] args){
        String str = GetArticleFromFile.doc;
        char x = '.';
        System.out.println(removeChr(str,x));
    }

    public static String removeChr(String str, char x){
        StringBuilder strBuilder = new StringBuilder();
        char[] rmString = str.toCharArray();
        for(int i=0; i<rmString.length; i++){
            if(rmString[i] == x){

            } else {
                strBuilder.append(rmString[i]);
            }
        }
        return strBuilder.toString();
    }
}