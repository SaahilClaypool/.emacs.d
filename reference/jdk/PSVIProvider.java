_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
    public AttributePSVI getAttributePSVIByName(String uri,
                                                String localname);

    /**
     * Provides <code>AttributePSVI</code> given the namespace name and the
     * local name of an attribute information item in the current element's
     * attribute list. The method must be called by an application while in
     * the scope of the methods which report the start and end of an element
     * at a point where the attribute list is available. For example, for
     * SAX the method must be called while in the scope of the document
     * handler's <code>startElement</code> call. If the method is called
     * outside of the specified scope, the return value is undefined.
     * @param uri The namespace name of an attribute.
     * @param localname The local name of an attribute.
     * @return The post schema validation properties of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
    public AttributePSVI getAttributePSVI(int index);

    /**
     * Provides <code>AttributePSVI</code> given the index of an attribute
     * information item in the current element's attribute list. The method
     * must be called by an application while in the scope of the methods
     * which report the start and end of an element at a point where the
     * attribute list is available. For example, for SAX the method must be
     * called while in the scope of the document handler's
     * <code>startElement</code> call. If the method is called outside of
     * the specified scope, the return value is undefined.
     * @param index The attribute index.
     * @return The post schema validation properties of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
public interface PSVIProvider {

/**
 * This interface provides access to the post schema validation infoset for an
 * API that provides a streaming document infoset, such as SAX, XNI, and
 * others.
 * <p>For implementations that would like to provide access to the PSVI in a
 * streaming model, a parser object should also implement the
 * <code>PSVIProvider</code> interface. Within the scope of the methods
 * handling the start and end of an element, applications may use the
 * <code>PSVIProvider</code> to retrieve the PSVI related to the element and
 * its attributes.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
    public AttributePSVI getAttributePSVIByName(String uri,
                                                String localname);

    /**
     * Provides <code>AttributePSVI</code> given the namespace name and the
     * local name of an attribute information item in the current element's
     * attribute list. The method must be called by an application while in
     * the scope of the methods which report the start and end of an element
     * at a point where the attribute list is available. For example, for
     * SAX the method must be called while in the scope of the document
     * handler's <code>startElement</code> call. If the method is called
     * outside of the specified scope, the return value is undefined.
     * @param uri The namespace name of an attribute.
     * @param localname The local name of an attribute.
     * @return The post schema validation properties of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
    public AttributePSVI getAttributePSVI(int index);

    /**
     * Provides <code>AttributePSVI</code> given the index of an attribute
     * information item in the current element's attribute list. The method
     * must be called by an application while in the scope of the methods
     * which report the start and end of an element at a point where the
     * attribute list is available. For example, for SAX the method must be
     * called while in the scope of the document handler's
     * <code>startElement</code> call. If the method is called outside of
     * the specified scope, the return value is undefined.
     * @param index The attribute index.
     * @return The post schema validation properties of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/PSVIProvider.java
public interface PSVIProvider {

/**
 * This interface provides access to the post schema validation infoset for an
 * API that provides a streaming document infoset, such as SAX, XNI, and
 * others.
 * <p>For implementations that would like to provide access to the PSVI in a
 * streaming model, a parser object should also implement the
 * <code>PSVIProvider</code> interface. Within the scope of the methods
 * handling the start and end of an element, applications may use the
 * <code>PSVIProvider</code> to retrieve the PSVI related to the element and
 * its attributes.
 */
