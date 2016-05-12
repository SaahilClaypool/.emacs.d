_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    public void waitThread(Thread worker, Runnable task)

    /**
     *  Wait until the task is completed on the worker
     *  thread.
     *
     * NEEDSDOC @param worker
     * NEEDSDOC @param task
     *
     * @throws InterruptedException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    public Thread run(Runnable task, int priority)

    /**
     * Will get a thread from the pool, execute the task
     *  and return the thread to the pool.
     *
     *  The return value is used only to wait for completion
     *
     *
     * NEEDSDOC @param task
     * @param priority if >0 the task will run with the given priority
     *  ( doesn't seem to be used in xalan, since it's allways the default )
     * @return  The thread that is running the task, can be used
     *          to wait for completion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    final class SafeThread extends Thread {

    /**
     * This class was introduced as a fix for CR 6607339.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
  public static class ThreadController

  /**
   * Thread controller utility class for incremental SAX source. Must
   * be overriden with a derived class to support thread pooling.
   *
   * All thread-related stuff is in this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
  private static ThreadController m_tpool = new ThreadController();

  /** The ThreadController pool   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
public class ThreadControllerWrapper

/**
 * A utility class that wraps the ThreadController, which is used
 * by IncrementalSAXSource for the incremental building of DTM.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    public void waitThread(Thread worker, Runnable task)

    /**
     *  Wait until the task is completed on the worker
     *  thread.
     *
     * NEEDSDOC @param worker
     * NEEDSDOC @param task
     *
     * @throws InterruptedException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    public Thread run(Runnable task, int priority)

    /**
     * Will get a thread from the pool, execute the task
     *  and return the thread to the pool.
     *
     *  The return value is used only to wait for completion
     *
     *
     * NEEDSDOC @param task
     * @param priority if >0 the task will run with the given priority
     *  ( doesn't seem to be used in xalan, since it's allways the default )
     * @return  The thread that is running the task, can be used
     *          to wait for completion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
    final class SafeThread extends Thread {

    /**
     * This class was introduced as a fix for CR 6607339.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
  public static class ThreadController

  /**
   * Thread controller utility class for incremental SAX source. Must
   * be overriden with a derived class to support thread pooling.
   *
   * All thread-related stuff is in this class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
  private static ThreadController m_tpool = new ThreadController();

  /** The ThreadController pool   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ThreadControllerWrapper.java
public class ThreadControllerWrapper

/**
 * A utility class that wraps the ThreadController, which is used
 * by IncrementalSAXSource for the incremental building of DTM.
 */
