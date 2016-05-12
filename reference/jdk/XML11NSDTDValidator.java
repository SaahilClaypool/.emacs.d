_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    protected void endNamespaceScope(QName element, Augmentations augs, boolean isEmpty)

    /** Handles end element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    protected final void startNamespaceScope(QName element, XMLAttributes attributes, Augmentations augs)

    /** Bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    private QName fAttributeQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
public class XML11NSDTDValidator extends XML11DTDValidator {

/**
 * The DTD validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p> Formerly, this component also handled DTD events and grammar construction.
 * To facilitate the development of a meaningful DTD grammar caching/preparsing
 * framework, this functionality has been moved into the XMLDTDLoader
 * class.  Therefore, this class no longer implements the DTDFilter
 * or DTDContentModelFilter interfaces.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/validation/dynamic</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 *

 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    protected void endNamespaceScope(QName element, Augmentations augs, boolean isEmpty)

    /** Handles end element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    protected final void startNamespaceScope(QName element, XMLAttributes attributes, Augmentations augs)

    /** Bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
    private QName fAttributeQName = new QName();

    /** Attribute QName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XML11NSDTDValidator.java
public class XML11NSDTDValidator extends XML11DTDValidator {

/**
 * The DTD validator. The validator implements a document
 * filter: receiving document events from the scanner; validating
 * the content and structure; augmenting the InfoSet, if applicable;
 * and notifying the parser of the information resulting from the
 * validation process.
 * <p> Formerly, this component also handled DTD events and grammar construction.
 * To facilitate the development of a meaningful DTD grammar caching/preparsing
 * framework, this functionality has been moved into the XMLDTDLoader
 * class.  Therefore, this class no longer implements the DTDFilter
 * or DTDContentModelFilter interfaces.
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/namespaces</li>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/validation/dynamic</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *  <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 * </ul>
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Michael Glavassevich, IBM
 *

 */
