package com.generation.primoprogettospring.services;

public interface CsvService
{
    /**
     * Importa un csv sul db
     * Trasforma tutte le righe del csv
     * In oggetti che poi salva sul db
     */
    void importCsv(String csvName,boolean mantieniId);

    /**
     * Esportare la tabella di cui il servizio si occupa
     */
    void exportCsv();
}
