_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link ModelMBeanNotificationInfo} to an
     * {@link ObjectOutputStream}.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link ModelMBeanNotificationInfo} from an
     * {@link ObjectInputStream}.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    private Descriptor validDescriptor(final Descriptor in) throws RuntimeOperationsException {

    /**
     * Clones the passed in Descriptor, sets default values, and checks for validity.
     * If the Descriptor is invalid (for instance by having the wrong "name"),
     * this indicates programming error and a RuntimeOperationsException will be thrown.
     *
     * The following fields will be defaulted if they are not already set:
     * descriptorType="notification",displayName=this.getName(),
     * name=this.getName(),severity="6"
     *
     *
     * @param in Descriptor to be checked, or null which is equivalent to an
     * empty Descriptor.
     * @exception RuntimeOperationsException if Descriptor is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public String toString() {

    /**
     * Returns a human readable string containing
     * ModelMBeanNotificationInfo.
     *
     * @return a string describing this object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public void setDescriptor(Descriptor inDescriptor) {

    /**
     * Sets associated Descriptor (full replace) for the
     * ModelMBeanNotificationInfo If the new Descriptor is null,
     * then the associated Descriptor reverts to a default
     * descriptor.  The Descriptor is validated before it is
     * assigned.  If the new Descriptor is invalid, then a
     * RuntimeOperationsException wrapping an
     * IllegalArgumentException is thrown.
     *
     * @param inDescriptor replaces the Descriptor associated with the
     * ModelMBeanNotification interface
     *
     * @exception RuntimeOperationsException Wraps an
     * {@link IllegalArgumentException} for invalid Descriptor.
     *
     * @see #getDescriptor
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public Descriptor getDescriptor() {

    /**
     * Returns a copy of the associated Descriptor for the
     * ModelMBeanNotificationInfo.
     *
     * @return Descriptor associated with the
     * ModelMBeanNotificationInfo object.
     *
     * @see #setDescriptor
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public Object clone () {

    /**
     * Creates and returns a new ModelMBeanNotificationInfo which is a
     * duplicate of this ModelMBeanNotificationInfo.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public ModelMBeanNotificationInfo(ModelMBeanNotificationInfo inInfo) {

    /**
     * Constructs a new ModelMBeanNotificationInfo object from this
     * ModelMBeanNotfication Object.
     *
     * @param inInfo the ModelMBeanNotificationInfo to be duplicated
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public ModelMBeanNotificationInfo(String[] notifTypes,
                                      String name,
                                      String description,
                                      Descriptor descriptor) {

    /**
     * Constructs a ModelMBeanNotificationInfo object.
     *
     * @param notifTypes The array of strings (in dot notation)
     *        containing the notification types that may be emitted.
     * @param name The name of the Notification class.
     * @param description A human readable description of the Notification.
     *        Optional.
     * @param descriptor An instance of Descriptor containing the
     *        appropriate metadata for this instance of the
     *        MBeanNotificationInfo. If it is null a default descriptor
     *        will be created. If the descriptor does not contain the
     *        fields "displayName" or "severity",
     *        the missing ones are added with their default values.
     *
     * @exception RuntimeOperationsException Wraps an
     *    {@link IllegalArgumentException}. The descriptor is invalid, or
     *    descriptor field "name" is not equal to parameter name, or
     *    descriptor field "descriptorType" is not equal to "notification".
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    public ModelMBeanNotificationInfo(String[] notifTypes,
                                      String name,
                                      String description) {

    /**
     * Constructs a ModelMBeanNotificationInfo object with a default
     * descriptor.
     *
     * @param notifTypes The array of strings (in dot notation) containing
     *     the notification types that may be emitted.
     * @param name The name of the Notification class.
     * @param description A human readable description of the
     *     Notification. Optional.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    private Descriptor notificationDescriptor;

    /**
     * @serial The descriptor containing the appropriate metadata for
     *         this instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField notificationDescriptor Descriptor The descriptor
     *   containing the appropriate metadata for this instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/ModelMBeanNotificationInfo.java
@SuppressWarnings("serial")  // serialVersionUID is not constant

/**
 * <p>The ModelMBeanNotificationInfo object describes a notification emitted
 * by a ModelMBean.
 * It is a subclass of MBeanNotificationInfo with the addition of an
 * associated Descriptor and an implementation of the Descriptor interface.</p>
 *
 * <P id="descriptor">
 * The fields in the descriptor are defined, but not limited to, the following.
 * Note that when the Type in this table is Number, a String that is the decimal
 * representation of a Long can also be used.</P>
 *
 * <table border="1" cellpadding="5" summary="ModelMBeanNotificationInfo Fields">
 * <tr><th>Name</th><th>Type</th><th>Meaning</th></tr>
 * <tr><td>name</td><td>String</td>
 *     <td>Notification name.</td></tr>
 * <tr><td>descriptorType</td><td>String</td>
 *     <td>Must be "notification".</td></tr>
 * <tr><td>severity</td><td>Number</td>
 *     <td>0-6 where 0: unknown; 1: non-recoverable;
 *         2: critical, failure; 3: major, severe;
 *         4: minor, marginal, error; 5: warning;
 *         6: normal, cleared, informative</td></tr>
 * <tr><td>messageID</td><td>String</td>
 *     <td>Unique key for message text (to allow translation, analysis).</td></tr>
 * <tr><td>messageText</td><td>String</td>
 *     <td>Text of notification.</td></tr>
 * <tr><td>log</td><td>String</td>
 *     <td>T - log message, F - do not log message.</td></tr>
 * <tr><td>logfile</td><td>String</td>
 *     <td>fully qualified file name appropriate for operating system.</td></tr>
 * <tr><td>visibility</td><td>Number</td>
 *     <td>1-4 where 1: always visible 4: rarely visible.</td></tr>
 * <tr><td>presentationString</td><td>String</td>
 *     <td>XML formatted string to allow presentation of data.</td></tr>
 * </table>
 *
 * <p>The default descriptor contains the name, descriptorType,
 * displayName and severity(=6) fields.  The default value of the name
 * and displayName fields is the name of the Notification class (as
 * specified by the <code>name</code> parameter of the
 * ModelMBeanNotificationInfo constructor).</p>
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-7445681389570207141L</code>.
 *
 * @since 1.5
 */
