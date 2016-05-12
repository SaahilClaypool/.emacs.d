_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLReporter.java
    public void report(String message, String errorType, Object relatedInformation, Location location)

    /**

     * Report the desired message in an application specific format.

     * Only warnings and non-fatal errors should be reported through

     * this interface.

     * Fatal errors should be thrown as XMLStreamException.

     *

     * @param message the error message

     * @param errorType an implementation defined error type

     * @param relatedInformation information related to the error, if available

     * @param location the location of the error, if available

     * @throws XMLStreamException

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/XMLReporter.java
public interface XMLReporter {

/**
 * This interface is used to report non-fatal errors.
 * Only warnings should be echoed through this interface.
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
