package com.company.InformationHanding.entity;

import com.company.InformationHanding.exception.InformationHandingException;

public class Literal implements TextComponent {
    String literal;

    public Literal(String literal){
        this.literal = literal;
    }

    @Override
    public String createText() {
        return this.literal;
    }

    @Override
    public boolean add(TextComponent textComponent) throws InformationHandingException {
        throw new InformationHandingException("It is not possible to call this method on a single character");
    }

    @Override
    public boolean remove(TextComponent textComponent) throws  InformationHandingException{
        throw new InformationHandingException("It is not possible to call this method on a single character");
    }
}
