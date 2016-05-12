_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes an {@link MBeanServerNotificationFilter} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes an {@link MBeanServerNotificationFilter} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized boolean isNotificationEnabled(Notification notif)

    /**
     * Invoked before sending the specified notification to the listener.
     * <P>If:
     * <P>- the ObjectName of the concerned MBean is selected (explicitly OR
     * (implicitly and not explicitly deselected))
     * <P>AND
     * <P>- the type of the operation (registration or unregistration) is
     * selected
     * <P>then the notification is sent to the listener.
     *
     * @param notif  The notification to be sent.
     *
     * @return true if the notification has to be sent to the listener, false
     * otherwise.
     *
     * @exception IllegalArgumentException  if null parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized Vector<ObjectName> getDisabledObjectNames() {

    /**
     * Gets all the ObjectNames disabled.
     *
     * @return Vector of ObjectNames:
     * <P>- null means all ObjectNames are implicitly deselected, except the
     * ObjectNames explicitly selected
     * <P>- empty means all ObjectNames are selected, i.e. no ObjectName
     * deselected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized Vector<ObjectName> getEnabledObjectNames() {

    /**
     * Gets all the ObjectNames enabled.
     *
     * @return Vector of ObjectNames:
     * <P>- null means all ObjectNames are implicitly selected, except the
     * ObjectNames explicitly deselected
     * <P>- empty means all ObjectNames are deselected, i.e. no ObjectName
     * selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized void enableObjectName(ObjectName objectName)

    /**
     * Enables MBeanServerNotifications concerning given ObjectName.
     *
     * @param objectName  ObjectName of interest
     *
     * @exception IllegalArgumentException  if the given ObjectName is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized void enableAllObjectNames() {

    /**
     * Enables all MBeanServerNotifications (all ObjectNames are selected).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized void disableObjectName(ObjectName objectName)

    /**
     * Disables MBeanServerNotifications concerning given ObjectName.
     *
     * @param objectName  ObjectName no longer of interest
     *
     * @exception IllegalArgumentException  if the given ObjectName is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public synchronized void disableAllObjectNames() {

    /**
     * Disables any MBeanServerNotification (all ObjectNames are
     * deselected).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    public MBeanServerNotificationFilter() {

    /**
     * Creates a filter selecting all MBeanServerNotification notifications for
     * all ObjectNames.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    private List<ObjectName> deselectedNames = null;

    /**
     * @serial List of {@link ObjectName}s with no interest
     *         <ul>
     *         <li><code>null</code> means that all {@link ObjectName}s are implicitly deselected
     *         (check for explicit selections))</li>
     *         <li>Empty vector means that no {@link ObjectName} is explicitly deselected</li>
     *         </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    private List<ObjectName> selectedNames = new Vector<ObjectName>();

    /**
     * @serial List of {@link ObjectName}s of interest
     *         <ul>
     *         <li><code>null</code> means that all {@link ObjectName}s are implicitly selected
     *         (check for explicit deselections)</li>
     *         <li>Empty vector means that no {@link ObjectName} is explicitly selected</li>
     *         </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField selectedNames List List of {@link ObjectName}s of interest
     *         <ul>
     *         <li><code>null</code> means that all {@link ObjectName}s are implicitly selected
     *         (check for explicit deselections)</li>
     *         <li>Empty vector means that no {@link ObjectName} is explicitly selected</li>
     *         </ul>
     * @serialField deselectedNames List List of {@link ObjectName}s with no interest
     *         <ul>
     *         <li><code>null</code> means that all {@link ObjectName}s are implicitly deselected
     *         (check for explicit selections))</li>
     *         <li>Empty vector means that no {@link ObjectName} is explicitly deselected</li>
     *         </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/MBeanServerNotificationFilter.java
@SuppressWarnings("serial")  // serialVersionUID must be constant

/**
 * Filter for {@link MBeanServerNotification}.
 * This filter filters MBeanServerNotification notifications by
 * selecting the ObjectNames of interest and the operations (registration,
 * unregistration, both) of interest (corresponding to notification
 * types).
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>2605900539589789736L</code>.
 *
 * @since 1.5
 */
