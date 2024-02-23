# From Classes to Docs

The goal of this example is to integrate what we have learned so far:
 - show you how to use your classes in packages,
 - import them, create relationships among your classes and interfaces,
 -  and how casting and dynamic dispatch were there all along.

We now do a traversal of every week to culminate in the Java docs, the official one. A quick refresher of what we have done so far and how it builds up to understanding the pages such:

[https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html)

## The directories

The root directory for the example is `week06`, which contains the directories `day22` and and `day23`.

## The Java files

There are 4 Java files: `C.java` in `day23/` and `A.java`, `B.java`, and `C.java` in `day22/`

## The workflow

The main flow we do in programming is the edit-compile-run cycle. Open your operating system comand line interface (CLI): Unix-Based terminal (Linux, MacOS) or command prompt (Windows).

**Remember:** The `week06` must be directly contained within your current directory for the following commands to work.

### Download the files and locate them

Use finder or you window file manager to locate the `week06` directory.

### Locate the files in your CLI
In the terminal make sure you are at the right path with:

**[Terminal]** 
```sh
pwd
```

**[CMD]** 
```sh
cd
```

If so, the directory `week06` should be listed after this command:

**[Terminal]** 

```sh
ls
```

**[CMD]** 

```sh
dir
```

### Editing files

You can access any of the files with the commands:

**[Terminal]** 

```sh
 vim week06/day22/A.java
 vim week06/day22/B.java
 vim week06/day22/Able.java
 vim week06/day23/C.java
```
In Windows, try NotePad++ since it lacks a decent CLI text editor. You can also use IDEs such as VSCode or IntelliJ. However, limited them to the **editing part**. Do compilation and run via OS CLI, remember what happened to me in class =(. You don't want to happen in your interview!

### Compiling Java files

This was the compilation command I **forgot** Thursday morning. I went with the classpath route as I am used to `mvn` I could not snap out of it. It is is to forget your frame of reference =(. ChatGPT did not save me =#.

**[Terminal]** 
```sh
javac week06/**/*.java
```

**[CMD]** 
```sh
javac week06\**\*.java
```

### Running your source code

**[Terminal]** 

```sh
java week06/day22/A
```

**[CMD]** 

```sh
java week06\day22\A
```

### Generating the docs

**[Terminal]** 

```sh
javadoc week06/**/*.java -d week06/docs
```

**[CMD]** 

```sh
javadoc week06\**\*.java -d week06/docs
```

## Donzo Gonzo

Please peruse the files to locate the classes, inheritance and interface syntax examples.

Go to `docs/index.html` to check your Java Docs, and we are done =P.
