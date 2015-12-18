package sample2.impl

import sample2.Person

/**
 * Immutable implementation of {@link Person}.
 */
class PersonImpl(val name: String) extends Person
{
    def getName() = name
}
