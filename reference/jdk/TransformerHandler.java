_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/TransformerHandler.java
    public Transformer getTransformer();

    /**
     * <p>Get the <code>Transformer</code> associated with this handler, which
     * is needed in order to set parameters and output properties.</p>
     *
     * @return <code>Transformer</code> associated with this
     *   <code>TransformerHandler</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/TransformerHandler.java
    public String getSystemId();

    /**
     * Get the base ID (URI or system ID) from where relative
     * URLs will be resolved.
     * @return The systemID that was set with {@link #setSystemId}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/TransformerHandler.java
    public void setSystemId(String systemID);

    /**
     * Set the base ID (URI or system ID) from where relative
     * URLs will be resolved.
     * @param systemID Base URI for the source tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/TransformerHandler.java
    public void setResult(Result result) throws IllegalArgumentException;

    /**
     * <p>Set  the <code>Result</code> associated with this
     * <code>TransformerHandler</code> to be used for the transformation.</p>
     *
     * @param result A <code>Result</code> instance, should not be
     *   <code>null</code>.
     *
     * @throws IllegalArgumentException if result is invalid for some reason.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/TransformerHandler.java
public interface TransformerHandler

/**
 * A TransformerHandler
 * listens for SAX ContentHandler parse events and transforms
 * them to a Result.
 */
