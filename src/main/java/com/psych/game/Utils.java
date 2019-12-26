package com.psych.game;

import net.bytebuddy.agent.builder.AgentBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    public static List<Pair<String,String>> getQuestionAnswer(String fileName) throws FileNotFoundException {
        List<Pair<String,String>> list=new ArrayList<>();
        BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
        String question,answer;
        try{
            do {
                question = bufferedReader.readLine();
                answer = bufferedReader.readLine();
                if(question==null || answer==null || question.length() > Constants.MAX_QUESTION_LENGTH-1 || answer.length() > Constants.MAX_ANSWER_LENGTH-1){
                    System.out.println("skkiping the question:  "+question);
                    System.out.println("skkiping the answer:  "+answer);
                    continue;
                }
                list.add(new Pair(question,answer));
            }while(question!=null && answer!=null);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
