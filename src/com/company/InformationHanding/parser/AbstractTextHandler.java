package com.company.InformationHanding.parser;

import com.company.InformationHanding.entity.TextComponent;

import java.util.List;

public interface AbstractTextHandler {
    TextComponent handleRequest(String string);
}
