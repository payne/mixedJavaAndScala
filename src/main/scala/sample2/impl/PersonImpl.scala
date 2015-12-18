package sample2.impl

import sample2.Person

/**
 * Immutable implementation of {@link Person}.
 */
class PersonImpl(val name: String) extends Person
{
    println("Hey!   this is some scala running now.  :-)")

    def getName() = name
}
