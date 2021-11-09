package com.company.InformationHanding.parser.impl;

import com.company.InformationHanding.entity.TextComponent;
import com.company.InformationHanding.entity.TextComposite;
import com.company.InformationHanding.parser.AbstractTextHandler;

import java.util.Arrays;
import java.util.List;

public class SentenceHandler implements AbstractTextHandler {
    private LexemeHandler lexemeHandler = new LexemeHandler();

    @Override
    public TextComponent handleRequest(String string) {
        List<String> stringSentence = Arrays.asList(string.split("(?<=[.!?])\\s(?=\\p{Lu})"));
        TextComposite text = new TextComposite("");
        for (String str: stringSentence){
            text.add(lexemeHandler.handleRequest(str));
        }
        return text;
    }
}
