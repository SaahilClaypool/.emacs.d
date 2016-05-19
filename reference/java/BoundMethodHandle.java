_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static final SpeciesData SPECIES_DATA = SpeciesData.EMPTY;

    /**
     * All subclasses must provide such a value describing their type signature.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        private static String makeFieldName(String types, int index) {

        /**
         * Field names in concrete BMHs adhere to this pattern:
         * arg + type + index
         * where type is a single character (L, I, J, F, D).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {

        /**
         * Generate a concrete subclass of BMH for a given combination of bound types.
         *
         * A concrete BMH species adheres to the following schema:
         *
         * <pre>
         * class Species_[[types]] extends BoundMethodHandle {
         *     [[fields]]
         *     final SpeciesData speciesData() { return SpeciesData.get("[[types]]"); }
         * }
         * </pre>
         *
         * The {@code [[types]]} signature is precisely the string that is passed to this
         * method.
         *
         * The {@code [[fields]]} section consists of one field definition per character in
         * the type signature, adhering to the naming schema described in the definition of
         * {@link #makeFieldName}.
         *
         * For example, a concrete BMH species for two reference and one integral bound values
         * would have the following shape:
         *
         * <pre>
         * class BoundMethodHandle { ... private static
         * final class Species_LLI extends BoundMethodHandle {
         *     final Object argL0;
         *     final Object argL1;
         *     final int argI2;
         *     private Species_LLI(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         super(mt, lf);
         *         this.argL0 = argL0;
         *         this.argL1 = argL1;
         *         this.argI2 = argI2;
         *     }
         *     final SpeciesData speciesData() { return SPECIES_DATA; }
         *     final int fieldCount() { return 3; }
         *     static final SpeciesData SPECIES_DATA = SpeciesData.getForClass("LLI", Species_LLI.class);
         *     static BoundMethodHandle make(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object narg) {
         *         return SPECIES_DATA.extendWith(L_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendI(MethodType mt, LambdaForm lf, int narg) {
         *         return SPECIES_DATA.extendWith(I_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendJ(MethodType mt, LambdaForm lf, long narg) {
         *         return SPECIES_DATA.extendWith(J_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendF(MethodType mt, LambdaForm lf, float narg) {
         *         return SPECIES_DATA.extendWith(F_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     public final BoundMethodHandle copyWithExtendD(MethodType mt, LambdaForm lf, double narg) {
         *         return SPECIES_DATA.extendWith(D_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         * }
         * </pre>
         *
         * @param types the type signature, wherein reference types are erased to 'L'
         * @return the generated concrete BMH class
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class Factory {

    /**
     * Generation of concrete BMH classes.
     *
     * A concrete BMH species is fit for binding a number of values adhering to a
     * given type pattern. Reference types are erased.
     *
     * BMH species are cached by type pattern.
     *
     * A BMH species has a number of fields with the concrete (possibly erased) types of
     * bound values. Setters are provided as an API in BMH. Getters are exposed as MHs,
     * which can be included as names in lambda forms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        NamedFunction getterFunction(int i) {

        /**
         * Return a {@link LambdaForm.Name} containing a {@link LambdaForm.NamedFunction} that
         * represents a MH bound to a generic invoker, which in turn forwards to the corresponding
         * getter.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class SpeciesData {

    /**
     * Meta-data wrapper for concrete BMH types.
     * Each BMH type corresponds to a given sequence of basic field types (LIJFD).
     * The fields are immutable; their values are fully specified at object construction.
     * Each BMH type supplies an array of getter functions which may be used in lambda forms.
     * A BMH is constructed by cloning a shorter BMH and adding one or more new field values.
     * The shortest possible BMH has zero fields; its class is SimpleMethodHandle.
     * BMH species are not interrelated by subtyping, even though it would appear that
     * a shorter BMH could serve as a supertype of a longer one which extends it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract int fieldCount();

    /**
     * Return the number of fields in this BMH.  Equivalent to speciesData().fieldCount().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract SpeciesData speciesData();

    /**
     * Return the {@link SpeciesData} instance representing this BMH species. All subclasses must provide a
     * static field containing this value, and they must accordingly implement this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static BoundMethodHandle makeReinvoker(MethodHandle target) {

    /**
     * A reinvoker MH has this form:
     * {@code lambda (bmh, arg*) { thismh = bmh[0]; invokeBasic(thismh, arg*) }}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
/*non-public*/ abstract class BoundMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which emulates an invoke instruction
 * on a predetermined argument.  The JVM dispatches to the correct method
 * when the handle is created, not when it is invoked.
 *
 * All bound arguments are encapsulated in dedicated species.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static final SpeciesData SPECIES_DATA = SpeciesData.EMPTY;

    /**
     * All subclasses must provide such a value describing their type signature.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        private static String makeFieldName(String types, int index) {

        /**
         * Field names in concrete BMHs adhere to this pattern:
         * arg + type + index
         * where type is a single character (L, I, J, F, D).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {

        /**
         * Generate a concrete subclass of BMH for a given combination of bound types.
         *
         * A concrete BMH species adheres to the following schema:
         *
         * <pre>
         * class Species_[[types]] extends BoundMethodHandle {
         *     [[fields]]
         *     final SpeciesData speciesData() { return SpeciesData.get("[[types]]"); }
         * }
         * </pre>
         *
         * The {@code [[types]]} signature is precisely the string that is passed to this
         * method.
         *
         * The {@code [[fields]]} section consists of one field definition per character in
         * the type signature, adhering to the naming schema described in the definition of
         * {@link #makeFieldName}.
         *
         * For example, a concrete BMH species for two reference and one integral bound values
         * would have the following shape:
         *
         * <pre>
         * class BoundMethodHandle { ... private static
         * final class Species_LLI extends BoundMethodHandle {
         *     final Object argL0;
         *     final Object argL1;
         *     final int argI2;
         *     private Species_LLI(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         super(mt, lf);
         *         this.argL0 = argL0;
         *         this.argL1 = argL1;
         *         this.argI2 = argI2;
         *     }
         *     final SpeciesData speciesData() { return SPECIES_DATA; }
         *     final int fieldCount() { return 3; }
         *     static final SpeciesData SPECIES_DATA = SpeciesData.getForClass("LLI", Species_LLI.class);
         *     static BoundMethodHandle make(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object narg) {
         *         return SPECIES_DATA.extendWith(L_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendI(MethodType mt, LambdaForm lf, int narg) {
         *         return SPECIES_DATA.extendWith(I_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendJ(MethodType mt, LambdaForm lf, long narg) {
         *         return SPECIES_DATA.extendWith(J_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendF(MethodType mt, LambdaForm lf, float narg) {
         *         return SPECIES_DATA.extendWith(F_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     public final BoundMethodHandle copyWithExtendD(MethodType mt, LambdaForm lf, double narg) {
         *         return SPECIES_DATA.extendWith(D_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         * }
         * </pre>
         *
         * @param types the type signature, wherein reference types are erased to 'L'
         * @return the generated concrete BMH class
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class Factory {

    /**
     * Generation of concrete BMH classes.
     *
     * A concrete BMH species is fit for binding a number of values adhering to a
     * given type pattern. Reference types are erased.
     *
     * BMH species are cached by type pattern.
     *
     * A BMH species has a number of fields with the concrete (possibly erased) types of
     * bound values. Setters are provided as an API in BMH. Getters are exposed as MHs,
     * which can be included as names in lambda forms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        NamedFunction getterFunction(int i) {

        /**
         * Return a {@link LambdaForm.Name} containing a {@link LambdaForm.NamedFunction} that
         * represents a MH bound to a generic invoker, which in turn forwards to the corresponding
         * getter.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class SpeciesData {

    /**
     * Meta-data wrapper for concrete BMH types.
     * Each BMH type corresponds to a given sequence of basic field types (LIJFD).
     * The fields are immutable; their values are fully specified at object construction.
     * Each BMH type supplies an array of getter functions which may be used in lambda forms.
     * A BMH is constructed by cloning a shorter BMH and adding one or more new field values.
     * The shortest possible BMH has zero fields; its class is SimpleMethodHandle.
     * BMH species are not interrelated by subtyping, even though it would appear that
     * a shorter BMH could serve as a supertype of a longer one which extends it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract int fieldCount();

    /**
     * Return the number of fields in this BMH.  Equivalent to speciesData().fieldCount().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract SpeciesData speciesData();

    /**
     * Return the {@link SpeciesData} instance representing this BMH species. All subclasses must provide a
     * static field containing this value, and they must accordingly implement this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static BoundMethodHandle makeReinvoker(MethodHandle target) {

    /**
     * A reinvoker MH has this form:
     * {@code lambda (bmh, arg*) { thismh = bmh[0]; invokeBasic(thismh, arg*) }}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
/*non-public*/ abstract class BoundMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which emulates an invoke instruction
 * on a predetermined argument.  The JVM dispatches to the correct method
 * when the handle is created, not when it is invoked.
 *
 * All bound arguments are encapsulated in dedicated species.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static final SpeciesData SPECIES_DATA = SpeciesData.EMPTY;

    /**
     * All subclasses must provide such a value describing their type signature.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        private static String makeFieldName(String types, int index) {

        /**
         * Field names in concrete BMHs adhere to this pattern:
         * arg + type + index
         * where type is a single character (L, I, J, F, D).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {

        /**
         * Generate a concrete subclass of BMH for a given combination of bound types.
         *
         * A concrete BMH species adheres to the following schema:
         *
         * <pre>
         * class Species_[[types]] extends BoundMethodHandle {
         *     [[fields]]
         *     final SpeciesData speciesData() { return SpeciesData.get("[[types]]"); }
         * }
         * </pre>
         *
         * The {@code [[types]]} signature is precisely the string that is passed to this
         * method.
         *
         * The {@code [[fields]]} section consists of one field definition per character in
         * the type signature, adhering to the naming schema described in the definition of
         * {@link #makeFieldName}.
         *
         * For example, a concrete BMH species for two reference and one integral bound values
         * would have the following shape:
         *
         * <pre>
         * class BoundMethodHandle { ... private static
         * final class Species_LLI extends BoundMethodHandle {
         *     final Object argL0;
         *     final Object argL1;
         *     final int argI2;
         *     private Species_LLI(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         super(mt, lf);
         *         this.argL0 = argL0;
         *         this.argL1 = argL1;
         *         this.argI2 = argI2;
         *     }
         *     final SpeciesData speciesData() { return SPECIES_DATA; }
         *     final int fieldCount() { return 3; }
         *     static final SpeciesData SPECIES_DATA = SpeciesData.getForClass("LLI", Species_LLI.class);
         *     static BoundMethodHandle make(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object narg) {
         *         return SPECIES_DATA.extendWith(L_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendI(MethodType mt, LambdaForm lf, int narg) {
         *         return SPECIES_DATA.extendWith(I_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendJ(MethodType mt, LambdaForm lf, long narg) {
         *         return SPECIES_DATA.extendWith(J_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendF(MethodType mt, LambdaForm lf, float narg) {
         *         return SPECIES_DATA.extendWith(F_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     public final BoundMethodHandle copyWithExtendD(MethodType mt, LambdaForm lf, double narg) {
         *         return SPECIES_DATA.extendWith(D_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         * }
         * </pre>
         *
         * @param types the type signature, wherein reference types are erased to 'L'
         * @return the generated concrete BMH class
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class Factory {

    /**
     * Generation of concrete BMH classes.
     *
     * A concrete BMH species is fit for binding a number of values adhering to a
     * given type pattern. Reference types are erased.
     *
     * BMH species are cached by type pattern.
     *
     * A BMH species has a number of fields with the concrete (possibly erased) types of
     * bound values. Setters are provided as an API in BMH. Getters are exposed as MHs,
     * which can be included as names in lambda forms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        NamedFunction getterFunction(int i) {

        /**
         * Return a {@link LambdaForm.Name} containing a {@link LambdaForm.NamedFunction} that
         * represents a MH bound to a generic invoker, which in turn forwards to the corresponding
         * getter.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class SpeciesData {

    /**
     * Meta-data wrapper for concrete BMH types.
     * Each BMH type corresponds to a given sequence of basic field types (LIJFD).
     * The fields are immutable; their values are fully specified at object construction.
     * Each BMH type supplies an array of getter functions which may be used in lambda forms.
     * A BMH is constructed by cloning a shorter BMH and adding one or more new field values.
     * The shortest possible BMH has zero fields; its class is SimpleMethodHandle.
     * BMH species are not interrelated by subtyping, even though it would appear that
     * a shorter BMH could serve as a supertype of a longer one which extends it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract int fieldCount();

    /**
     * Return the number of fields in this BMH.  Equivalent to speciesData().fieldCount().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract SpeciesData speciesData();

    /**
     * Return the {@link SpeciesData} instance representing this BMH species. All subclasses must provide a
     * static field containing this value, and they must accordingly implement this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static BoundMethodHandle makeReinvoker(MethodHandle target) {

    /**
     * A reinvoker MH has this form:
     * {@code lambda (bmh, arg*) { thismh = bmh[0]; invokeBasic(thismh, arg*) }}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
/*non-public*/ abstract class BoundMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which emulates an invoke instruction
 * on a predetermined argument.  The JVM dispatches to the correct method
 * when the handle is created, not when it is invoked.
 *
 * All bound arguments are encapsulated in dedicated species.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static final SpeciesData SPECIES_DATA = SpeciesData.EMPTY;

    /**
     * All subclasses must provide such a value describing their type signature.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        private static String makeFieldName(String types, int index) {

        /**
         * Field names in concrete BMHs adhere to this pattern:
         * arg + type + index
         * where type is a single character (L, I, J, F, D).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {

        /**
         * Generate a concrete subclass of BMH for a given combination of bound types.
         *
         * A concrete BMH species adheres to the following schema:
         *
         * <pre>
         * class Species_[[types]] extends BoundMethodHandle {
         *     [[fields]]
         *     final SpeciesData speciesData() { return SpeciesData.get("[[types]]"); }
         * }
         * </pre>
         *
         * The {@code [[types]]} signature is precisely the string that is passed to this
         * method.
         *
         * The {@code [[fields]]} section consists of one field definition per character in
         * the type signature, adhering to the naming schema described in the definition of
         * {@link #makeFieldName}.
         *
         * For example, a concrete BMH species for two reference and one integral bound values
         * would have the following shape:
         *
         * <pre>
         * class BoundMethodHandle { ... private static
         * final class Species_LLI extends BoundMethodHandle {
         *     final Object argL0;
         *     final Object argL1;
         *     final int argI2;
         *     private Species_LLI(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         super(mt, lf);
         *         this.argL0 = argL0;
         *         this.argL1 = argL1;
         *         this.argI2 = argI2;
         *     }
         *     final SpeciesData speciesData() { return SPECIES_DATA; }
         *     final int fieldCount() { return 3; }
         *     static final SpeciesData SPECIES_DATA = SpeciesData.getForClass("LLI", Species_LLI.class);
         *     static BoundMethodHandle make(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object narg) {
         *         return SPECIES_DATA.extendWith(L_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendI(MethodType mt, LambdaForm lf, int narg) {
         *         return SPECIES_DATA.extendWith(I_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendJ(MethodType mt, LambdaForm lf, long narg) {
         *         return SPECIES_DATA.extendWith(J_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendF(MethodType mt, LambdaForm lf, float narg) {
         *         return SPECIES_DATA.extendWith(F_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     public final BoundMethodHandle copyWithExtendD(MethodType mt, LambdaForm lf, double narg) {
         *         return SPECIES_DATA.extendWith(D_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         * }
         * </pre>
         *
         * @param types the type signature, wherein reference types are erased to 'L'
         * @return the generated concrete BMH class
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class Factory {

    /**
     * Generation of concrete BMH classes.
     *
     * A concrete BMH species is fit for binding a number of values adhering to a
     * given type pattern. Reference types are erased.
     *
     * BMH species are cached by type pattern.
     *
     * A BMH species has a number of fields with the concrete (possibly erased) types of
     * bound values. Setters are provided as an API in BMH. Getters are exposed as MHs,
     * which can be included as names in lambda forms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        NamedFunction getterFunction(int i) {

        /**
         * Return a {@link LambdaForm.Name} containing a {@link LambdaForm.NamedFunction} that
         * represents a MH bound to a generic invoker, which in turn forwards to the corresponding
         * getter.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class SpeciesData {

    /**
     * Meta-data wrapper for concrete BMH types.
     * Each BMH type corresponds to a given sequence of basic field types (LIJFD).
     * The fields are immutable; their values are fully specified at object construction.
     * Each BMH type supplies an array of getter functions which may be used in lambda forms.
     * A BMH is constructed by cloning a shorter BMH and adding one or more new field values.
     * The shortest possible BMH has zero fields; its class is SimpleMethodHandle.
     * BMH species are not interrelated by subtyping, even though it would appear that
     * a shorter BMH could serve as a supertype of a longer one which extends it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract int fieldCount();

    /**
     * Return the number of fields in this BMH.  Equivalent to speciesData().fieldCount().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract SpeciesData speciesData();

    /**
     * Return the {@link SpeciesData} instance representing this BMH species. All subclasses must provide a
     * static field containing this value, and they must accordingly implement this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static BoundMethodHandle makeReinvoker(MethodHandle target) {

    /**
     * A reinvoker MH has this form:
     * {@code lambda (bmh, arg*) { thismh = bmh[0]; invokeBasic(thismh, arg*) }}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
/*non-public*/ abstract class BoundMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which emulates an invoke instruction
 * on a predetermined argument.  The JVM dispatches to the correct method
 * when the handle is created, not when it is invoked.
 *
 * All bound arguments are encapsulated in dedicated species.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static final SpeciesData SPECIES_DATA = SpeciesData.EMPTY;

    /**
     * All subclasses must provide such a value describing their type signature.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        private static String makeFieldName(String types, int index) {

        /**
         * Field names in concrete BMHs adhere to this pattern:
         * arg + type + index
         * where type is a single character (L, I, J, F, D).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {

        /**
         * Generate a concrete subclass of BMH for a given combination of bound types.
         *
         * A concrete BMH species adheres to the following schema:
         *
         * <pre>
         * class Species_[[types]] extends BoundMethodHandle {
         *     [[fields]]
         *     final SpeciesData speciesData() { return SpeciesData.get("[[types]]"); }
         * }
         * </pre>
         *
         * The {@code [[types]]} signature is precisely the string that is passed to this
         * method.
         *
         * The {@code [[fields]]} section consists of one field definition per character in
         * the type signature, adhering to the naming schema described in the definition of
         * {@link #makeFieldName}.
         *
         * For example, a concrete BMH species for two reference and one integral bound values
         * would have the following shape:
         *
         * <pre>
         * class BoundMethodHandle { ... private static
         * final class Species_LLI extends BoundMethodHandle {
         *     final Object argL0;
         *     final Object argL1;
         *     final int argI2;
         *     private Species_LLI(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         super(mt, lf);
         *         this.argL0 = argL0;
         *         this.argL1 = argL1;
         *         this.argI2 = argI2;
         *     }
         *     final SpeciesData speciesData() { return SPECIES_DATA; }
         *     final int fieldCount() { return 3; }
         *     static final SpeciesData SPECIES_DATA = SpeciesData.getForClass("LLI", Species_LLI.class);
         *     static BoundMethodHandle make(MethodType mt, LambdaForm lf, Object argL0, Object argL1, int argI2) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
         *         return new Species_LLI(mt, lf, argL0, argL1, argI2);
         *     }
         *     final BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object narg) {
         *         return SPECIES_DATA.extendWith(L_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendI(MethodType mt, LambdaForm lf, int narg) {
         *         return SPECIES_DATA.extendWith(I_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendJ(MethodType mt, LambdaForm lf, long narg) {
         *         return SPECIES_DATA.extendWith(J_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     final BoundMethodHandle copyWithExtendF(MethodType mt, LambdaForm lf, float narg) {
         *         return SPECIES_DATA.extendWith(F_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         *     public final BoundMethodHandle copyWithExtendD(MethodType mt, LambdaForm lf, double narg) {
         *         return SPECIES_DATA.extendWith(D_TYPE).constructor().invokeBasic(mt, lf, argL0, argL1, argI2, narg);
         *     }
         * }
         * </pre>
         *
         * @param types the type signature, wherein reference types are erased to 'L'
         * @return the generated concrete BMH class
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class Factory {

    /**
     * Generation of concrete BMH classes.
     *
     * A concrete BMH species is fit for binding a number of values adhering to a
     * given type pattern. Reference types are erased.
     *
     * BMH species are cached by type pattern.
     *
     * A BMH species has a number of fields with the concrete (possibly erased) types of
     * bound values. Setters are provided as an API in BMH. Getters are exposed as MHs,
     * which can be included as names in lambda forms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
        NamedFunction getterFunction(int i) {

        /**
         * Return a {@link LambdaForm.Name} containing a {@link LambdaForm.NamedFunction} that
         * represents a MH bound to a generic invoker, which in turn forwards to the corresponding
         * getter.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static class SpeciesData {

    /**
     * Meta-data wrapper for concrete BMH types.
     * Each BMH type corresponds to a given sequence of basic field types (LIJFD).
     * The fields are immutable; their values are fully specified at object construction.
     * Each BMH type supplies an array of getter functions which may be used in lambda forms.
     * A BMH is constructed by cloning a shorter BMH and adding one or more new field values.
     * The shortest possible BMH has zero fields; its class is SimpleMethodHandle.
     * BMH species are not interrelated by subtyping, even though it would appear that
     * a shorter BMH could serve as a supertype of a longer one which extends it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract int fieldCount();

    /**
     * Return the number of fields in this BMH.  Equivalent to speciesData().fieldCount().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    /*non-public*/ abstract SpeciesData speciesData();

    /**
     * Return the {@link SpeciesData} instance representing this BMH species. All subclasses must provide a
     * static field containing this value, and they must accordingly implement this method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
    static BoundMethodHandle makeReinvoker(MethodHandle target) {

    /**
     * A reinvoker MH has this form:
     * {@code lambda (bmh, arg*) { thismh = bmh[0]; invokeBasic(thismh, arg*) }}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/BoundMethodHandle.java
/*non-public*/ abstract class BoundMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which emulates an invoke instruction
 * on a predetermined argument.  The JVM dispatches to the correct method
 * when the handle is created, not when it is invoked.
 *
 * All bound arguments are encapsulated in dedicated species.
 */
