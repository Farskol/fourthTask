package com.company.InformationHanding.parser.impl;

import com.company.InformationHanding.entity.Literal;
import com.company.InformationHanding.entity.TextComponent;
import com.company.InformationHanding.entity.TextComposite;
import com.company.InformationHanding.parser.AbstractTextHandler;

import java.util.Arrays;
import java.util.List;

public class LiteralHandler implements AbstractTextHandler {

    @Override
    public TextComponent handleRequest(String string) {
        List<String> stringLiteral = Arrays.asList(string.split("\\s*"));
        TextComposite text = new TextComposite("");
        for (String str:stringLiteral){
            text.add(new Literal(str));
        }
        return text;
    }
}
