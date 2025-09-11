package com.generation.primoprogettospring.services;

import com.generation.primoprogettospring.lambdas.ConverterFromCsv;
import com.generation.primoprogettospring.lambdas.ConverterToCsv;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class CsvReaderWriterImpl<T> implements CsvReaderWriter<T>
{



    @Override
    public void createCsv(String csvName, String intestazione,List<T> oggettiDaSalvare,ConverterToCsv<T> converter)
    {
        try
        {
            FileWriter fw = new FileWriter(csvName);
            StringBuilder content = new StringBuilder(intestazione);

            for(T t:oggettiDaSalvare)
                content.append("\n"+converter.convert(t));

            fw.write(content.toString());
            fw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override                               //lambda
    public List<T> readCsv(String csvName, ConverterFromCsv<T> converter)
    {
        try
        {
            //leggere il file
            Scanner sc = new Scanner(new File(csvName));
            sc.nextLine();//bruciamo intestazione
            List<T> res = new ArrayList<>();

            while(sc.hasNextLine())
                res.add(converter.convert(sc.nextLine()));
            sc.close();
            return res;
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
