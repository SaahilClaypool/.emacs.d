_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/ExternalSubsetResolver.java
    public XMLInputSource getExternalSubset(XMLDTDDescription grammarDescription)

    /**
     * <p>Locates an external subset for documents which do not explicitly
     * provide one. If no external subset is provided, this method should
     * return <code>null</code>.</p>
     *
     * @param grammarDescription a description of the DTD
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/ExternalSubsetResolver.java
public interface ExternalSubsetResolver

/**
 * <p>This interface extends <code>XMLEntityResolver</code> providing
 * a method to resolve external subsets for documents which do not
 * explicitly provide one. The application can register an object that
 * implements this interface with the parser configuration. If registered,
 * it will be queried to locate an external subset when none is provided,
 * even for documents that do not contain DOCTYPE declarations. If the
 * registered external subset resolver does not provide an external subset
 * for a given document, it should return <code>null</code>.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/ExternalSubsetResolver.java
    public XMLInputSource getExternalSubset(XMLDTDDescription grammarDescription)

    /**
     * <p>Locates an external subset for documents which do not explicitly
     * provide one. If no external subset is provided, this method should
     * return <code>null</code>.</p>
     *
     * @param grammarDescription a description of the DTD
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/ExternalSubsetResolver.java
public interface ExternalSubsetResolver

/**
 * <p>This interface extends <code>XMLEntityResolver</code> providing
 * a method to resolve external subsets for documents which do not
 * explicitly provide one. The application can register an object that
 * implements this interface with the parser configuration. If registered,
 * it will be queried to locate an external subset when none is provided,
 * even for documents that do not contain DOCTYPE declarations. If the
 * registered external subset resolver does not provide an external subset
 * for a given document, it should return <code>null</code>.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 *
 */
