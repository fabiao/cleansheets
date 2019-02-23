                 --===========--
                   CleanSheets
                 --===========--

                   Version 1.4b

                Copyright (c) 2005
          Einar Pehrson <cs@pehrson.nu>
          http://csheets.sourceforge.net


                 TABLE OF CONTENTS
                 =================
                 1. Description
                 2. Package contents
                 3. Running the program
                 4. System requirements
                 5. License
                 6. Links


1. DESCRIPTION
=============
CleanSheets is the first spreadsheet application that is both extensible and
platform-independent. It features a formula language that closely resembles
that of Microsoft Excel, and extensions for aiding end-user programmers. The
application is based on the ANTLR compiler [1] generator and the JFC/Swing
JTable component.

2. PACKAGE CONTENTS
===================
bin - Contains scripts for performing various common actions
lib - Contains the application's JAR package and the supporting libraries
res - Contains resources necessary when compiling and running from source
src - Contains complete source code

3. RUNNING THE PROGRAM
======================
In the bin directory, use either a run script to run CleanSheets from its JAR
package or use a build script to compile and run it from the included source
code.

4. SYSTEM REQUIREMENTS
======================
CleanSheets requires the Java 2 Platform Standard Edition 5.0 [2]. Also
required is the included library for the ANTLR compiler generator
(lib/antlr.jar).

5. LICENSE
==========
CleanSheets is free software, available under the terms of the GNU General
Public License (see COPYING.txt). The ANTLR library, developed by Terence Parr,
is in the public domain. Some graphics from Sun's Java Look And Feel Graphics
Repository [3] are also included (see jlfgr.txt).

In accordance with the interpretation of the GNU GPL FAQ [4], CleanSheets
extensions must be released under the GPL or a GPL-compatible free software
license. Consult the source files of each extension for details.

6. LINKS
========
[1] http://www.antlr.org/
[2] http://java.sun.com/j2se/1.5.0/download.jsp
[3] http://java.sun.com/developer/techDocs/hi/repository
[4] http://www.gnu.org/licenses/gpl-faq.html#GPLAndPlugins
