package com.company.InformationHanding.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent{
    private List<TextComponent> components;
    private String textComponentName;

    public TextComposite(String textComponentName){
        this.components = new ArrayList<>();
        this.textComponentName = textComponentName;
    }

    @Override
    public String createText() {
        StringBuilder string = new StringBuilder("");
        for (TextComponent textComponent:this.components){
            string.append(textComponentName)
                    .append(textComponent.createText());
        }
        return string.toString();
    }

    @Override
    public boolean add(TextComponent textComponent) {
        return this.components.add(textComponent);
    }

    @Override
    public boolean remove(TextComponent textComponent) {
        return this.components.remove(textComponent);
    }

    public String getComponentName(){
        return this.textComponentName;
    }

    public void setComponentName(String componentName){
        this.textComponentName = componentName;
    }
}
