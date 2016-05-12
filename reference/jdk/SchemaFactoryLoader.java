_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryLoader.java
    public abstract SchemaFactory newFactory(String schemaLanguage);

    /**
     * Creates a new {@link SchemaFactory} object for the specified
     * schema language.
     *
     * @param schemaLanguage
     *      See <a href="SchemaFactory.html#schemaLanguage">
     *      the list of available schema languages</a>.
     *
     * @throws NullPointerException
     *      If the <tt>schemaLanguage</tt> parameter is null.
     *
     * @return <code>null</code> if the callee fails to create one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryLoader.java
    protected SchemaFactoryLoader() {

    /**
     * A do-nothing constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/validation/SchemaFactoryLoader.java
public abstract class SchemaFactoryLoader {

/**
 * <p>Factory that creates {@link SchemaFactory}.</p>
 *
 * <p><b>DO NOT USE THIS CLASS</b></p>
 *
 * <p>
 * This class was introduced as a part of an early proposal during the
 * JSR-206 standardization process. The proposal was eventually abandoned
 * but this class accidentally remained in the source tree, and made its
 * way into the final version.
 * </p><p>
 * This class does not participate in any JAXP 1.3 or JAXP 1.4 processing.
 * It must not be used by users or JAXP implementations.
 * </p>
 *
 * @author <a href="Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @since 1.5
 */
