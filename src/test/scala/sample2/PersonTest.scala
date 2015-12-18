package sample2

import _root_.junit.framework.TestCase
import sample2.impl.{JavaPerson, PersonImpl}

class PersonTest extends TestCase {

  // FIXME: use a Scala test framework to run a test
  def testCanCreateScalaPersonImpl(): Unit = {
    def person: Person = new PersonImpl("bob smith")
    person
  }

  def testCanCreateJavaPersonImpl(): Unit = {
    def person: Person = new JavaPerson("bob smith")
    person
  }

}
