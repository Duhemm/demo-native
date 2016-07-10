```
> run
[info] Compiling 2 Scala sources to /Users/martin/Documents/Projects/Duhemm/demo-native/target/scala-2.11/classes...
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list

Multiple main classes detected, select one to run:

 [1] A
 [2] B
^JEnter number: 1

warning: overriding the module target triple with x86_64-apple-macosx10.11.0 [-Woverride-module]
1 warning generated.
Hello, native A!
[success] Total time: 8 s, completed Jul 10, 2016 1:16:39 PM
> run
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list

Multiple main classes detected, select one to run:

 [1] A
 [2] B
^JEnter number: 2

warning: overriding the module target triple with x86_64-apple-macosx10.11.0 [-Woverride-module]
1 warning generated.
Hello, native B!
[success] Total time: 2 s, completed Jul 10, 2016 1:16:42 PM
> set mainClass in Compile := Some("B")
[info] Defining compile:mainClass
[info] The new value will be used by compile:packageBin::packageOptions, compile:selectMainClass
[info] Reapplying settings...
[info] Set current project to demoNative (in build file:/Users/martin/Documents/Projects/Duhemm/demo-native/)
> run
warning: overriding the module target triple with x86_64-apple-macosx10.11.0 [-Woverride-module]
1 warning generated.
Hello, native B!
[success] Total time: 1 s, completed Jul 10, 2016 1:17:00 PM
```
