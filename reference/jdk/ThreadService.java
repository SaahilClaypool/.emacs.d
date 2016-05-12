_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
    public void submitTask(Runnable task) throws IllegalArgumentException {

    /**
     * Submit a task to be executed.
     * This implementation of TaskServer uses a thread pool to execute
     * the submitted tasks.
     * @param task The task to be executed.
     * @exception IllegalArgumentException if the submitted task is null.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
    public void submitTask(Task task) throws IllegalArgumentException {

    /**
     * Submit a task to be executed.
     * Once a task is submitted, it is guaranteed that either
     * {@link com.sun.jmx.snmp.tasks.Task#run() task.run()} or
     * {@link com.sun.jmx.snmp.tasks.Task#cancel() task.cancel()} will be called.
     * This implementation of TaskServer uses a thread pool to execute
     * the submitted tasks.
     * @param task The task to be executed.
     * @exception IllegalArgumentException if the submitted task is null.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
public class ThreadService implements TaskServer {

/**
 * This class implements a {@link com.sun.jmx.snmp.tasks.TaskServer} over
 * a thread pool.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
    public void submitTask(Runnable task) throws IllegalArgumentException {

    /**
     * Submit a task to be executed.
     * This implementation of TaskServer uses a thread pool to execute
     * the submitted tasks.
     * @param task The task to be executed.
     * @exception IllegalArgumentException if the submitted task is null.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
    public void submitTask(Task task) throws IllegalArgumentException {

    /**
     * Submit a task to be executed.
     * Once a task is submitted, it is guaranteed that either
     * {@link com.sun.jmx.snmp.tasks.Task#run() task.run()} or
     * {@link com.sun.jmx.snmp.tasks.Task#cancel() task.cancel()} will be called.
     * This implementation of TaskServer uses a thread pool to execute
     * the submitted tasks.
     * @param task The task to be executed.
     * @exception IllegalArgumentException if the submitted task is null.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/tasks/ThreadService.java
public class ThreadService implements TaskServer {

/**
 * This class implements a {@link com.sun.jmx.snmp.tasks.TaskServer} over
 * a thread pool.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 **/
