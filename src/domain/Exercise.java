package domain;

public class Exercise {
    public static int Calculate(int [] milit_numbs){
        int counter = 0;        
        for(int i = 0; i < 100000; i++){
            String numb = Integer.toString(i);
            if(numb.contains("4") || numb.contains("13")){
                counter++;
            }
        }
        return counter;
    }
}

