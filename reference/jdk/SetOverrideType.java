_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    private int _value;

    /**
     * The field containing the value for this <code>SetOverrideType</code>
     * object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    protected SetOverrideType(int _value){

    /**
     * Constructs a <code>SetOverrideType</code> instance from an
     * <code>int</code>.
     * @param _value must be either <code>SET_OVERRIDE</code> or
     *        <code>ADD_OVERRIDE</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public static SetOverrideType from_int(int i)

    /**
     * Converts the given <code>int</code> to the corresponding
     * <code>SetOverrideType</code> instance.
     *
     * @param  i the <code>int</code> to convert; must be either
     *         <code>SetOverrideType._SET_OVERRIDE</code> or
     *         <code>SetOverrideType._ADD_OVERRIDE</code>
     * @return  the <code>SetOverrideType</code> instance whose value
     *       matches the given <code>int</code>
     * @exception  BAD_PARAM  if the given <code>int</code> does not
     *       match the value of
     *       any <code>SetOverrideType</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public int value() {

    /**
     * Retrieves the value of this <code>SetOverrideType</code> instance.
     *
     * @return  the <code>int</code> for this <code>SetOverrideType</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public static final SetOverrideType ADD_OVERRIDE = new SetOverrideType(_ADD_OVERRIDE);

    /**
     * The <code>SetOverrideType</code> constant for the enum value ADD_OVERRIDE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public static final SetOverrideType SET_OVERRIDE = new SetOverrideType(_SET_OVERRIDE);

    /**
     * The <code>SetOverrideType</code> constant for the enum value SET_OVERRIDE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public static final int _ADD_OVERRIDE = 1;

    /**
     * The <code>int</code> constant for the enum value ADD_OVERRIDE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
    public static final int _SET_OVERRIDE = 0;

    /**
     * The <code>int</code> constant for the enum value SET_OVERRIDE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/SetOverrideType.java
public class SetOverrideType implements org.omg.CORBA.portable.IDLEntity {

/**
 * The mapping of a CORBA <code>enum</code> tagging
 * <code>SET_OVERRIDE</code> and <code>ADD_OVERRIDE</code>, which
 * indicate whether policies should replace the
 * existing policies of an <code>Object</code> or be added to them.
 * <P>
 * The method {@link org.omg.CORBA.Object#_set_policy_override} takes
 * either <code>SetOverrideType.SET_OVERRIDE</code> or
 * <code>SetOverrideType.ADD_OVERRIDE</code> as its second argument.
 * The method <code>_set_policy_override</code>
 * creates a new <code>Object</code> initialized with the
 * <code>Policy</code> objects supplied as the first argument.  If the
 * second argument is <code>ADD_OVERRIDE</code>, the new policies
 * are added to those of the <code>Object</code> instance that is
 * calling the <code>_set_policy_override</code> method.  If
 * <code>SET_OVERRIDE</code> is given instead, the existing policies
 * are replaced with the given ones.
 *
 * @author OMG
 * @since   JDK1.2
 */
