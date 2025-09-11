package com.generation.primoprogettospring.services;

import com.generation.primoprogettospring.entities.Person;
import com.generation.primoprogettospring.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class PersonCsvService implements CsvService
{
    @Autowired
    CsvReaderWriter<Person> csv;
    @Autowired
    PersonRepository repo;

    /**
     * Farai meglio a mettere il csv con questo ordine
     * se no non lo accetto
     * id,name,surname,dob,language
     * @param csvName
     */
    @Override
    public void importCsv(String csvName,boolean mantieniId)
    {
        List<Person> listaDaCsv = csv.readCsv
                (
                        csvName,
                        rigaCsv ->
                        {
                            //id,name,surname,dob,language
                            String[] spl = rigaCsv.split(",");
                            Person p = new Person();
                            p.setId(mantieniId ? Long.parseLong(spl[0]) : null);
                            p.setName(spl[1]);
                            p.setSurname(spl[2]);
                            p.setDob(LocalDate.parse(spl[3]));
                            p.setLanguage(spl[4]);
                            return p;
                        }
                );


        repo.saveAll(listaDaCsv);
    }

    @Override
    public void exportCsv()
    {
        List<Person> daDb = repo.findAll();
        String dataFomattata = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm"));
        csv.createCsv
                (
                        "export_"+ dataFomattata,
                        "id,name,surname,dob,language",
                        daDb,
                        p-> p.getId()+","+p.getName()+","+p.getSurname()+","+p.getDob()+","+p.getLanguage()
                );
    }
}
