package com.company.InformationHanding.parser.impl;

import com.company.InformationHanding.entity.TextComponent;
import com.company.InformationHanding.entity.TextComposite;
import com.company.InformationHanding.parser.AbstractTextHandler;

import java.util.Arrays;
import java.util.List;

public class ParagraphHandler implements AbstractTextHandler {
    private SentenceHandler sentenceHandler = new SentenceHandler();

    @Override
    public TextComponent handleRequest(String string) {
        List<String> stringParagraphs = Arrays.asList(string.split("(?<=\\D)\\s{4}(?=\\p{Lu})"));
        stringParagraphs.set(0,stringParagraphs.get(0).trim());
        TextComposite text = new TextComposite("   ");
        for(String str:stringParagraphs){
            text.add(sentenceHandler.handleRequest(str));
        }
        return text;
    }
}
