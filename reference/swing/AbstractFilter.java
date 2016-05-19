_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    protected abstract void writeSpecial(int b) throws IOException;

    /**
     * Subclasses must provide an implementation of this method which
     * accepts a single special byte. No translation is performed
     * on specials.
     *
     * @param b The byte written to the OutputStream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    protected abstract void write(char ch) throws IOException;

    /**
     * Subclasses must provide an implementation of this method which
     * accepts a single (non-special) character.
     *
     * @param ch The character written to the OutputStream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    public void write(String s)

    /**
     * Hopefully, all subclasses will override this method to accept strings
     * of text, but if they don't, AbstractFilter's implementation
     * will spoon-feed them via <code>write(char)</code>.
     *
     * @param s The string of non-special characters written to the
     *          OutputStream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    public void write(byte[] buf, int off, int len)

    /**
     * Implements the buffer-at-a-time write method for greater
     * efficiency.
     *
     * <p> <strong>PENDING:</strong> Does <code>write(byte[])</code>
     * call <code>write(byte[], int, int)</code> or is it the other way
     * around?
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    public void write(int b)

    /**
     * Implements the abstract method of OutputStream, of which this class
     * is a subclass.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    public void readFromStream(InputStream in)

    /**
     * A convenience method that reads text from a FileInputStream
     * and writes it to the receiver.
     * The format in which the file
     * is read is determined by the concrete subclass of
     * AbstractFilter to which this method is sent.
     * <p>This method does not close the receiver after reaching EOF on
     * the input stream.
     * The user must call <code>close()</code> to ensure that all
     * data are processed.
     *
     * @param in      An InputStream providing text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    static final boolean allSpecialsTable[];

    /** A specials table which indicates that all characters are special */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    static final boolean noSpecialsTable[];

    /** A specials table which indicates that no characters are special */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    static final char latin1TranslationTable[];

    /** A translation table which does ISO Latin-1 (trivial) */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    protected boolean specialsTable[];

    /** A table indicating which byte values should be interpreted as
     *  characters and which should be treated as formatting codes */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
    protected char translationTable[];

    /** A table mapping bytes to characters */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/rtf/AbstractFilter.java
abstract class AbstractFilter extends OutputStream

/**
 * A generic superclass for streams which read and parse text
 * consisting of runs of characters interspersed with occasional
 * ``specials'' (formatting characters).
 *
 * <p> Most of the functionality
 * of this class would be redundant except that the
 * <code>ByteToChar</code> converters
 * are suddenly private API. Presumably this class will disappear
 * when the API is made public again. (sigh) That will also let us handle
 * multibyte character sets...
 *
 * <P> A subclass should override at least <code>write(char)</code>
 * and <code>writeSpecial(int)</code>. For efficiency's sake it's a
 * good idea to override <code>write(String)</code> as well. The subclass'
 * initializer may also install appropriate translation and specials tables.
 *
 * @see OutputStream
 */
