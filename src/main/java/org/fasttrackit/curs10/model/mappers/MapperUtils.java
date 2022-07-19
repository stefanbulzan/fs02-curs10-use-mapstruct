package org.fasttrackit.curs10.model.mappers;

import org.fasttrackit.curs10.model.PersonEntity;

public class MapperUtils {
    static String extractName(PersonEntity entity) {
        return entity.getFirstName() + " " + entity.getLastName();
    }

    static String extractLastName(String name) {
        return name.contains(" ") ? name.split(" ")[1] : "";
    }

    static String extractFirstName(String name) {
        return name.contains(" ") ? name.split(" ")[0] : name;
    }

}
