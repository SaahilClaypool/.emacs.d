_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected int value ;

  /**
   * This variable keeps the integer form of the enumerated.
   * The string form is retrieved using getIntTable().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected abstract Hashtable<String,Integer> getStringTable() ;

  /**
   * Returns the hashtable of the string forms.
   * getStringTable().get(s) returns the integer form associated
   * to the string s.
   *
   * This method must be implemented by the derived class.
   *
   * @return An hashtable for read-only purpose
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected abstract Hashtable<Integer,String>  getIntTable() ;

  /**
   * Returns the hashtable of the integer forms.
   * getIntTable().get(x) returns the string form associated
   * to the integer x.
   *
   * This method must be implemented by the derived class.
   *
   * @return An hashtable for read-only purpose
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Returns the string form of this enumerated.
   *
   * @return The string for for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Returns the hash code for this enumerated.
   *
   * @return A hash code value for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Compares this enumerated to the specified enumerated.
   *
   * The result is true if and only if the argument is not null
   * and is of the same class.
   *
   * @param obj The object to compare with.
   *
   * @return True if this and obj are the same; false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumeration<String> valueStrings() {

  /**
   * Returns an Java enumeration of the permitted strings.
   *
   * @return An enumeration of String instances
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumeration<Integer> valueIndexes() {

  /**
   * Returns an Java enumeration of the permitted integers.
   *
   * @return An enumeration of Integer instances
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public int intValue() {

  /**
   * Return the integer form of the enumerated.
   *
   * @return The integer form
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(String valueString) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its string form.
   *
   * @param valueString The string form.
   * @exception IllegalArgumentException One of the arguments passed
   *  to the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(Integer valueIndex) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its Integer form.
   *
   * @param valueIndex The Integer form.
   * @exception IllegalArgumentException One of the arguments passed to
   *            the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(int valueIndex) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its integer form.
   *
   * @param valueIndex The integer form.
   * @exception IllegalArgumentException One of the arguments passed to
   *            the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated() throws IllegalArgumentException {

  /**
   * Construct an enumerated with a default value.
   * The default value is the first available in getIntTable().
    * @exception IllegalArgumentException One of the arguments passed to the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
abstract public class Enumerated  implements Serializable {

/** This class is used for implementing enumerated values.
 *
 * An enumeration is represented by a class derived from Enumerated.
 * The derived class defines what are the permitted values in the enumeration.
 *
 * An enumerated value is represented by an instance of the derived class.
 * It can be represented :
 *  - as an integer
 *  - as a string
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected int value ;

  /**
   * This variable keeps the integer form of the enumerated.
   * The string form is retrieved using getIntTable().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected abstract Hashtable<String,Integer> getStringTable() ;

  /**
   * Returns the hashtable of the string forms.
   * getStringTable().get(s) returns the integer form associated
   * to the string s.
   *
   * This method must be implemented by the derived class.
   *
   * @return An hashtable for read-only purpose
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  protected abstract Hashtable<Integer,String>  getIntTable() ;

  /**
   * Returns the hashtable of the integer forms.
   * getIntTable().get(x) returns the string form associated
   * to the integer x.
   *
   * This method must be implemented by the derived class.
   *
   * @return An hashtable for read-only purpose
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Returns the string form of this enumerated.
   *
   * @return The string for for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Returns the hash code for this enumerated.
   *
   * @return A hash code value for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  @Override

  /**
   * Compares this enumerated to the specified enumerated.
   *
   * The result is true if and only if the argument is not null
   * and is of the same class.
   *
   * @param obj The object to compare with.
   *
   * @return True if this and obj are the same; false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumeration<String> valueStrings() {

  /**
   * Returns an Java enumeration of the permitted strings.
   *
   * @return An enumeration of String instances
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumeration<Integer> valueIndexes() {

  /**
   * Returns an Java enumeration of the permitted integers.
   *
   * @return An enumeration of Integer instances
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public int intValue() {

  /**
   * Return the integer form of the enumerated.
   *
   * @return The integer form
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(String valueString) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its string form.
   *
   * @param valueString The string form.
   * @exception IllegalArgumentException One of the arguments passed
   *  to the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(Integer valueIndex) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its Integer form.
   *
   * @param valueIndex The Integer form.
   * @exception IllegalArgumentException One of the arguments passed to
   *            the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated(int valueIndex) throws IllegalArgumentException {

  /**
   * Construct an enumerated from its integer form.
   *
   * @param valueIndex The integer form.
   * @exception IllegalArgumentException One of the arguments passed to
   *            the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
  public Enumerated() throws IllegalArgumentException {

  /**
   * Construct an enumerated with a default value.
   * The default value is the first available in getIntTable().
    * @exception IllegalArgumentException One of the arguments passed to the method is illegal or inappropriate.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Enumerated.java
abstract public class Enumerated  implements Serializable {

/** This class is used for implementing enumerated values.
 *
 * An enumeration is represented by a class derived from Enumerated.
 * The derived class defines what are the permitted values in the enumeration.
 *
 * An enumerated value is represented by an instance of the derived class.
 * It can be represented :
 *  - as an integer
 *  - as a string
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
