_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private static final String CURRENT_ELEMENT_NODE = Constants.XERCES_PROPERTY_PREFIX + Constants.CURRENT_ELEMENT_NODE_PROPERTY;

    /** Support current-element-node property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fResourceResolverChanged = false;

    /** Flag for tracking whether the resource resolver changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fErrorHandlerChanged = false;

    /** Flag for tracking whether the error handler changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fConfigurationChanged = false;

    /** Flag for tracking whether features/properties changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private StAXValidatorHelper fStaxValidatorHelper;

    /** StAX validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private StreamValidatorHelper fStreamValidatorHelper;

    /** Stream validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private DOMValidatorHelper fDOMValidatorHelper;

    /** DOM validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private ValidatorHandlerImpl fSAXValidatorHelper;

    /** SAX validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
final class ValidatorImpl extends Validator implements PSVIProvider {

/**
 * <p>Implementation of Validator for W3C XML Schemas.</p>
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author Michael Glavassevich, IBM
 * @author <a href="mailto:Sunitha.Reddy@Sun.com">Sunitha Reddy</a>
 * @version $Id: ValidatorImpl.java,v 1.10 2010-11-01 04:40:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private static final String CURRENT_ELEMENT_NODE = Constants.XERCES_PROPERTY_PREFIX + Constants.CURRENT_ELEMENT_NODE_PROPERTY;

    /** Support current-element-node property */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fResourceResolverChanged = false;

    /** Flag for tracking whether the resource resolver changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fErrorHandlerChanged = false;

    /** Flag for tracking whether the error handler changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private boolean fConfigurationChanged = false;

    /** Flag for tracking whether features/properties changed since last reset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private StAXValidatorHelper fStaxValidatorHelper;

    /** StAX validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private StreamValidatorHelper fStreamValidatorHelper;

    /** Stream validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private DOMValidatorHelper fDOMValidatorHelper;

    /** DOM validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private ValidatorHandlerImpl fSAXValidatorHelper;

    /** SAX validator helper. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ValidatorImpl.java
final class ValidatorImpl extends Validator implements PSVIProvider {

/**
 * <p>Implementation of Validator for W3C XML Schemas.</p>
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author Michael Glavassevich, IBM
 * @author <a href="mailto:Sunitha.Reddy@Sun.com">Sunitha Reddy</a>
 * @version $Id: ValidatorImpl.java,v 1.10 2010-11-01 04:40:08 joehw Exp $
 */
