_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceFeature.java
   public boolean isEnabled() {

   /**
    * Returns <code>true</code> if this feature is enabled.
    *
    * @return <code>true</code> if and only if the feature is enabled .
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceFeature.java
   protected boolean enabled = false;

   /**
    * Specifies if the feature is enabled or disabled
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceFeature.java
   public abstract String getID();

   /**
    * Get the unique identifier for this WebServiceFeature.
    *
    * @return the unique identifier for this feature.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceFeature.java
public abstract class WebServiceFeature {

/**
 * A WebServiceFeature is used to represent a feature that can be
 * enabled or disabled for a web service.
 * <p>
 * The JAX-WS specification will define some standard features and
 * JAX-WS implementors are free to define additional features if
 * necessary.  Vendor specific features may not be portable so
 * caution should be used when using them. Each Feature definition
 * MUST define a <code>public static final String ID</code>
 * that can be used in the Feature annotation to refer
 * to the feature. This ID MUST be unique across all features
 * of all vendors.  When defining a vendor specific feature ID,
 * use a vendor specific namespace in the ID string.
 *
 * @see javax.xml.ws.RespectBindingFeature
 * @see javax.xml.ws.soap.AddressingFeature
 * @see javax.xml.ws.soap.MTOMFeature
 *
 * @since 2.1
 */
