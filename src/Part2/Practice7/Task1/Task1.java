package Part2.Practice7.Task1;

public class Task1 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563, а Маша - 30000 рублей";
        text = text.replace("," ,"");
        text = text.replace("-","");
        String[] words = text.split(" ");

        int first_value = get_income(words, "Вася");
        int second_value = get_income(words, "Маша");

        System.out.println(first_value + second_value);
    }

    static int get_income(String[] words, String name){
        int length = words.length;
        int value = 0;

        for(int i=0; i< length; i++){
            if (words[i].equals(name)){
                while(i<length){
                    try
                    {
                        value = Integer.valueOf(words[i]);
                        return value;
                    }
                    catch (NumberFormatException e)
                    {
                        i++;
                        continue;
                    }

                    //break;
                }

            }
        }

        return value;
    }


}
