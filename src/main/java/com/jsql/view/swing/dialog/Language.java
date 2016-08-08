package com.jsql.view.swing.dialog;

import javax.swing.Icon;

import com.jsql.view.swing.HelperUi;

public enum Language {
    
    AR("Arabic", HelperUi.FLAG_AR),
    RU("Russian", HelperUi.FLAG_RU), 
    ZH("Chinese", HelperUi.FLAG_ZH), 
    TR("Turkish", HelperUi.FLAG_TR), 
    EN("English", HelperUi.FLAG_EN), 
    FR("French", HelperUi.FLAG_FR), 
    HI("Hindi", HelperUi.FLAG_HI), 
    CS("Czech", HelperUi.FLAG_CS), 
    OT("another language", null);

    String stringLang;
    Icon flag;
    
    private Language(String stringLang, Icon flag) {
        this.stringLang = stringLang;
        this.flag = flag;
    }
    
    public Icon getFlag() {
        return this.flag;
    }
    
    @Override
    public String toString() {
        return stringLang;
    }
}