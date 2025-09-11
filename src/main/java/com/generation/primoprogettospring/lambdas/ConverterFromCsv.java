package com.generation.primoprogettospring.lambdas;

public interface ConverterFromCsv<T>
{
    T convert(String rigaCsv);
}
/*
r -> {
        String[] splitted = r.split(",");
        Person p=Person.builder()
        .id(Long.parseLong(splitted[0]))
        .nome(splitted[1])
        .build();
        return p;
      }


 */
