_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/DefaultHandler2.java
    public InputSource resolveEntity (String publicId, String systemId)

    /**
     * Invokes
     * {@link EntityResolver2#resolveEntity EntityResolver2.resolveEntity()}
     * with null entity name and base URI.
     * You only need to override that method to use this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/DefaultHandler2.java
    public InputSource resolveEntity (String name, String publicId,
            String baseURI, String systemId)

    /**
     * Tells the parser to resolve the systemId against the baseURI
     * and read the entity text from that resulting absolute URI.
     * Note that because the older
     * {@link DefaultHandler#resolveEntity DefaultHandler.resolveEntity()},
     * method is overridden to call this one, this method may sometimes
     * be invoked with null <em>name</em> and <em>baseURI</em>, and
     * with the <em>systemId</em> already absolutized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/DefaultHandler2.java
    public InputSource getExternalSubset (String name, String baseURI)

    /**
     * Tells the parser that if no external subset has been declared
     * in the document text, none should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/DefaultHandler2.java
    public DefaultHandler2 () { }

    /** Constructs a handler which ignores all parsing events. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/DefaultHandler2.java
public class DefaultHandler2 extends DefaultHandler

/**
 * This class extends the SAX2 base handler class to support the
 * SAX2 {@link LexicalHandler}, {@link DeclHandler}, and
 * {@link EntityResolver2} extensions.  Except for overriding the
 * original SAX1 {@link DefaultHandler#resolveEntity resolveEntity()}
 * method the added handler methods just return.  Subclassers may
 * override everything on a method-by-method basis.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * </blockquote>
 *
 * <p> <em>Note:</em> this class might yet learn that the
 * <em>ContentHandler.setDocumentLocator()</em> call might be passed a
 * {@link Locator2} object, and that the
 * <em>ContentHandler.startElement()</em> call might be passed a
 * {@link Attributes2} object.
 *
 * @since SAX 2.0 (extensions 1.1 alpha)
 * @author David Brownell
 */
