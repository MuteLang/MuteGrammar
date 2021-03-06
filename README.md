MuteGrammar
===========

[ANTLR v4](https://github.com/antlr/antlr4) Grammar and interpreter for [aliceffekt](https://github.com/aliceffekt)'s [mute](https://github.com/aliceffekt/mute) scripting language.

## How to test

### Using the jar file

#### With a file as input

In a command line environment with Java 7 JRE installed, run :

```
java -jar MuteInterpreter.jar <filename>
```

Where ``<filename>`` is a text file containing valid mute code.

#### As an interactive interpreter

If the ``<filename>`` is omitted, an interactive mode starts instead, which allows you to enter Mute statements line by line and seeing the results.

```
C:\Users\Renaud\workspace\MuteGrammar>java -jar MuteInterpreter.jar

Mute Interactive Interpreter (version 1.0)
==========================================
Type exit to exit.

> a[1]
> a{"@",$}
1
> exit
Exiting.
```

### Using the ANTLR4 tools

- See "Getting Started" instructions at http://www.antlr.org/ to have the aliases ready
- antlr4 .\src\Mute.g4
- javac -d .\bin .\src\Mute*.java
- grun .\bin\Mute parse -gui 
- Enter mute script in console window followed by ^D (or ^Z in Windows)

## Status

The ``Mute.g4`` grammar will parse everything from the [official Mute benchmark](https://github.com/aliceffekt/mute/blob/master/mute.benchmark.txt) at the time of this writing.
``MuteInterpreter.jar`` supports everything except modules, but has low error tolerance. See ``demo.mute`` to see what's supported and tested for.

### Current parsing limitations

- Requires identifiers (names) to be at the beginning of a statement
- Statement fragments that follow a module declaration must obey standard condition/assignation/operation block structure, but mute may accept anything at all as per the current spec
- Identifiers must be ascii characters, unicode is not currently supported
- Mac-style carriage returns without line feeds are not supported
- The lexer will complain if it doesn't see an EOL before the EOF...