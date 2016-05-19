_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void disable();

    /**
     * Cause the Compiler to cease operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native void enable();

    /**
     * Cause the Compiler to resume operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native Object command(Object any);

    /**
     * Examines the argument type and its fields and perform some documented
     * operation.  No specific operations are required.
     *
     * @param  any
     *         An argument
     *
     * @return  A compiler-specific value, or {@code null} if no compiler is
     *          available
     *
     * @throws  NullPointerException
     *          If {@code any} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClasses(String string);

    /**
     * Compiles all classes whose name matches the specified string.
     *
     * @param  string
     *         The name of the classes to compile
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code string} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
    public static native boolean compileClass(Class<?> clazz);

    /**
     * Compiles the specified class.
     *
     * @param  clazz
     *         A class
     *
     * @return  {@code true} if the compilation succeeded; {@code false} if the
     *          compilation failed or no compiler is available
     *
     * @throws  NullPointerException
     *          If {@code clazz} is {@code null}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//Compiler.java
public final class Compiler  {

/**
 * The {@code Compiler} class is provided to support Java-to-native-code
 * compilers and related services. By design, the {@code Compiler} class does
 * nothing; it serves as a placeholder for a JIT compiler implementation.
 *
 * <p> When the Java Virtual Machine first starts, it determines if the system
 * property {@code java.compiler} exists. (System properties are accessible
 * through {@link System#getProperty(String)} and {@link
 * System#getProperty(String, String)}.  If so, it is assumed to be the name of
 * a library (with a platform-dependent exact location and type); {@link
 * System#loadLibrary} is called to load that library. If this loading
 * succeeds, the function named {@code java_lang_Compiler_start()} in that
 * library is called.
 *
 * <p> If no compiler is available, these methods do nothing.
 *
 * @author  Frank Yellin
 * @since   JDK1.0
 */
