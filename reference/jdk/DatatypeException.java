_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public String getMessage() {

    /**
     * Overrides this method to get the formatted&localized error message.
     *
     * REVISIT: the system locale is used to load the property file.
     *          do we want to allow the appilcation to specify a
     *          different locale?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public Object[] getArgs() {

    /**
     * Return the list of error arguments
     *
     * @return  error arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public String getKey() {

    /**
     * Return the error code
     *
     * @return  error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public DatatypeException(String key, Object[] args) {

    /**
     * Create a new datatype exception by providing an error code and a list
     * of error message substitution arguments.
     *
     * @param key  error code
     * @param args error arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    static final long serialVersionUID = 1940805832730465578L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
public class DatatypeException extends Exception {

/**
 * Base class for datatype exceptions. For DTD types, the exception can be
 * created from an error message. For Schema types, it needs an error code
 * (as defined in Appendix C of the structure spec), plus an array of arguents,
 * for error message substitution.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: DatatypeException.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public String getMessage() {

    /**
     * Overrides this method to get the formatted&localized error message.
     *
     * REVISIT: the system locale is used to load the property file.
     *          do we want to allow the appilcation to specify a
     *          different locale?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public Object[] getArgs() {

    /**
     * Return the list of error arguments
     *
     * @return  error arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public String getKey() {

    /**
     * Return the error code
     *
     * @return  error code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    public DatatypeException(String key, Object[] args) {

    /**
     * Create a new datatype exception by providing an error code and a list
     * of error message substitution arguments.
     *
     * @param key  error code
     * @param args error arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
    static final long serialVersionUID = 1940805832730465578L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DatatypeException.java
public class DatatypeException extends Exception {

/**
 * Base class for datatype exceptions. For DTD types, the exception can be
 * created from an error message. For Schema types, it needs an error code
 * (as defined in Appendix C of the structure spec), plus an array of arguents,
 * for error message substitution.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: DatatypeException.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */
