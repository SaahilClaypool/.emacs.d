_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int unregisterInterest(Object *p_o, std::string event_type);

  /// Indicate no more interest in event. 
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int registerInterest(Object *p_o, std::string event_type);

  /// Indicate interest in event.
  /// Return 0 if ok, else -1.
  /// (Note, doesn't check to see if Object is already registered.)
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int onEvent(const Event *p_event) const;

  /// Send event to all interested Objects.
  /// Return count of number of events sent.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  bool isStarted() const;

  /// Return status of is_started (true when startUp() was successful).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual void shutDown();

  /// Shutdown Manager.  
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual int startUp();

  /// Startup Manager. 
  /// Return 0 if ok, else negative number.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  std::string getType() const;

  /// Get type identifier of Manager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  void setType(std::string type);

  /// Set type identifier of Manager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual bool isValid(std::string event_type) const;

  /// If handled, return true else false.
  /// (Base Manager always returns false.)
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
 

  std::string type;			 ///< Manager type identifier.
  int event_count;                       ///< Number of events.
  std::string event_name[MAX_EVENTS];	 ///< List of events.
  ObjectList obj_list[MAX_EVENTS];       ///< Objects interested in event.
  bool is_started;                       ///< True if startUp() succeeded
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
class Manager {

const int MAX_EVENTS = 100;	      ///< Max number of different events.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
#ifndef __MANAGER_H__

///
/// The base manager
///
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int unregisterInterest(Object *p_o, std::string event_type);

  /// Indicate no more interest in event. 
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int registerInterest(Object *p_o, std::string event_type);

  /// Indicate interest in event.
  /// Return 0 if ok, else -1.
  /// (Note, doesn't check to see if Object is already registered.)
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  int onEvent(const Event *p_event) const;

  /// Send event to all interested Objects.
  /// Return count of number of events sent.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  bool isStarted() const;

  /// Return status of is_started (true when startUp() was successful).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual void shutDown();

  /// Shutdown Manager.  
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual int startUp();

  /// Startup Manager. 
  /// Return 0 if ok, else negative number.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  std::string getType() const;

  /// Get type identifier of Manager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  void setType(std::string type);

  /// Set type identifier of Manager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
  virtual bool isValid(std::string event_type) const;

  /// Check if event is handled by this Manager.
  /// If handled, return true else false.
  /// (Base Manager always returns false.)
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
 

  std::string type;			 ///< Manager type identifier.
  int event_count;                       ///< Number of events.
  std::string event_name[MAX_EVENTS];	 ///< List of events.
  ObjectList obj_list[MAX_EVENTS];       ///< Objects interested in event.
  bool is_started;                       ///< True if startUp() succeeded
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
class Manager {

const int MAX_EVENTS = 100;	      ///< Max number of different events.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//Manager.h
#ifndef __MANAGER_H__

///
/// The base manager
///
