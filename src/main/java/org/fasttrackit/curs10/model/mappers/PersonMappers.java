package org.fasttrackit.curs10.model.mappers;

import org.fasttrackit.curs10.model.Person;
import org.fasttrackit.curs10.model.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMappers {

    default Person customMapping(PersonEntity entity) {
        return new Person("Custom", "Cluj", 11);
    }

    @Mapping(target = "name", expression = "java(MapperUtils.extractName(entity))")
    Person toApi(PersonEntity entity);

    @Mapping(target = "firstName", expression = "java(MapperUtils.extractFirstName(person.name()))")
    @Mapping(target = "lastName", expression = "java(MapperUtils.extractLastName(person.name()))")
    PersonEntity toEntity(Person person);
}
