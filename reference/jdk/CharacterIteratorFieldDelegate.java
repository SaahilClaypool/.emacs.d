_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIteratorFieldDelegate.java
    public AttributedCharacterIterator getIterator(String string) {

    /**
     * Returns an <code>AttributedCharacterIterator</code> that can be used
     * to iterate over the resulting formatted String.
     *
     * @pararm string Result of formatting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIteratorFieldDelegate.java
    private int size;

    /**
     * Running count of the number of characters that have
     * been encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/CharacterIteratorFieldDelegate.java
class CharacterIteratorFieldDelegate implements Format.FieldDelegate {

/**
 * CharacterIteratorFieldDelegate combines the notifications from a Format
 * into a resulting <code>AttributedCharacterIterator</code>. The resulting
 * <code>AttributedCharacterIterator</code> can be retrieved by way of
 * the <code>getIterator</code> method.
 *
 */
