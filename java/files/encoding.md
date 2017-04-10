# Get rid of “unmappable character for encoding Cp1252” once and for all

Nowadays, many open source as well as commercially developed projects contain code that is UTF-8 encoded. More general it is very unlikely that you checkout some code from GIT, SVN or [insert arbitrary abbreviation here] that is actually encoded with Windows’ crappy default encoding. (In case of my western European system, that encoding would be Cp1252).

So, how many times have you seen the above error when compiling some Java code on a windows machine? And how many times have you wondered if there is a solution to set the file encoding in a global, system wide manner? Well, fortunately, there is a way to do that!

A quite simple procedure to globally set the file encoding for all JVMs is given in the answer by erickson in this stackoverflow question. All you need to do, is to specify a envirnoment variable called JAVA_TOOL_OPTIONS. If you set this variable to -Dfile.encoding=UTF8, everytime a JVM is started, it will pick up this information.

Obviously, you are able set other JVM parameters via JAVA_TOOL_OPTIONS as well. See the JVM documentation for more details. If you are interested in further details about character encodings in Java, check out this excellent article.