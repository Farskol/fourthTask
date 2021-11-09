package com.company.InformationHanding.entity;

import com.company.InformationHanding.exception.InformationHandingException;

public interface TextComponent {

    String createText();
    boolean add(TextComponent textComponent) throws InformationHandingException;
    boolean remove(TextComponent textComponent) throws InformationHandingException;

}
