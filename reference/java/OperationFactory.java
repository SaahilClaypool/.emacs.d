_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/OperationFactory.java
public abstract class OperationFactory {

/** This is a static factory class for commonly used operations
* for property parsing.  The following operations are supported:
* <ul>
* <li>maskErrorAction( Operation op ) executes op and returns the result.  If op throws an
* exception, the result is null.
* <li>indexAction( int arg ) returns the [arg] element of value, which must be an Object[]</li>
* <li>identityAction() return the value</li>
* <li>booleanAction() return a Boolean representing true or false values of the String value</li>
* <li>integerAction() returns an Integer for the String value, which must be a decimal integer</li>
* <li>stringAction() returns the String value</li>
* <li>classAction() returns a class for the String value, as loaded by the ORB classloader</li>
* <li>setFlagAction() always return Boolean.TRUE</li>
* <li>URLAction() returns a java.net.URL for the String value, which must be a valid URL</li>
* <li>integerRangeAction( int min, int max ) returns an Integer for the String value, which must be a
* decimal integer in the range min to max inclusive</li>
* <li>listAction( String sep, Operation ) tokenizes the String value with sep as separator, then
* applies the Operation to each token, and returns an array of the result</li>
* <li>sequenceAction( String, Operation[] ) tokenizes the String value with sep as separator, then
* applies each Operation in the Operation array to successive tokens, and returns an array of the results</li>
* <li>compose( Operation op1, Operation op2 ) is the operation that applies op2 to the result of applying
* op1 to the value</li>
* <li>mapAction( Operation ) applies the Operation to each element of an array of objects, and returns
* an array of the results</li>
* <li>mapSequenceAction( Operation[] ) applies the corresponding element of the Operation array to an
* element of the Object[] value, and returns an array of the results</li>
* <li>convertIntegerToShort coerces an Integer into a Short.</li>
* </ul>
* Other operations can be directly defined, and combined using these basic operations.
*/
