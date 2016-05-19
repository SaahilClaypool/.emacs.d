_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/WeakIdentityHashMap.java
    private static class IdentityWeakReference<T> extends WeakReference<T> {

    /**
     * WeakReference where equals and hashCode are based on the
     * referent.  More precisely, two objects are equal if they are
     * identical or if they both have the same non-null referent.  The
     * hashCode is the value the original referent had.  Even if the
     * referent is cleared, the hashCode remains.  Thus, objects of
     * this class can be used as keys in hash-based maps and sets.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/WeakIdentityHashMap.java
/*

/**
 * <p>A map where keys are compared using identity comparison (like
 * IdentityHashMap) but where the presence of an object as a key in
 * the map does not prevent it being garbage collected (like
 * WeakHashMap).  This class does not implement the Map interface
 * because it is difficult to ensure correct semantics for iterators
 * over the entrySet().</p>
 *
 * <p>Because we do not implement Map, we do not copy the questionable
 * interface where you can call get(k) or remove(k) for any type of k,
 * which of course can only have an effect if k is of type K.</p>
 *
 * <p>This map does not support null keys.</p>
 */
