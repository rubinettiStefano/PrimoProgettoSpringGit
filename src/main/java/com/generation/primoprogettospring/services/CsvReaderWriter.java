package com.generation.primoprogettospring.services;

import com.generation.primoprogettospring.lambdas.ConverterFromCsv;
import com.generation.primoprogettospring.lambdas.ConverterToCsv;

import java.util.List;

public interface CsvReaderWriter<T>
{
    /**
     * Creare un csv a partire da lista di oggetti
     */
    void createCsv(String csvName,String intestazione, List<T> oggettiDaSalvare,ConverterToCsv<T> converter);

    List<T> readCsv(String csvName, ConverterFromCsv<T> converter);
}
