package com.psych.game.controller;

import com.psych.game.Constants;
import com.psych.game.Pair;
import com.psych.game.Utils;
import com.psych.game.model.Game_mode;
import com.psych.game.model.Question;
import com.psych.game.repository.QuestionRepository;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/dev")
public class PopulateDB {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/add-questions")
    public void putAllQuestion() throws IOException {
        for(Map.Entry<String,Game_mode> entry: Constants.FILES.entrySet()){
            int qNum=0;
            String fileName=entry.getKey();
            Game_mode gameMode=entry.getValue();

            for(Pair<String,String> qa: Utils.getQuestionAnswer(fileName)) {
                Question q = new Question();
                q.setQuestionText(qa.getFirst());
                q.setCorrectAnswer(qa.getSecond());
                q.setGameMode(gameMode);
                questionRepository.save(q);
                qNum++;

                // THIS NEEDS TO BE REMOVED
                if(qNum==100)
                    break;

            }

        }
    }
}
