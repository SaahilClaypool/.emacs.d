_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorSettingException.java
    public MonitorSettingException(String message) {

    /**
     * Constructor that allows an error message to be specified.
     *
     * @param message The specific error message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorSettingException.java
    public MonitorSettingException() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/monitor/MonitorSettingException.java
public class MonitorSettingException extends javax.management.JMRuntimeException {

/**
 * Exception thrown by the monitor when a monitor setting becomes invalid while the monitor is running.
 * <P>
 * As the monitor attributes may change at runtime, a check is performed before each observation.
 * If a monitor attribute has become invalid, a monitor setting exception is thrown.
 *
 *
 * @since 1.5
 */
