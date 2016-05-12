_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public int hashCode() {

    /**
     * Produce identical numbers for similar <code>ActivationGroupDesc</code>s.
     * @return an integer
     * @see java.util.Hashtable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public boolean equals(Object obj) {

    /**
     * Compares two activation group descriptors for content equality.
     *
     * @param   obj     the Object to compare with
     * @return  true if these Objects are equal; false otherwise.
     * @see             java.util.Hashtable
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        private void readObject(ObjectInputStream in)

        /**
         * <code>readObject</code> for custom serialization.
         *
         * <p>This method reads this object's serialized form for this
         * class as follows:
         *
         * <p>This method first invokes <code>defaultReadObject</code> on
         * the specified object input stream, and if <code>options</code>
         * is <code>null</code>, then <code>options</code> is set to a
         * zero-length array of <code>String</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        public int hashCode()

        /**
         * Return identical values for similar
         * <code>CommandEnvironment</code>s.
         * @return an integer
         * @see java.util.Hashtable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        public boolean equals(Object obj) {

        /**
         * Compares two command environments for content equality.
         *
         * @param       obj     the Object to compare with
         * @return      true if these Objects are equal; false otherwise.
         * @see         java.util.Hashtable
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        public String[] getCommandOptions() {

        /**
         * Fetch the configured java command options.
         *
         * @return An array of the command options which will be passed
         * to the new child command by rmid.
         * Note that rmid may add other options before or after these
         * options, or both.
         * Never returns <code>null</code>.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        public String getCommandPath() {

        /**
         * Fetch the configured path-qualified java command name.
         *
         * @return the configured name, or <code>null</code> if configured to
         * accept the default
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        public CommandEnvironment(String cmdpath,
                                  String[] argv)

        /**
         * Create a CommandEnvironment with all the necessary
         * information.
         *
         * @param cmdpath the name of the java executable, including
         * the full path, or <code>null</code>, meaning "use rmid's default".
         * The named program <em>must</em> be able to accept multiple
         * <code>-Dpropname=value</code> options (as documented for the
         * "java" tool)
         *
         * @param argv extra options which will be used in creating the
         * ActivationGroup.  Null has the same effect as an empty
         * list.
         * @since 1.2
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        private String[] options;

        /**
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
        private String command;

        /**
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public static class CommandEnvironment implements Serializable {

    /**
     * Startup options for ActivationGroup implementations.
     *
     * This class allows overriding default system properties and
     * specifying implementation-defined options for ActivationGroups.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public CommandEnvironment getCommandEnvironment() {

    /**
     * Returns the group's command-environment control object.
     * @return the command-environment object, or <code>null</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public Properties getPropertyOverrides() {

    /**
     * Returns the group's property-override list.
     * @return the property-override list, or <code>null</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public MarshalledObject<?> getData() {

    /**
     * Returns the group's initialization data.
     * @return the group's initialization data
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public String getLocation() {

    /**
     * Returns the group's code location.
     * @return the group's code location
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public String getClassName() {

    /**
     * Returns the group's class name (possibly <code>null</code>).  A
     * <code>null</code> group class name indicates the system's default
     * <code>ActivationGroup</code> implementation.
     * @return the group's class name
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public ActivationGroupDesc(String className,
                               String location,
                               MarshalledObject<?> data,
                               Properties overrides,
                               CommandEnvironment cmd)

    /**
     * Specifies an alternate group implementation and execution
     * environment to be used for the group.
     *
     * @param className the group's package qualified class name or
     * <code>null</code>. A <code>null</code> group class name indicates
     * the system's default <code>ActivationGroup</code> implementation.
     * @param location the location from where to load the group's
     * class
     * @param data the group's initialization data contained in
     * marshalled form (could contain properties, for example)
     * @param overrides a properties map which will override those set
     * by default in the subprocess environment (will be translated
     * into <code>-D</code> options), or <code>null</code>.
     * @param cmd the controlling options for executing the VM in
     * another process (or <code>null</code>).
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    public ActivationGroupDesc(Properties overrides,
                               CommandEnvironment cmd)

    /**
     * Constructs a group descriptor that uses the system defaults for group
     * implementation and code location.  Properties specify Java
     * environment overrides (which will override system properties in
     * the group implementation's VM).  The command
     * environment can control the exact command/options used in
     * starting the child VM, or can be <code>null</code> to accept
     * rmid's default.
     *
     * <p>This constructor will create an <code>ActivationGroupDesc</code>
     * with a <code>null</code> group class name, which indicates the system's
     * default <code>ActivationGroup</code> implementation.
     *
     * @param overrides the set of properties to set when the group is
     * recreated.
     * @param cmd the controlling options for executing the VM in
     * another process (or <code>null</code>).
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private static final long serialVersionUID = -4936225423168276595L;

    /** indicate compatibility with the Java 2 SDK v1.2 version of class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private Properties props;

    /**
     * @serial A properties map which will override those set
     * by default in the subprocess environment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private CommandEnvironment env;

    /**
     * @serial The controlling options for executing the VM in
     * another process.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private MarshalledObject<?> data;

    /**
     * @serial The group's initialization data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private String location;

    /**
     * @serial The location from where to load the group's class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
    private String className;

    /**
     * @serial The group's fully package qualified class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/ActivationGroupDesc.java
public final class ActivationGroupDesc implements Serializable {

/**
 * An activation group descriptor contains the information necessary to
 * create/recreate an activation group in which to activate objects.
 * Such a descriptor contains: <ul>
 * <li> the group's class name,
 * <li> the group's code location (the location of the group's class), and
 * <li> a "marshalled" object that can contain group specific
 * initialization data. </ul> <p>
 *
 * The group's class must be a concrete subclass of
 * <code>ActivationGroup</code>. A subclass of
 * <code>ActivationGroup</code> is created/recreated via the
 * <code>ActivationGroup.createGroup</code> static method that invokes
 * a special constructor that takes two arguments: <ul>
 *
 * <li> the group's <code>ActivationGroupID</code>, and
 * <li> the group's initialization data (in a
 * <code>java.rmi.MarshalledObject</code>)</ul><p>
 *
 * @author      Ann Wollrath
 * @since       1.2
 * @see         ActivationGroup
 * @see         ActivationGroupID
 */
