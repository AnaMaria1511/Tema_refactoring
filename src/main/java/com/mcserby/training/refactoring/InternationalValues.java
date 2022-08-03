package com.mcserby.training.refactoring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class InternationalValues {

    static Map<String, String> mapValues = new HashMap<>();

    public InternationalValues() {
        value();
    }

    public static Map<String, String> value() {
        Path path = Paths.get("src/values.txt");
        try (Stream<String> lines = Files.lines(path)){
            lines.forEach(s-> mapValues.put(s,null));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return mapValues;
    }


    public Details getValues (String str){
        if(mapValues.containsKey(str))
            return new Details(str,null);
        return null;
    }




    /*public Details getUk() {
        return uk;
    }

    public Details getNl() {
        return nl;
    }

    public Details getDe() {
        return de;
    }

    public Details getFr() {
        return fr;
    }

    public Details getEs() {
        return es;
    }

    public Details getIt() {
        return it;
    }

    public Details getAt() {
        return at;
    }

    public Details getChFr() {
        return chFr;
    }

    public Details getChDe() {
        return chDe;
    }

    public Details getRu() {
        return ru;
    }

    public Details getHr() {
        return hr;
    }

    public Details getGr() {
        return gr;
    }

    public Details getSl() {
        return sl;
    }

    public Details getChIt() {
        return chIt;
    }

    public Details getBeFr() {
        return beFr;
    }

    public Details getLuDe() {
        return luDe;
    }

    public Details getLi() {
        return li;
    }

    public Details getPl() {
        return pl;
    }

    public Details getBl() {
        return bl;
    }

    public Details getUa() {
        return ua;
    }

    public Details getCz() {
        return cz;
    }

    public Details getSv() {
        return sv;
    }

    public Details getCaEs() {
        return caEs;
    }

    public Details getZh() {
        return zh;
    }

    public Details getBeNl() {
        return beNl;
    }

    public Details getLuFr() {
        return luFr;
    }*/
}
