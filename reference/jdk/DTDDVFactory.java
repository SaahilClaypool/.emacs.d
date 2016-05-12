_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public abstract Map<String, DatatypeValidator> getBuiltInTypes();

    /**
     * get all built-in DVs, which are stored in a map keyed by the name
     *
     * @return      a map which contains all datatypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public abstract DatatypeValidator getBuiltInDV(String name);

    /**
     * return a dtd type of the given name
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public static final DTDDVFactory getInstance(String factoryClass) throws DVFactoryException {

    /**
     * Get an instance of DTDDVFactory implementation.
     *
     * @param factoryClass  name of the implementation to load.
     * @return  an instance of DTDDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public static final DTDDVFactory getInstance() throws DVFactoryException {

    /**
     * Get an instance of the default DTDDVFactory implementation.
     *
     * @return  an instance of DTDDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
public abstract class DTDDVFactory {

/**
 * The factory to create and return DTD types. The implementation should
 * store the created datatypes in static data, so that they can be shared by
 * multiple parser instance, and multiple threads.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: DTDDVFactory.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public abstract Map<String, DatatypeValidator> getBuiltInTypes();

    /**
     * get all built-in DVs, which are stored in a map keyed by the name
     *
     * @return      a map which contains all datatypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public abstract DatatypeValidator getBuiltInDV(String name);

    /**
     * return a dtd type of the given name
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public static final DTDDVFactory getInstance(String factoryClass) throws DVFactoryException {

    /**
     * Get an instance of DTDDVFactory implementation.
     *
     * @param factoryClass  name of the implementation to load.
     * @return  an instance of DTDDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
    public static final DTDDVFactory getInstance() throws DVFactoryException {

    /**
     * Get an instance of the default DTDDVFactory implementation.
     *
     * @return  an instance of DTDDVFactory implementation
     * @exception DVFactoryException  cannot create an instance of the specified
     *                                class name or the default class name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/DTDDVFactory.java
public abstract class DTDDVFactory {

/**
 * The factory to create and return DTD types. The implementation should
 * store the created datatypes in static data, so that they can be shared by
 * multiple parser instance, and multiple threads.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: DTDDVFactory.java,v 1.6 2010-11-01 04:39:43 joehw Exp $
 */
