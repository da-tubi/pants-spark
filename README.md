# Pants for Apache Spark based Projects
## bin/package
https://github.com/pantsbuild/pants/issues/15444

Pants does not support the runtime `scope`. For Databricks, there are a list of runtimes, and we should not assemble the runtime jars in the assembly jar.

## bin/run
```
$ bin/run
src/jvm/tubi:cat
src/jvm/tubi:dog
```

Shortcut:
```commandline
$ bin/run src/jvm/tubi:cat
```

Complete version:
```commandline
$ pants run src/jvm/tubi:dog
```
