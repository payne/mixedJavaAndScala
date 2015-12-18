package sample2.impl

import sample2.Person

class PersonList {
    def find(name: String): Person = {
        new JavaPerson(name)
    }
}
