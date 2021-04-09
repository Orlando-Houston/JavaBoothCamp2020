package August;

public class StringArray1 {
    public static void arraysString(String word){
        word = word+" ";
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                count++;
            }

        }
        //System.out.println(count);
        String[] myArray = new String[count];
        int wordIndex = 0;
        String oneWord ="";
        for(int j = 0; j < word.length();j++) {
            if (word.charAt(j) != ' ') {
                oneWord = oneWord + word.charAt(j);
            } else {
                myArray[wordIndex] = oneWord;
                wordIndex++;
                oneWord = "";
            }

        }}}


