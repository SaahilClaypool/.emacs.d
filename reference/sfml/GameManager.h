_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  int getStepCount() const;

  /// Return game loop step count.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  int getFrameTime() const;

  /// Return frame time.  
  /// Frame time is target time for each game loop, in milliseconds.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  bool getGameOver() const;

  /// Get game over status.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  void setGameOver(bool game_over=true);

  /// Set game over status to indicated value.
  /// If true (default), will stop game loop.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  void run();

  /// Run game loop.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  void shutDown();

  /// Shut down GameManager services.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  bool isValid(std::string event_name) const;

  /// Game manager only accepts step events.
  /// Return false if other event.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  int startUp();

  /// Startup all GameManager services.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  static GameManager &getInstance();

  /// Get the singleton instance of the GameManager.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
  

  GameManager();                      ///< Private since a singleton.
  GameManager (GameManager const&);   ///< Don't allow copy.
  void operator=(GameManager const&); ///< Don't allow assignment.
  bool game_over;           ///< True -> game loop should stop.
  int frame_time;           ///< Target time per game loop, in millisec.
  int step_count;           ///< Count of game loop iterations.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
const int FRAME_TIME_DEFAULT = 33;

/// Default frame time (game loop time) in milliseconds (33 ms == 30 f/s).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
const std::string CONFIG_FILENAME = "df-config.txt";

/// Dragonfly cofiguration file.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
namespace df {

#define DF_VERSION 4.2		/// Dragonfly version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//GameManager.h
#ifndef __GAME_MANAGER_H__

///
/// The game manager
///
