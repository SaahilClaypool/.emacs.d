_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/SerialCallbackContext.java
    private Thread thread;

    /**
     * Thread this context is in use by.
     * As this only works in one thread, we do not need to worry about thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/SerialCallbackContext.java
final class SerialCallbackContext {

/**
 * Context during upcalls from object stream to class-defined
 * readObject/writeObject methods.
 * Holds object currently being deserialized and descriptor for current class.
 *
 * This context keeps track of the thread it was constructed on, and allows
 * only a single call of defaultReadObject, readFields, defaultWriteObject
 * or writeFields which must be invoked on the same thread before the class's
 * readObject/writeObject method has returned.
 * If not set to the current thread, the getObj method throws NotActiveException.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/SerialCallbackContext.java
    private Thread thread;

    /**
     * Thread this context is in use by.
     * As this only works in one thread, we do not need to worry about thread-safety.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/SerialCallbackContext.java
final class SerialCallbackContext {

/**
 * Context during upcalls from object stream to class-defined
 * readObject/writeObject methods.
 * Holds object currently being deserialized and descriptor for current class.
 *
 * This context keeps track of the thread it was constructed on, and allows
 * only a single call of defaultReadObject, readFields, defaultWriteObject
 * or writeFields which must be invoked on the same thread before the class's
 * readObject/writeObject method has returned.
 * If not set to the current thread, the getObj method throws NotActiveException.
 */
