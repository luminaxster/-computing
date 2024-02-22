# From classes to Docs

We now do a traversal of every week to culminate in the Java docs, the official one. Aquick refresher of what we have done so far and how it builds up to understanding the pages such:

[https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html)

## The directories

The root directory for the example is `week06`, wich contains the directories `day22` and and `day23`.

## The Java files

There are 4 Java files: `C.java` in `day23/` and `A.java`, `B.java`, and `C.java` in `day22/`

## The workflow

The main flow we do in programming is the edit-compile-run cycle. Open a Unix-Based terminal (Linux, MacOS), the week06 must be directly contained within your current directory.

**I will update the docs for or command prompt (Windows) tomorrow (using my wife's Windows machine...). Meeanwhile use ChatGPT to translate the commands**

### Download the files and locate them

Use finder or you window file manager to locate the `week06` directory.

In the terminal make sure you are at the right path with:
```sh
pwd
```

If so, the directory `week06` should be listed with:
```sh
ls
```

### Editing files

You can access any of the files with the commands:

```sh
 vim week06/day22/A.java
 vim week06/day22/B.java
 vim week06/day22/Able.java
 vim week06/day23/C.java
```
### Compiling Java files

This was the compilation command I forgot in the morning. I went with the classpath route as I am used to `mvn`. It is is to forget your frame of reference =(. ChatGPT did not save =#.

```sh
javac week06/**/*.java
```

### Running your source code

```sh
java week06/day22/A
```

### Generating the doc

```sh
javadoc week06/**/*.java -d week06/docs
```

Go to `docs/index.html` and we are done =P.
