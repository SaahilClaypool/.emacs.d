_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public String toString();

    /**
     * Returns a string representation of this <code>OpenMBeanParameterInfo</code> instance.
     * <p>
     * The string representation consists of the name of this class (ie <code>javax.management.openmbean.OpenMBeanParameterInfo</code>),
     * the string representation of the name and open type of the described parameter,
     * and the string representation of its default, min, max and legal values.
     *
     * @return  a string representation of this <code>OpenMBeanParameterInfo</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public int hashCode();

    /**
     * Returns the hash code value for this <code>OpenMBeanParameterInfo</code> instance.
     * <p>
     * The hash code of an <code>OpenMBeanParameterInfo</code> instance is the sum of the hash codes
     * of all elements of information used in <code>equals</code> comparisons
     * (ie: its name, its <i>open type</i>, and its default, min, max and legal values).
     * <p>
     * This ensures that <code> t1.equals(t2) </code> implies that <code> t1.hashCode()==t2.hashCode() </code>
     * for any two <code>OpenMBeanParameterInfo</code> instances <code>t1</code> and <code>t2</code>,
     * as required by the general contract of the method
     * {@link Object#hashCode() Object.hashCode()}.
     * <p>
     *
     * @return  the hash code value for this <code>OpenMBeanParameterInfo</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean equals(Object obj);

    /**
     * Compares the specified <var>obj</var> parameter with this <code>OpenMBeanParameterInfo</code> instance for equality.
     * <p>
     * Returns <tt>true</tt> if and only if all of the following statements are true:
     * <ul>
     * <li><var>obj</var> is non null,</li>
     * <li><var>obj</var> also implements the <code>OpenMBeanParameterInfo</code> interface,</li>
     * <li>their names are equal</li>
     * <li>their open types are equal</li>
     * <li>their default, min, max and legal values are equal.</li>
     * </ul>
     * This ensures that this <tt>equals</tt> method works properly for <var>obj</var> parameters which are
     * different implementations of the <code>OpenMBeanParameterInfo</code> interface.
     * <br>&nbsp;
     * @param  obj  the object to be compared for equality with this <code>OpenMBeanParameterInfo</code> instance;
     *
     * @return  <code>true</code> if the specified object is equal to this <code>OpenMBeanParameterInfo</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean isValue(Object obj) ;

    /**
     * Tests whether <var>obj</var> is a valid value for the parameter
     * described by this <code>OpenMBeanParameterInfo</code> instance.
     *
     * @param obj the object to be tested.
     *
     * @return <code>true</code> if <var>obj</var> is a valid value
     * for the parameter described by this
     * <code>OpenMBeanParameterInfo</code> instance,
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean hasMaxValue() ;

    /**
     * Returns <tt>true</tt> if this parameter has a specified maximal
     * value, or <tt>false</tt> otherwise.
     *
     * @return true if there is a maximum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean hasMinValue() ;

    /**
     * Returns <tt>true</tt> if this parameter has a specified minimal
     * value, or <tt>false</tt> otherwise.
     *
     * @return true if there is a minimum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean hasLegalValues() ;

    /**
     * Returns <tt>true</tt> if this parameter has a specified set of
     * legal values, or <tt>false</tt> otherwise.
     *
     * @return true if there is a set of legal values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public boolean hasDefaultValue() ;

    /**
     * Returns <tt>true</tt> if this parameter has a specified default
     * value, or <tt>false</tt> otherwise.
     *
     * @return true if there is a default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public Comparable<?> getMaxValue() ;

    /**
     * Returns the maximal value for this parameter, if it has one, or
     * <tt>null</tt> otherwise.
     *
     * @return the maximum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public Comparable<?> getMinValue() ;

    /**
     * Returns the minimal value for this parameter, if it has one, or
     * <tt>null</tt> otherwise.
     *
     * @return the minimum value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public Set<?> getLegalValues() ;

    /**
     * Returns the set of legal values for this parameter, if it has
     * one, or <tt>null</tt> otherwise.
     *
     * @return the set of legal values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public Object getDefaultValue() ;

    /**
     * Returns the default value for this parameter, if it has one, or
     * <tt>null</tt> otherwise.
     *
     * @return the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public OpenType<?> getOpenType() ;

    /**
     * Returns the <i>open type</i> of the values of the parameter
     * described by this <tt>OpenMBeanParameterInfo</tt> instance.
     *
     * @return the open type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public String getName() ;

    /**
     * Returns the name of the parameter
     * described by this <tt>OpenMBeanParameterInfo</tt> instance.
     *
     * @return the name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
    public String getDescription() ;

    /**
     * Returns a human readable description of the parameter
     * described by this <tt>OpenMBeanParameterInfo</tt> instance.
     *
     * @return the description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenMBeanParameterInfo.java
public interface OpenMBeanParameterInfo {

/**
 * <p>Describes a parameter used in one or more operations or
 * constructors of an open MBean.</p>
 *
 * <p>This interface declares the same methods as the class {@link
 * javax.management.MBeanParameterInfo}.  A class implementing this
 * interface (typically {@link OpenMBeanParameterInfoSupport}) should
 * extend {@link javax.management.MBeanParameterInfo}.</p>
 *
 *
 * @since 1.5
 */
