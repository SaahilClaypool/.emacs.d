_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/NormalizedStringAdapter.java
    protected static boolean isWhiteSpaceExceptSpace(char ch) {

    /**
     * Returns true if the specified char is a white space character
     * but not 0x20.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/NormalizedStringAdapter.java
        public String marshal(String s) {

    /**
     * No-op.
     *
     * Just return the same string given as the parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/annotation/adapters/NormalizedStringAdapter.java
public final class NormalizedStringAdapter extends XmlAdapter<String,String> {

/**
 * {@link XmlAdapter} to handle <tt>xs:normalizedString</tt>.
 *
 * <p>
 * Replaces any tab, CR, and LF by a whitespace character ' ',
 * as specified in <a href="http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace">the whitespace facet 'replace'</a>
 *
 * @author Kohsuke Kawaguchi, Martin Grebac
 * @since JAXB 2.0
 */
