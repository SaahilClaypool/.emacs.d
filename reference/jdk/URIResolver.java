_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/URIResolver.java
    public Source resolve(String href, String base)

    /**
     * Called by the processor when it encounters
     * an xsl:include, xsl:import, or document() function.
     *
     * @param href An href attribute, which may be relative or absolute.
     * @param base The base URI against which the first argument will be made
     * absolute if the absolute URI is required.
     *
     * @return A Source object, or null if the href cannot be resolved,
     * and the processor should try to resolve the URI itself.
     *
     * @throws TransformerException if an error occurs when trying to
     * resolve the URI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/URIResolver.java
public interface URIResolver {

/**
 * <p>An object that implements this interface that can be called by the processor
 * to turn a URI used in document(), xsl:import, or xsl:include into a Source object.
 */
