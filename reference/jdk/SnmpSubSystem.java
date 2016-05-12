_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public String[] getModelNames();

    /**
     * Returns the set of model names that have been registered within the sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public int[] getModelIds();

    /**
     * Returns the set of model Ids that have been registered within the sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public SnmpModel getModel(int id) throws SnmpUnknownModelException;

    /**
     * Gets a model from this sub system.
     * @param id The model ID to get.
     * @return The model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public SnmpModel removeModel(int id) throws SnmpUnknownModelException;

    /**
     * Removes a model from this sub system.
     * @param id The model ID to remove.
     * @return The removed model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public void addModel(int id, SnmpModel model);

    /**
     * Adds a model to this sub system.
     * @param id The model ID.
     * @param model The model to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
public interface SnmpSubSystem {

/**
 * SNMP sub system interface. To allow engine framework integration, a sub system must implement this interface. A sub system is a model manager. Every model is identified by an ID. A sub system can retrieve a previously registered model using this ID.
 * <P> Every sub system is associated to its SNMP engine.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public String[] getModelNames();

    /**
     * Returns the set of model names that have been registered within the sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public int[] getModelIds();

    /**
     * Returns the set of model Ids that have been registered within the sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public SnmpModel getModel(int id) throws SnmpUnknownModelException;

    /**
     * Gets a model from this sub system.
     * @param id The model ID to get.
     * @return The model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public SnmpModel removeModel(int id) throws SnmpUnknownModelException;

    /**
     * Removes a model from this sub system.
     * @param id The model ID to remove.
     * @return The removed model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
    public void addModel(int id, SnmpModel model);

    /**
     * Adds a model to this sub system.
     * @param id The model ID.
     * @param model The model to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSubSystem.java
public interface SnmpSubSystem {

/**
 * SNMP sub system interface. To allow engine framework integration, a sub system must implement this interface. A sub system is a model manager. Every model is identified by an ID. A sub system can retrieve a previously registered model using this ID.
 * <P> Every sub system is associated to its SNMP engine.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
