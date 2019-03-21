package chap01.nestedclasses.member;

public class CaseOfThePrivateInterface {

    // Private Interfaces
    // The interface itself does not have to be public, though.
    // Just like any inner class, an inner interface can be private.
    // This means that the interface can only be referred to within the current outer class.
    private interface Secret {
        public void shh();
    }

    class DontTell implements Secret {
        public void shh() {
        }
    }
}
