_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ParserDelegator.java
    static InputStream getResourceAsStream(final String name) {

    /**
     * Fetch a resource relative to the ParserDelegator classfile.
     * If this is called on 1.2 the loading will occur under the
     * protection of a doPrivileged call to allow the ParserDelegator
     * to function when used in an applet.
     *
     * @param name the name of the resource, relative to the
     *  ParserDelegator class.
     * @returns a stream representing the resource
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ParserDelegator.java
public class ParserDelegator extends HTMLEditorKit.Parser implements Serializable {

/**
 * Responsible for starting up a new DocumentParser
 * each time its parse method is invoked. Stores a
 * reference to the dtd.
 *
 * @author  Sunita Mani
 */
