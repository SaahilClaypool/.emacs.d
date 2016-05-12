_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Shutdown.java
    static void add(int slot, boolean registerShutdownInProgress, Runnable hook) {

    /**
     * Add a new shutdown hook.  Checks the shutdown state and the hook itself,
     * but does not do any security checks.
     *
     * The registerShutdownInProgress parameter should be false except
     * registering the DeleteOnExitHook since the first file may
     * be added to the delete on exit list by the application shutdown
     * hooks.
     *
     * @params slot  the slot in the shutdown hook array, whose element
     *               will be invoked in order during shutdown
     * @params registerShutdownInProgress true to allow the hook
     *               to be registered even if the shutdown is in progress.
     * @params hook  the hook to be registered
     *
     * @throw IllegalStateException
     *        if registerShutdownInProgress is false and shutdown is in progress; or
     *        if registerShutdownInProgress is true and the shutdown process
     *           already passes the given slot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Shutdown.java
class Shutdown {

/**
 * Package-private utility class containing data structures and logic
 * governing the virtual-machine shutdown sequence.
 *
 * @author   Mark Reinhold
 * @since    1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Shutdown.java
    static void add(int slot, boolean registerShutdownInProgress, Runnable hook) {

    /**
     * Add a new shutdown hook.  Checks the shutdown state and the hook itself,
     * but does not do any security checks.
     *
     * The registerShutdownInProgress parameter should be false except
     * registering the DeleteOnExitHook since the first file may
     * be added to the delete on exit list by the application shutdown
     * hooks.
     *
     * @params slot  the slot in the shutdown hook array, whose element
     *               will be invoked in order during shutdown
     * @params registerShutdownInProgress true to allow the hook
     *               to be registered even if the shutdown is in progress.
     * @params hook  the hook to be registered
     *
     * @throw IllegalStateException
     *        if registerShutdownInProgress is false and shutdown is in progress; or
     *        if registerShutdownInProgress is true and the shutdown process
     *           already passes the given slot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/Shutdown.java
class Shutdown {

/**
 * Package-private utility class containing data structures and logic
 * governing the virtual-machine shutdown sequence.
 *
 * @author   Mark Reinhold
 * @since    1.3
 */
