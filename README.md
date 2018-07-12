According to JSR 376, the key goals of modularizing the Java SE platform are -
- Reliable configuration — Modularity provides mechanisms for explicitly declaring dependencies between modules in a manner that’s recognized both at compile time and execution time. The system can walk through these dependencies to determine the subset of all modules required to support your app.
- Strong encapsulation — The packages in a module are accessible to other modules only if the module explicitly exports them. Even then, another module cannot use those packages unless it explicitly states that it requires the other module’s capabilities. This improves platform security because fewer classes are accessible to potential attackers. You may find that considering modularity helps you come up with cleaner, more logical designs.
- Scalable Java platform — Previously, the Java platform was a monolith consisting of a massive number of packages, making it challenging to develop, maintain and evolve. It couldn’t be easily subsetted. The platform is now modularized into 95 modules (this number might change as Java evolves). You can create custom runtimes consisting of only modules you need for your apps or the devices you’re targeting. For example, if a device does not support GUIs, you could create a runtime that does not include the GUI modules, significantly reducing the runtime’s size.
- Greater platform integrity — Before Java 9, it was possible to use many classes in the platform that were not meant for use by an app’s classes. With strong encapsulation, these internal APIs are truly encapsulated and hidden from apps using the platform. This can make migrating legacy code to modularized Java 9 problematic if your code depends on internal APIs.
- Improved performance — The JVM uses various optimization techniques to improve application performance. JSR 376 indicates that these techniques are more effective when it’s known in advance that required types are located only in specific modules.



JSR 376 goals
- Reliable configuration
- Strong encapsulation —
- Scalable Java platform (runtime of 95 modules only)
- Greater platform integrity
- Improved performance
