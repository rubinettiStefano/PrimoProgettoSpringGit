package com.generation.primoprogettospring;

import com.generation.primoprogettospring.bl.PersonBl;
import com.generation.primoprogettospring.entities.Cloth;
import com.generation.primoprogettospring.entities.Person;
import com.generation.primoprogettospring.repositories.ClothRepository;
import com.generation.primoprogettospring.repositories.PersonRepository;
import com.generation.primoprogettospring.services.CsvReaderWriter;
import com.generation.primoprogettospring.services.PersonCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class PrimoProgettoSpringApplication implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(PrimoProgettoSpringApplication.class, args);
    }


//    @Autowired
//    CsvReaderWriter<Person> lettoreCsv;

    @Autowired
    PersonCsvService pServ;

    @Override
    public void run(String... args) throws Exception
    {
//        pServ.importCsv("uno.csv",false);

        pServ.exportCsv();
//        List<Person> daFile = lettoreCsv.readCsv
//                (
//                        "uno.csv",
//                        rigaCsv ->
//                        {
//                            //id,name,surname,dob,language
//                            String[] spl = rigaCsv.split(",");
//                            Person p = new Person();
//                            p.setId(Long.parseLong(spl[0]));
//                            p.setName(spl[1]);
//                            p.setSurname(spl[2]);
//                            p.setDob(LocalDate.parse(spl[3]));
//                            p.setLanguage(spl[4]);
//                            return p;
//                        }
//                );
//
//        lettoreCsv.createCsv
//                (
//                        "clone.csv",
//                        "id,dob,language,name,surname",
//                        daFile,
//                        p-> p.getId()+","+p.getDob()+","+p.getLanguage()+","+p.getName()+","+p.getSurname()
//                );



    }
}
