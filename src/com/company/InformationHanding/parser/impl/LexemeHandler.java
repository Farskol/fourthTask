package com.company.InformationHanding.parser.impl;

import com.company.InformationHanding.entity.TextComponent;
import com.company.InformationHanding.entity.TextComposite;
import com.company.InformationHanding.parser.AbstractTextHandler;

import java.util.Arrays;
import java.util.List;

public class LexemeHandler implements AbstractTextHandler {
    LiteralHandler literalHandler = new LiteralHandler();
    @Override
    public TextComponent handleRequest(String string) {
        List<String> stringLexeme = Arrays.asList(string.split("\\s+"));
        TextComposite text = new TextComposite(" ");
        for (String str:stringLexeme){
            text.add(literalHandler.handleRequest(str));
        }
        return text;
    }
}
