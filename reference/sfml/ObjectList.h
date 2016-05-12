_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  ObjectList operator+(ObjectList);

  /// Add two lists, second appended to first.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  bool isFull() const;

  /// Return true if list is full, else false.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  bool isEmpty() const;

  /// Return true if list is empty, else false.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  int getCount() const;

  /// Return count of number of objects in list.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  void clear();

  /// Clear list (setting count to 0).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  int remove(Object *p_o);

  /// Remove object pointer from list,
  /// Return 0 if found, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  int insert(Object *p_o);

  /// Insert object pointer in list.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  ObjectList &operator=(const ObjectList &rhs);

  /// Assignment operator (does deep copy).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
  ObjectList(const ObjectList &other);

  /// Copy contructor (does deep copy).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
 public:

  int count;                  ///< Count of objects in list.
  int max_count;              ///< Maximum objects in list (variable).
  Object **p_item;            ///< Array of pointers to objects.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//ObjectList.h
#ifndef __OBJECT_LIST_H__

///
/// A list of Objects
///
