_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int updateActive(Object *p_o, bool new_active);

  /// Re-position Object in SceneGraph to new activeness.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int updateVisible(Object *p_vo, bool new_visible);

  /// Re-position Object in SceneGraph to new visibility.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int updateSolidness(Object *p_o, Solidness new_solidness);

  /// Re-position Object in SceneGraph to new solidness.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int updateAltitude(Object *p_o, int new_alt);

  /// Re-position Object in SceneGraph to new altitude.
  /// Return 0 if ok, else -1.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  ObjectList inactiveObjects() const;

  /// Return all inactive Objects. Empty list if none.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  ObjectList visibleObjects(int altitude) const;

  /// Return all active, visible Objects at altitude. Empty list if none.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  ObjectList solidObjects() const;

  /// Return all active, solid Objects. Empty list if none.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  ObjectList activeObjects() const;

  /// Return all active Objects. Empty list if none.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int removeObject(Object *p_o);

  /// Remove Object from SceneGraph.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  int insertObject(Object *p_o);

  /// Insert Object into SceneGraph.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
  

  ObjectList active_objects;   ///< All active Objects.
  ObjectList solid_objects;    ///< Solid Objects.
  ObjectList visible_objects[MAX_ALTITUDE+1]; ///< Visible Objects.
  ObjectList inactive_objects; ///< All inactive Objects.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//SceneGraph.h
#ifndef __SCENE_GRAPH_H__

///
/// A scene graph
///
