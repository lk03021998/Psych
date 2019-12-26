package com.psych.game;

import com.psych.game.model.Game_mode;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final int MAX_QUESTION_LENGTH=1000;
    public  static final int MAX_ROUNDS=100;
    public static final int MAX_ANSWER_LENGTH = 1000;
    public static final Map<String, Game_mode> FILES = new HashMap<>();
    static {
        FILES.put("qa_facts.txt",Game_mode.IS_THIS_A_FACT);
        FILES.put("qa_unscramble.txt",Game_mode.UNSCRAMBLE);
        FILES.put("qa_word_up.txt",Game_mode.WORD_UP);
    }
}
