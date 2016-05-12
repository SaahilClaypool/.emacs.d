_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public void terminate() {

    /**
     * Terminates this object.
     * Called only by outside, so do not need to call doStop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    protected abstract void doStop();

    /**
     * Called by this class to tell an implementation to do stop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public boolean rspOutgoing() {

    /**
     * Tells that a response is sent out for a received request.
     * @return the value of the termination flag:
     * <ul><code>true</code> if the connection is already being terminated,
     * <br><code>false</code> otherwise.</ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public boolean reqIncoming() {

    /**
     * Tells that a new request message is received.
     * A caller of this method should always call the method
     * <code>rspOutgoing</code> to inform that a response is sent out
     * for the received request.
     * @return the value of the termination flag:
     * <ul><code>true</code> if the connection is already being terminated,
     * <br><code>false</code> otherwise.</ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public void terminate() {

    /**
     * Terminates this object.
     * Called only by outside, so do not need to call doStop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    protected abstract void doStop();

    /**
     * Called by this class to tell an implementation to do stop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public boolean rspOutgoing() {

    /**
     * Tells that a response is sent out for a received request.
     * @return the value of the termination flag:
     * <ul><code>true</code> if the connection is already being terminated,
     * <br><code>false</code> otherwise.</ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/remote/internal/ServerCommunicatorAdmin.java
    public boolean reqIncoming() {

    /**
     * Tells that a new request message is received.
     * A caller of this method should always call the method
     * <code>rspOutgoing</code> to inform that a response is sent out
     * for the received request.
     * @return the value of the termination flag:
     * <ul><code>true</code> if the connection is already being terminated,
     * <br><code>false</code> otherwise.</ul>
     */
