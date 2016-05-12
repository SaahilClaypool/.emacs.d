_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetObjectInputStream.java
    public ClassLoader getClassLoader() {

    /**
     * Returns the ClassLoader being used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetObjectInputStream.java
    @Override

    /**
     * Use the given ClassLoader rather than using the system class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetObjectInputStream.java
    public MLetObjectInputStream(InputStream in, MLet loader)

    /**
     * Loader must be non-null;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/loading/MLetObjectInputStream.java
class MLetObjectInputStream extends ObjectInputStream {

/**
 * This subclass of ObjectInputStream delegates loading of classes to
 * an existing MLetClassLoader.
 *
 * @since 1.5
 */
