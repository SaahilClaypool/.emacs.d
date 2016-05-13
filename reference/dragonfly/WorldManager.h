_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  SceneGraph &getSceneGraph() const;

  /// Return reference to SceneGraph.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setViewPosition(Vector view_pos);

  /// Set view to center screen on position view_pos.
  /// View edge will not go beyond world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int setViewFollowing(Object *p_new_view_following);

  /// Set view to center screen on Object.
  /// Set to NULL to stop following.
  /// If Object not legit, return -1 else return 0.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setView(Box new_view);

  /// Set player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Box getView() const;

  /// Get player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setBoundary(Box new_boundary);

  /// Set game world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Box getBoundary() const;

  /// Get game world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsInCircle(Circle circle) const;

  /// Return a list of all Objects in circle.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsOnLine(Line line) const;

  /// Return a list of all Objects on line from point1 to point2.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsInBox(Box box) const;

  /// Return list of all Objects in Box.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsAtPosition(Vector where) const;

  /// Return list of all Objects at position 'where'.  
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Object *objectWithId(int id) const;

  /// Return Object with indicated id.
  /// NULL if Object is not found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList isCollision(const Object *p_o, Vector where) const;

  /// Return list of Objects collided with at position 'where'.
  /// Collisions only with solid Objects.
  /// Does not consider if p_o is solid or not.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int moveObject(Object *p_o, Vector where);

  /// Move Object. 
  /// If collision with solid, send collision events.
  /// If no collision with solid, move ok else don't move Object.
  /// If Object is Spectral, move ok.
  /// If move ok, adjust screen if following this Object.
  /// Return 0 if move ok, else -1 if collision with solid.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void draw();

  /// Draw all Objects in view.
  /// Draw bottom up, from 0 to MAX_ALTITUDE.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void update();

  /// Update world.
  /// Update positions of Objects based on their velocities.
  /// Lastly, delete Objects marked for deletion.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int markForDelete(Object *p_o);

  /// Indicate Object is to be deleted at end of current game loop.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList getAllObjects(bool inactive=false) const;

  /// Return list of all Objects in world.
  /// If inactive is true, include inactive Objects.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int removeObject(Object *p_o);

  /// Remove Object from world.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int insertObject(Object *p_o);

  /// Add Object to world.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  bool isValid(std::string event_type) const;

  /// Accept all user-defined events (returns true).
  /// Return false for other engine events.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void shutDown();

  /// Shutdown game world (delete all game world Objects).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int startUp();

  /// Startup game world (initialize everything to empty).
  /// Return 0.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
 public:

  WorldManager();               ///< Private since a singleton.
  WorldManager (WorldManager const&);  ///< Don't allow copy.
  void operator=(WorldManager const&); ///< Don't allow assignment.
  SceneGraph scene_graph;       ///< Storage for all Objects, game and view.
  ObjectList deletions;         ///< List of all Objects to delete.
  Object *p_view_following;     ///< Object view is following.
  Box boundary;                 ///< World boundary.
  Box view;                     ///< Player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
#ifndef __WORLD_MANAGER_H__

///
/// The game world manager
///
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  SceneGraph &getSceneGraph() const;

  /// Return reference to SceneGraph.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setViewPosition(Vector view_pos);

  /// Set view to center screen on position view_pos.
  /// View edge will not go beyond world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int setViewFollowing(Object *p_new_view_following);

  /// Set view to center screen on Object.
  /// Set to NULL to stop following.
  /// If Object not legit, return -1 else return 0.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setView(Box new_view);

  /// Set player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Box getView() const;

  /// Get player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void setBoundary(Box new_boundary);

  /// Set game world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Box getBoundary() const;

  /// Get game world boundary.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsInCircle(Circle circle) const;

  /// Return a list of all Objects in circle.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsOnLine(Line line) const;

  /// Return a list of all Objects on line from point1 to point2.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsInBox(Box box) const;

  /// Return list of all Objects in Box.
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList objectsAtPosition(Vector where) const;

  /// Return list of all Objects at position 'where'.  
  /// Does include bounding boxes. Return empty list if none found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  Object *objectWithId(int id) const;

  /// Return Object with indicated id.
  /// NULL if Object is not found.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList isCollision(const Object *p_o, Vector where) const;

  /// Return list of Objects collided with at position 'where'.
  /// Collisions only with solid Objects.
  /// Does not consider if p_o is solid or not.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int moveObject(Object *p_o, Vector where);

  /// Move Object. 
  /// If collision with solid, send collision events.
  /// If no collision with solid, move ok else don't move Object.
  /// If Object is Spectral, move ok.
  /// If move ok, adjust screen if following this Object.
  /// Return 0 if move ok, else -1 if collision with solid.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void draw();

  /// Draw all Objects in view.
  /// Draw bottom up, from 0 to MAX_ALTITUDE.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void update();

  /// Update world.
  /// Update positions of Objects based on their velocities.
  /// Lastly, delete Objects marked for deletion.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int markForDelete(Object *p_o);

  /// Indicate Object is to be deleted at end of current game loop.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  ObjectList getAllObjects(bool inactive=false) const;

  /// Return list of all Objects in world.
  /// If inactive is true, include inactive Objects.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int removeObject(Object *p_o);

  /// Remove Object from world.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int insertObject(Object *p_o);

  /// Add Object to world.
  /// Return 0 if ok, else -1.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  bool isValid(std::string event_type) const;

  /// Accept all user-defined events (returns true).
  /// Return false for other engine events.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  void shutDown();

  /// Shutdown game world (delete all game world Objects).
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  int startUp();

  /// Startup game world (initialize everything to empty).
  /// Return 0.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
  static WorldManager &getInstance();

  /// Get the one and only instance of the WorldManager.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
 public:

  WorldManager();               ///< Private since a singleton.
  WorldManager (WorldManager const&);  ///< Don't allow copy.
  void operator=(WorldManager const&); ///< Don't allow assignment.
  SceneGraph scene_graph;       ///< Storage for all Objects, game and view.
  ObjectList deletions;         ///< List of all Objects to delete.
  Object *p_view_following;     ///< Object view is following.
  Box boundary;                 ///< World boundary.
  Box view;                     ///< Player view of game world.
_func_
dragonfly
c:/Users/Saahil/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//WorldManager.h
#ifndef __WORLD_MANAGER_H__

///
/// The game world manager
///
