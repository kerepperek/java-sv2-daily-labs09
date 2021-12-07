package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words){
        List<String> result =new ArrayList<>();
        if(words.size()>0) {
            int minLength = words.get(0).length();

            for (String word :words){
             if(minLength>word.length()){
                 minLength=word.length();
             }
            }
            for (String word :words){
                if(word.length()==minLength){
                    result.add(word);
                }
            }
        }
        return result;
    }
}
