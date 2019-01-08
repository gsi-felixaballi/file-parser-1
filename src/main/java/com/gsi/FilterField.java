package com.gsi;

import java.util.function.Function;

public enum FilterField {
    CITY(Person::getCity),
    ID(Person::getId);

    private Function<Person, String> extractor;

    public String of(Person p) {
        return this.extractor.apply(p);
    }

    FilterField(Function<Person, String> extractor) {
        this.extractor = extractor;
    }
}
