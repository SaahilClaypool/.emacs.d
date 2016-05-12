_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  void setLogStepCount(bool log_step_count=true);

  /// Set prepend step count to log messages.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  void setLogTimeString(bool log_time_string=true);

  /// Set prepend time string to log messages.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  void setFlush(bool do_flush=true);

  /// Set flush of logfile after each write.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  int getLogLevel() const;

  /// Get logging level.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  void setLogLevel(int log_level);

  /// Set logging level.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  int writeLog(int log_level, const char *fmt, ...) const;

  /// Write to logfile.
  /// Only write if indicated log level >= LogManager log level.
  /// Supports printf() formatting of strings.
  /// Return number of bytes written (excluding prepends), -1 if error.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  int writeLog(const char *fmt, ...) const;

  /// Write to logfile.
  /// Supports printf() formatting of strings.
  /// Return number of bytes written (excluding prepends), -1 if error.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  void shutDown();

  /// Shut down LogManager (close logfile).
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  int startUp();

  /// Start up LogManager (open logfile "dragonfly.log").
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
  static LogManager &getInstance();

  /// Get the one and only instance of the LogManager.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
 public:

  LogManager();                      ///< Private since a singleton.
  LogManager (LogManager const&);    ///< Don't allow copy.
  void operator=(LogManager const&); ///< Don't allow assignment.
  bool do_flush;                ///< True if flush to disk after each write.
  FILE *p_f;                    ///< Pointer to logfile struct.
  int log_level;                ///< Logging level.
  bool log_time_string;		///< True if prepend time.
  bool log_step_count;		///< True if prepend step count.
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/Dragonfly/dragonfly//LogManager.h
#ifndef __LOG_MANAGER_H__

///
/// The log manager
/// 
