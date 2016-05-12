_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/CollapsedStringAdapter.java
    protected static boolean isWhiteSpace(char ch) {

    /** returns true if the specified char is a white space character. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/CollapsedStringAdapter.java
    public String marshal(String s) {

    /**
     * No-op.
     *
     * Just return the same string given as the parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/CollapsedStringAdapter.java
public class CollapsedStringAdapter extends XmlAdapter<String,String> {

/**
 * Built-in {@link XmlAdapter} to handle <tt>xs:token</tt> and its derived types.
 *
 * <p>
 * This adapter removes leading and trailing whitespaces, then truncate any
 * sequnce of tab, CR, LF, and SP by a single whitespace character ' '.
 *
 * @author Kohsuke Kawaguchi
 * @since JAXB 2.0
 */
