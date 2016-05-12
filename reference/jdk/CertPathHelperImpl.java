_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathHelperImpl.java
    synchronized static void initialize() {

    /**
     * Initialize the helper framework. This method must be called from
     * the static initializer of each class that is the target of one of
     * the methods in this class. This ensures that the helper is initialized
     * prior to a tunneled call from the Sun provider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/cert/CertPathHelperImpl.java
class CertPathHelperImpl extends CertPathHelper {

/**
 * Helper class that allows the Sun CertPath provider to access
 * implementation dependent APIs in CertPath framework.
 *
 * @author Andreas Sterbenz
 */
