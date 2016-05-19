_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/activation/ProcessMonitorThread.java
public class ProcessMonitorThread extends java.lang.Thread {

/** ProcessMonitorThread is started when ServerManager is instantiated. The
  * thread wakes up every minute (This can be changed by setting sleepTime) and
  * makes sure that all the processes (Servers) registered with the ServerTool
  * are healthy. If not the state in ServerTableEntry will be changed to
  * De-Activated.
  * Note: This thread can be killed from the main thread by calling
  *       interrupThread()
  */
